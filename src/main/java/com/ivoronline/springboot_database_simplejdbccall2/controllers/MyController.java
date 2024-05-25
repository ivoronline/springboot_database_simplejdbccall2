package com.ivoronline.springboot_database_simplejdbccall2.controllers;

import com.ivoronline.springboot_database_simplejdbccall2.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //==========================================================
  // CALL PROCEDURE
  //==========================================================
  // http://localhost:8080/callProcedure?name=ivor
  @ResponseBody
  @GetMapping("/callProcedure")
  public String callProcedure(@RequestParam String name) {
    return myService.callProcedure(name);
  }

}
