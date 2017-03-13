package com.lynas.controller

import com.lynas.model.Person
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

/**
 * Created by sazzad on 7/15/16
 */

@Controller
class HomeController{

    @GetMapping(value = "/")
    fun home(): String {
        return "home"
    }


    @PostMapping("/addPerson")
    fun addPerson(@ModelAttribute person: Person): String {
        print(person)
        return "redirect:/"
    }
}