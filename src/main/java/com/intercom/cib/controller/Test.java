package com.intercom.cib.controller;


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
