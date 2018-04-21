package com.ar47.ecomback.dao;

import java.util.List;

import com.ar47.ecomback.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category get(int id); 
	
	
}
