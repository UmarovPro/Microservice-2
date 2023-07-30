package com.example.demo1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("demo2")
public interface Demo1Service {
    @GetMapping
    String hello();
    @PostMapping("/message/{id}")
    MessageDTO message(@PathVariable Long id);
}
