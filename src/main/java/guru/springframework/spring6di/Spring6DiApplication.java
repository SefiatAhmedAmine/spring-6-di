package guru.springframework.spring6di;

import guru.springframework.outside.MyOutsideController;
import guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Spring6DiApplication.class, args);
        System.out.println("Inside main method of SpringApplication");
        MyController myController = context.getBean(MyController.class);
        System.out.println(myController.sayHello());
        /*
         * this block of code will trigger a org.springframework.beans.factory.NoSuchBeanDefinitionException
         * because MyOutsideController is defined outside the package guru.springframework.spring6di,
         * and Spring Boot configures Spring to do annotation scan for components at guru.springframework.spring6di
         * (package where the SpringBootApplication main resides) and lower packages

         //        MyOutsideController myOutsideController = context.getBean(MyOutsideController.class);
         //        System.out.println(myOutsideController.sayHello());

         */

    }

}
