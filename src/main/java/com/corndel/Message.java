package com.corndel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter

public class Message {
    private String id;
    private LocalDateTime timestamp;
    private String content;
    private User from;
    private User to;
    private boolean delivered = false;
    private boolean read = false;




}
