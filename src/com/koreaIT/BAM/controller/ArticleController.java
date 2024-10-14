package com.koreaIT.BAM.controller;

import java.util.Scanner;

import com.koreaIT.BAM.dto.Article;
import com.koreaIT.BAM.service.ArticleService;

public class ArticleController {
	
	private Scanner sc;
	private ArticleService articleService;
	
	public ArticleController(Scanner sc) {
		this.sc = sc;
		this.articleService = new ArticleService();
	}

	public void showDetail(String cmd) {
		int id = articleService.getCmdNum(cmd);

		if (id == 0) {
			System.out.println("올바른 형식이 아닙니다");
			return;
		}

		Article foundArticle = articleService.getArticleById(id);

		if (foundArticle == null) {
			System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
			return;
		}

		System.out.printf("번호 : %d\n", foundArticle.getId());
		System.out.printf("작성일 : %s\n", foundArticle.getRegDate());
		System.out.printf("수정일 : %s\n", foundArticle.getUpdateDate());
		System.out.printf("제목 : %s\n", foundArticle.getTitle());
		System.out.printf("내용 : %s\n", foundArticle.getBody());
	}
}