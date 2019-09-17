package com.xebia.greeting.hellointellij.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/")
    public GreetingModel greet(@RequestParam(required = false , name = "name", defaultValue = "World") String name){
        GreetingModel myGreetingModel = new GreetingModel("Hello", name);
        System.out.println("GreetingController.greet");
        System.out.println("name = [" + name + "]");

        if (myGreetingModel != null) {

        }
        if (myGreetingModel != null) {

        }
        if (name == null) {

        }
        return myGreetingModel;
    }
    @RequestMapping("/{locale}/")
    public GreetingModel greetInLocale(@RequestParam(required = false , name = "name", defaultValue = "World") String name,
                                       @PathVariable(name = "locale", required = false) String locale){
        GreetingModel greetingModel = new GreetingModel(greetingService.getGreeting(locale), name);
        System.out.println("GreetingController.greetInLocale");
        System.out.println("name = [" + name + "], locale = [" + locale + "]");
        return greetingModel;
    }
}
