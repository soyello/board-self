package org.fastcampus.boardself.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;
    private String content;
    private String hashtag;

    private LocalDateTime createAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
