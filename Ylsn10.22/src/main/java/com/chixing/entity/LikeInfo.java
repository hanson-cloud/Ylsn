package com.chixing.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class LikeInfo  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer likeId;
    private Integer likedId;

    public LikeInfo() {
    }

    public LikeInfo(Integer likeId, Integer likedId) {
        this.likeId = likeId;
        this.likedId = likedId;
    }

    @Override
    public String toString() {
        return "LikeInfo{" +
                "likeId=" + likeId +
                ", likedId=" + likedId +
                '}';
    }
}
