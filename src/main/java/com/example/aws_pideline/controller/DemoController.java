package com.example.aws_pideline.controller;

import com.example.aws_pideline.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo-test")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/")
    public String welcome() {
        return "Welcome Maharana:";
    }
    @GetMapping("/{name}")
    public ResponseEntity<?> hello(@PathVariable String name) {
        return ResponseEntity.ok(demoService.sayHello(name));
    }

    @GetMapping("/names")
    public List<String> getEmpNames() {
        return List.of("maharana","priyanka","kittu","paro");
    }
}
