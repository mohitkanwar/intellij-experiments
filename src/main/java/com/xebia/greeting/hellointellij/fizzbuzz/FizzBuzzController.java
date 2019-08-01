package com.xebia.greeting.hellointellij.fizzbuzz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")
public class FizzBuzzController {

    @GetMapping
    public FizzBuzzModel fizzbuzz(){
        FizzBuzzModel fizzBuzzModel = new FizzBuzzModel();
        for (int i = 1; i <= 100; i++) {
            String word = "";
            if(i%3==0){
                word = "Fizz";
            }
            if(i%5==0){
                word = word + "Buzz";
            }
            fizzBuzzModel.addEntry(word==""?String.valueOf(i):word);
        }
        return fizzBuzzModel;
    }
}
