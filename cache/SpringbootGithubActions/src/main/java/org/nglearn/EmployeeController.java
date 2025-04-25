package org.nglearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    @GetMapping("/{name}")
    public String welcomeNote(@PathVariable("name") String name){
        return "Welcome to Onboard "+name;
    }
}
