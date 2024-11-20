package com.example.webSocket.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.example.webSocket.user.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class User {
      @Id
    private String nickName;
    private String fullName;
    private Status status;


}
