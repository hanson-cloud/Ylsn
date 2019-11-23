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
public class Activity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer actiId;
    private String actiTitle;
    private String actiCity;
    private Date actiDate;
    private String actiTime;
    private String actiPlace;
    private Integer actiCount;
    private String actiImages;
    private Integer actiState;
    private String actiIntroduction;

    public Activity() {
    }
}
