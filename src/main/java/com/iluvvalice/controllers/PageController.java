package com.iluvvalice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by iluvvalice on 6/21/17.
 */

@Controller
public class PageController {

    @RequestMapping("/")
    public String home(){
        return "app.home";
    }

    @RequestMapping("/login")
    public String login(){
        return "app.login";
    }
}
