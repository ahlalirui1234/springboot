package myspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @RequestMapping("test")
    public String test(){
        System.out.println("---test---");
        return "hello";
    }
}