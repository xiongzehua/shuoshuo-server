package com.xiongzehua.freetalk.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserCommentTalk {
    private Integer id;

    private Integer talkId;

    private Integer createId;

    private String content;

    private LocalDateTime createTime;

}