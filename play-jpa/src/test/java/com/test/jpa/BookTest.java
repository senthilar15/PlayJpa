package com.test.jpa;

import org.junit.Test;

public class BookTest extends BaseTest{

	public BookTest() {
		super("play.jpa");
	}
	
	
	@Test
	public void testFindBookById(){
		beginTransaction();
		
		Category category = new Category();
		category.setParent_Category(0);
		category.setCategory("Technology");
		category.setDescription("Technical Category");
		entityManager().persist(category);
		commit();
	}
	

}
