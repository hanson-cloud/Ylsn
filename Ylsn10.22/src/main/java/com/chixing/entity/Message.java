package com.chixing.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Message  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer messId;
    private String messContent;
    private Date messTime;
    private Integer messFromId;
    private Integer messToId;
    private Integer messState;

    public Message() {
    }
}
