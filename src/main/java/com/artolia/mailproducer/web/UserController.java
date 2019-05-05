package com.artolia.mailproducer.web;

import com.artolia.mailproducer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Artolia Pendragon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年05月02日 22:27:00
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public void selectList() {
        userService.selectList();
    }

    @GetMapping("/save")
    public void save() {
        userService.save();
    }
}
