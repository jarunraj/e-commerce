package com.ar47.ecomback.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ar47.ecomback.dao.CategoryDAO;
import com.ar47.ecomback.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.ar47.ecomback");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category(); category.setName("Laptop");
	 * category.setDesc("It's a Lenovo Laptop!"); category.setImgURL("laptop.jpg");
	 * assertEquals("Successfully added the category",true,categoryDAO.add(category)
	 * );
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * 
	 * assertEquals("Successfully fetched a single category from the table","Laptop",
	 * category.getName());
	 * 
	 * }
	 */

	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * 
	 * category.setName("G580");
	 * 
	 * assertEquals("Successfully updated a single category from the table",true,
	 * categoryDAO.update(category));
	 * 
	 * }
	 */

	/*
	@Test
	public void testDeleteCategory() {

		category = categoryDAO.get(2);
		assertEquals("Successfully deleted a single category from the table", true, categoryDAO.delete(category));

	}
	*/
	
	/*
	@Test
	public void testListCategory() {

		
		assertEquals("Successfully fetched the list of categories from the table", 1, categoryDAO.list().size());

	}
	*/
	
	@Test
	public void testCRUDCategory() {
		
		// Add operation
		category = new Category(); 
		category.setName("Laptop");
		category.setDesc("It's a Lenovo Laptop!"); 
		category.setImgURL("CAT_1.jpg");
		assertEquals("Successfully added the category",true,categoryDAO.add(category));
		
		category = new Category(); 
		category.setName("Television");
		category.setDesc("It's a Samsung Laptop!"); 
		category.setImgURL("CAT_2.jpg");
		assertEquals("Successfully added the category",true,categoryDAO.add(category));
		
		// Fetching and updating the category
		category = categoryDAO.get(2);
		category.setName("TV");
		assertEquals("Successfully updated a single category from the table", true, categoryDAO.update(category));
		
		// Delete the category
		assertEquals("Successfully deleted a single category from the table", true, categoryDAO.delete(category));
		
		// Fetching the list
		assertEquals("Successfully fetched the list of categories from the table", 1, categoryDAO.list().size());
		
	}
	
}
