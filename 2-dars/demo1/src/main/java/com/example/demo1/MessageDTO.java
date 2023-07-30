package com.example.demo1;

import java.util.Date;

public class MessageDTO extends MessageFromDemo2DTO {
    private Long createdDate;

    public MessageDTO(Long id, String body) {
        super(id, body);
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }
}
