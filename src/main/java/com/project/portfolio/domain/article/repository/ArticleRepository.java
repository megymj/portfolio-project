package com.project.portfolio.domain.article.repository;

import com.project.portfolio.domain.article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}