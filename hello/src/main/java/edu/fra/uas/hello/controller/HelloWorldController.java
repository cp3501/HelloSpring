package edu.fra.uas.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWorldController {
  
    @RequestMapping(value="hello", method=RequestMethod.GET)
    @ResponseBody
   public String getHelloWorld(@RequestParam String param) {
       return "<h1>Ich habe kein Bock mehr </h1>";
   }
   
}
