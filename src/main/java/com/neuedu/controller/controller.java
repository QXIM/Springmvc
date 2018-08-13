package com.neuedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.awt.SunHints;

@Controller
public class controller {
@RequestMapping("/hello")
    public String hello(){

return "hello";

    }

@RequestMapping(value = "/hello2/{username}")
    public String  HELLO(@PathVariable("username") String name,Model model){

    model.addAttribute("username",name);

    return "hello";
}


@RequestMapping(value = "/hello3/{username}")
    public ModelAndView h1(@PathVariable("username") String name,ModelAndView modelAndView){
    modelAndView.addObject("username",name);
    modelAndView.setViewName("hello");
    return modelAndView;

}


}
