package com.xm.simpleweb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/base")
public class BaseController {


    @GetMapping("/info")
    public Map<String,String> base() {
        Map<String,String> map = new HashMap<>();
        map.put("name", "xm");
        map.put("age", "18");
        return map;
    }

}
