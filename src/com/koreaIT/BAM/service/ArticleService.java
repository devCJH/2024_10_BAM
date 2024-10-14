package com.koreaIT.BAM.service;

import com.koreaIT.BAM.dao.ArticleDao;
import com.koreaIT.BAM.dto.Article;

public class ArticleService {
	
	private ArticleDao articleDao;
	
	public ArticleService() {
		this.articleDao = new ArticleDao();
	}

	public int getCmdNum(String cmd) {
		String[] cmdBits = cmd.split(" ");

		int id = 0;

		try {
			id = Integer.parseInt(cmdBits[2]);
		} catch (Exception e) {
			return 0;
		}
		return id;
	}
	
	public Article getArticleById(int id) {
		return articleDao.getArticleById(id);
	}
	
}













