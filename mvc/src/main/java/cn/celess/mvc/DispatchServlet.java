package cn.celess.mvc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author : xiaohai
 * @date : 2020/09/11 17:04
 * @desc :
 */
public class DispatchServlet extends HttpServlet {

    public DispatchServlet() {
    }

    @Override
    public void init() throws ServletException {
        String contextConfigLocation = getServletContext().getInitParameter("contextConfigLocation");
        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(contextConfigLocation)) {
            Properties properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());
    }
}
