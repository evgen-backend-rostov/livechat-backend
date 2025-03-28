package com.tele2.livechat.service;

import com.tele2.livechat.dto.MessageDto;
import com.tele2.livechat.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Override
    public void sendMessage(MessageDto messageDto) {
        messageRepository.saveMessage(messageDto.getSender(), messageDto.getContent());
    }
}
