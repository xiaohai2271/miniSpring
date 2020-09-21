package cn.celess.mvc;

import cn.celess.mvc.util.ClassScan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * @author : xiaohai
 * @date : 2020/09/11 17:04
 * @desc :
 */
public class DispatchServlet extends HttpServlet {


    private String basePath = "";

    public DispatchServlet(String basePath) {
        this.basePath = basePath;
    }

    public DispatchServlet(Class<?> c) {
        this.basePath = c.getResource("/").getPath();
    }

    @Override
    public void init() throws ServletException {
        ClassScan.scan(basePath);
    }

    @Override
    public void destroy() {
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
