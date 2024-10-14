package com.koreaIT.BAM.dao;

import java.util.ArrayList;
import java.util.List;

import com.koreaIT.BAM.dto.Article;

public class ArticleDao {

	private List<Article> articles;
	
	public ArticleDao() {
		this.articles = new ArrayList<>();
	}
	
	public Article getArticleById(int id) {
		for (Article article : articles) {
			if (article.getId() == id) {
				return article;
			}
		}
		return null;
	}
	
}
