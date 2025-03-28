package com.tele2.livechat.repository;

import com.tele2.livechat.entity.Message;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, String> {

    @Query(nativeQuery = true, value = "INSERT INTO messages (user, message) VALUES (:sender, :content)")
    @Modifying
    void saveMessage(String sender, String content);
}
