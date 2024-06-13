package org.fastcampus.boardself.repository;

import org.fastcampus.boardself.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}