package com.corndel;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class Message {
    private String id;
    private LocalDateTime timestamp;
    private String content;
    private User from;
    private User to;
    private boolean delivered = false;
    private boolean read = false;
}
