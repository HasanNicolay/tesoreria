package co.gov.mintic.tesoreria.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //solo get y post -> mvc
    @GetMapping("/")
    public String index(){
        System.out.println(IndexController.class + " = index");
        return "index";
    }
}
