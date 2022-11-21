package com.project.projectboard.service;


import com.project.projectboard.domain.type.SearchType;
import com.project.projectboard.dto.ArticleDto;
import com.project.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public List<ArticleDto> searchArticle(SearchType title, String search_keyword) {
    return List.of();
    }
}
