package com.demo.SpringBoot11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringBoot11.beans.Account;
import com.demo.SpringBoot11.service.AccountService;

@Controller
public class Controller1 {
	@Autowired
	AccountService accountService;
	
  @GetMapping("/hello")
  public ModelAndView hellomethod() {
	return new ModelAndView("hello","msg","Hello Wolrd Learning Spring boot");
	  
  }
  
  @GetMapping("/account")
   public ModelAndView getAll() {
	  List<Account> alist=accountService.getAll();
	return new ModelAndView("allAccount","alist",alist);
  }
  @GetMapping("/createac")
  public ModelAndView create() {
	  
	return new ModelAndView("createac","alist","welcome to bank");
  }
  @PostMapping("/addnewaccount")
  public ModelAndView addac(@ModelAttribute("Account607") Account A , BindingResult result) {
	  if(result.hasErrors()) {
		  return new ModelAndView("createac","msg","Account No Already Exists");
	  }
	  accountService.addAccount(A);
	  return new ModelAndView("redirect:/account");
		
	  }
     
}
