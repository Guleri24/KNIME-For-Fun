package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// @Controller annotation use to easily identify the controller
public class GreetingController {
    @GetMapping("/greeting")
    // @GetMapping annotation ensures that HTTP GET requests to '/greeting' are mapped
    // to the 'greeting()' method

    // @RequestParam annotation binds the value of the query string parameter 'name'
    public String greeting(@RequestParam(name="name", required = false,defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
