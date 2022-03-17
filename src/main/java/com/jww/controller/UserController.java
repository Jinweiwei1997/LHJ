package com.jww.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jww.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.jww.service.UserService;


@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserService userService;
//    @ResponseBody
//    @RequestMapping(value="/login" )
//    @JsonIgnore
//    public String getPassword(@RequestParam("username") String username,
//                              @RequestParam("password") String password){
//       return  userService.getPassword(username,password);
//    }
    @ResponseBody
    @RequestMapping(value="/login" ,method=RequestMethod.POST)
    @JsonIgnore
    public String getPassword(@RequestBody(required=false) User user){
        if(user.getUsername()==null)
            System.out.println("11111111111");
        return  userService.getPassword(user.getUsername(),user.getPassword());
    }
}
