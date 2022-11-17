package com.intercom.cib.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intercom.cib.model.Customer;
import com.intercom.cib.service.CustomerService;

@Controller

public class Test {

 @Autowired
 private CustomerService CS;
  @GetMapping("/addCustomerForm")
  public String greetingForm(Model model) {
    model.addAttribute("customer", new Customer());
    return "customerForm";
  }

  @PostMapping("/submitCustomer")
  public String greetingSubmit(@ModelAttribute Customer c1, Model model) {
    model.addAttribute("customer", c1);
    System.out.println(c1.getEmail()+"   :email");
    CS.save(c1);
    return "result";
  }

}
=======

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.intercom.cib.model.Customer;
//import com.intercom.cib.service.CustomerService;




@RestController
@RequestMapping("/customers")
public class Test {
	 
//	 @SuppressWarnings("unused")
//	@Autowired
//	 private CustomerService CS;
	
	@GetMapping("/test")
	public String getAllCustomers(){
		System.out.println("test request");
		// List <Customer> customers = CS.GetAll();
		
		return "helal" ;
	}
	
//	@PostMapping("/add-customer")
//	public void addCustomer(Customer c1){
//		// CS.AddCustomer(c1);
//	}

}
>>>>>>> 28f7d516b253c2ab3b356b9b7aa65f38eed3263d
