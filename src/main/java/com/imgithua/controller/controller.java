package com.imgithua.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @GetMapping
    public String getMapping()
    {
    return "This is the Get endpoint example";
    }

    @PostMapping
    public String postMapping()
    {
        return "This is the Post endpoint example";
    }

}
