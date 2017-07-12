package net.kzn.onlineShopping.controller;

import net.kzn.shoppingbackend.dao.CategoryDao;
import net.kzn.shoppingbackend.dto.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv=new ModelAndView("page");	
		            // mv.addObject("greeting", "Welcome to mvc");
		      mv.addObject("title", "Home");
		      mv.addObject("categories", categoryDao.list());
		      mv.addObject("userclickhome", true);
		return mv;
	}
	
	@RequestMapping(value={"/about"})
	public ModelAndView about(){
		
		ModelAndView mv=new ModelAndView("page");	
		      mv.addObject("title", "About us");
		      mv.addObject("userclickabout", true);
		return mv;
	}
	
	@RequestMapping(value={"/contact"})
	public ModelAndView contact(){
		
		ModelAndView mv=new ModelAndView("page");	
		      mv.addObject("title", "Contact us");
		      mv.addObject("userclickcontact", true);
		return mv;
	}
	
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting){
		  if(greeting==null){
			  greeting="Default value";
		  }
		ModelAndView mv=new ModelAndView("page");	
        mv.addObject("greeting", "requestmapping");
          return mv;
		
	}*/
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting){
		  if(greeting==null){
			  greeting="Default value";
		  }
		ModelAndView mv=new ModelAndView("page");	
        mv.addObject("greeting", "PathVariable");
          return mv;
		
	}
	/*
	 * Method to load the products and base on category
	 * 
	 * */
	@RequestMapping(value={"/show/all/products"})
	public ModelAndView showAllProducts(){
		
		ModelAndView mv=new ModelAndView("page");	
		            // mv.addObject("greeting", "Welcome to mvc");
		      mv.addObject("title", "All Products");
		      mv.addObject("categories", categoryDao.list());
		      
		      mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value={"/show/category/{id}/products"})
	public ModelAndView showCategoryByIdProducts(@PathVariable("id") int id){
		
		// categoryDAO to fetch a single category
		 Category category=null;
		   
		 category=categoryDao.get(id) ;
		ModelAndView mv=new ModelAndView("page");	
		            // mv.addObject("greeting", "Welcome to mvc");
		      mv.addObject("title", category.getName() );
		      //passing list of category
		      mv.addObject("categories", categoryDao.list());
		      
		      //passing single category
		      mv.addObject("category", category); 
		      
		      mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
	
}
