package com.project.projectboard.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.project.projectboard.domain.Article} entity
 */
public record ArticleDto(LocalDateTime createdAt,
                         String createdBy,
                         String title,
                         String content,
                         String hashtag)
        implements Serializable {
    public static ArticleDto of(LocalDateTime createdAt, String createdBy, String title, String content, String hashtag) {
    return new ArticleDto(createdAt, createdBy, title, content, hashtag);
    }
}