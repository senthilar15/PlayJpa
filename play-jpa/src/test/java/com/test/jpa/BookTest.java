package com.test.jpa;

import org.junit.Test;

public class BookTest extends BaseTest{

	public BookTest() {
		super("play.jpa");
	}
	
	
	@Test
	public void testFindBookById(){
		beginTransaction();
		entityManager().find(Book.class, 1);
		commit();
	}
	

}
