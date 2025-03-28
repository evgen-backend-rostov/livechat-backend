package com.tele2.livechat.service;

import com.tele2.livechat.dto.MessageDto;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    void sendMessage(MessageDto message);
}
