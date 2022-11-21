package com.project.projectboard.service;

import com.project.projectboard.domain.type.SearchType;
import com.project.projectboard.dto.ArticleDto;
import com.project.projectboard.repository.ArticleCommentRepository;
import io.micrometer.core.instrument.search.Search;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
@DisplayName("비지니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {
    @InjectMocks private ArticleService sut;
    @Mock private ArticleCommentRepository articleCommentRepository;
    
    
    @DisplayName("게시글을 검색하면 , 게시글을 반환한다.")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnsArticleList(){
        //GIVEN

        //When
        List<ArticleDto> articles = sut.searchArticle(SearchType.TITLE, "search keyword");

        //Then
        assertThat(articles).isNotNull();
    }


}