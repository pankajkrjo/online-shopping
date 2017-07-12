package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDao;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	   private static List<Category> categories=new ArrayList<>();
	   
	   
	    static{
	    	Category category=new Category();
	    	category.setId(1);
	    	category.setName("Telvesion");
	    	category.setDescription("telvesion decriptio");
	    	category.setImageUrl("pan.png");
	    	
	    	categories.add(category);
	    	
	    	
	    	category=new Category();
	    	category.setId(2);
	    	category.setName("Phone");
	    	category.setDescription("Phone decriptio");
	    	category.setImageUrl("phone.png");
	    	
	    	categories.add(category);
	    		
	    }
	 
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		// enchanced for loop
		for(Category category:categories){
			if(category.getId()==id) return category;
		}
		return null;
	}

}
