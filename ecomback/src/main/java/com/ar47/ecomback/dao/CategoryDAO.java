package com.ar47.ecomback.dao;

import java.util.List;

import com.ar47.ecomback.dto.Category;

public interface CategoryDAO {
	
	Category get(int id); 
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
}
