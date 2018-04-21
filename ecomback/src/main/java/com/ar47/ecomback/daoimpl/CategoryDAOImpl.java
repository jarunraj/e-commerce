package com.ar47.ecomback.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ar47.ecomback.dao.CategoryDAO;
import com.ar47.ecomback.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories= new ArrayList<>();
	
	static{
		
		Category category = new Category();
		// adding into the list
		category.setId(1);
		category.setName("TV");
		categories.add(category);
		
		// Second category
		category.setId(2);
		category.setName("Watch");
		categories.add(category);
		
		// Third category
		category.setId(3);
		category.setName("Phone");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
	
		// Enhanced for loop
		for(Category category : categories)
		{
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
