package com.wcg.webone.sencond.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Controller
public class HtmlController {
    @RequestMapping("/hello")
    public String helloHtml(HashMap<String, Object> map, Model model) {
        model.addAttribute("say", "欢迎欢迎,热烈欢迎");
        map.put("hello", "欢迎进入HTML页面");
        return "index";
    }
}
