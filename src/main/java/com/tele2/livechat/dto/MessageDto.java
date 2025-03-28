package com.tele2.livechat.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageDto {

    private MessageType type;
    private String content;
    private String sender;

}
