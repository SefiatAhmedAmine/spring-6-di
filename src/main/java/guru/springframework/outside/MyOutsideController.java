package guru.springframework.outside;

import org.springframework.stereotype.Controller;

@Controller
public class MyOutsideController {

    public String sayHello(){
        System.out.println("Inside sayHello method of MyOutsideController");
        return "Hello World";
    }

}
