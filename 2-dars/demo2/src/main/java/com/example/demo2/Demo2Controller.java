package com.example.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Demo2Controller {

    @GetMapping
    public ResponseEntity<String> hello(){
        String result = "Mohirdev2";
        return ResponseEntity.ok(result);
    }

    @PostMapping("/message/{id}")
    public ResponseEntity<MessageDTO> message(@PathVariable("id") Long id){
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setId(id);
        messageDTO.setBody("Message body Message2");
        return ResponseEntity.ok(messageDTO);
    }
}
