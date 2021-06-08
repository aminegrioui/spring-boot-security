package com.javabrains.springsecurityjdbc;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String home(){
        return  "<h1> Welecome </h1>";
    }
    @GetMapping("/user")
    public String user(){
        return  "<h1> User </h1>";
    }
    @GetMapping("/admin")
    public String admin(){
        return  "<h1> Admin </h1>";
    }

    @GetMapping("/featureAdmin")
    public String featureBranching(){
        return  "<h1> featureBranching </h1>";
    }


    @GetMapping("/admin")
    public String homeApi(){
        return  "<h1> homeApi </h1>";
    }



}
