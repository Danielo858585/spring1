package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class MvcConfig implements WebMvcConfigurer {


    public void addViewControllers (ViewControllerRegistry registry){
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/album").setViewName("album");
        registry.addViewController("/result").setViewName("result");
        registry.addViewController("/login").setViewName("login");
    }
}
