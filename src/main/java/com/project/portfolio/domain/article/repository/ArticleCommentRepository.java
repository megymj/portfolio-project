package com.project.portfolio.domain.article.repository;

import com.project.portfolio.domain.article.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}