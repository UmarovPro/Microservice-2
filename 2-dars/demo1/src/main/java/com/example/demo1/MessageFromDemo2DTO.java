package com.example.demo1;

public class MessageFromDemo2DTO {
    private Long id;
    private String body;
    public MessageFromDemo2DTO() {}
    public MessageFromDemo2DTO(Long id, String body) {
        this.id = id;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
