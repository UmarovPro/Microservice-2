package com.example.demo1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class Demo1Controller {
    private final Demo1Service demo1Service;

    public Demo1Controller(Demo1Service demo1Service) {
        this.demo1Service = demo1Service;
    }

    @GetMapping
    public ResponseEntity<String> hello(){
        String result = demo1Service.hello();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/message")
    public ResponseEntity<MessageDTO> message(Long id){
        MessageDTO result = demo1Service.message(id);
        result.setCreatedDate(new Date().getTime());
        return ResponseEntity.ok(result);
    }
}
