package myspring;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class SpringApplication {
    public static void run() throws LifecycleException {
        File file = new File("D:\\springboot");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);

        tomcat.addWebapp("/", file.getAbsolutePath());
        tomcat.start();

        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(MyAppConfig.class);
        ac.refresh();

        // Create and register the DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(ac);
        Wrapper wrapper = tomcat.addServlet("/", "app", servlet);
        wrapper.setLoadOnStartup(1);
        wrapper.addMapping("/");
        /*ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");*/


        tomcat.getServer().await();
    }
}
