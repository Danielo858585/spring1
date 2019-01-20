package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainPageController {

    @GetMapping ("/index")
    public String loadPage(){
        return "index";
    }


}
