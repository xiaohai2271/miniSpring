package cn.celess.mvc.util;


import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author : xiaohai
 * @date : 2020/09/21 14:43
 * @desc :
 */
public class ClassScan {
    public static final String CLASS_FILE = ".class";
    private static String basePath;

    public static Set<Class<?>> scan(Class<?> clazz) {
        return scan(clazz.getResource("/").getPath());
    }

    public static Set<Class<?>> scan(String path) {
        basePath = new File(path).getPath();
        path = path.replaceAll("\\.", File.separator);
        Set<Class<?>> classSet = new LinkedHashSet<>();
        readFile(new File(path), classSet);
        basePath = null;
        return classSet;
    }


    private static void readFile(File file, Set<Class<?>> classSet) {
        if (file.isDirectory()) {
            //文件夹我们就递归
            File[] files = file.listFiles();
            if (files == null) {
                return;
            }
            for (File f1 : files) {
                readFile(f1, classSet);
            }
        } else {
            //标准文件我们就判断是否是class文件
            if (file.getName().endsWith(CLASS_FILE)) {
                //如果是class文件我们就放入我们的集合中。
                Class<?> aClass = null;
                try {
                    String packagePath = file.getPath().replace(basePath, "").replace(File.separator, ".").replace(CLASS_FILE, "");
                    if (packagePath.startsWith(".")) {
                        packagePath = packagePath.replaceFirst("\\.", "");
                    }
                    aClass = Class.forName(packagePath);
                    classSet.add(aClass);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    //...
                }
            }
        }
    }
}
