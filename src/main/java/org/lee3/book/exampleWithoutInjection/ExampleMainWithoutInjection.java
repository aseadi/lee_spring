package org.lee3.book.exampleWithoutInjection;

public class ExampleMainWithoutInjection {

	public static void main(String[] args) {
		ArticleService articleService = new ArticleService();
		PaymentService paymentService = new PaymentService();

		articleService.addArticle();
		paymentService.pay();
	}
}