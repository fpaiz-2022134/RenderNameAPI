package org.francopaiz.dockerRestfulAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class NameController {


    @GetMapping("")
    public String myName(){
        System.out.println("Franco Alejandro Paiz González");
        return "Franco Alejandro Paiz González";
    }
}
