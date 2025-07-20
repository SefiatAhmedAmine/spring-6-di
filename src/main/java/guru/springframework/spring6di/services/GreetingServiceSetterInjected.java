package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterInjectedService")
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String sayHello() {
        return "Hey I'm setting a Greeting!";
    }
}
