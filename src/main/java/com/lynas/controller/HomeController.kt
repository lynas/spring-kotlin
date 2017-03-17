package com.lynas.controller

import com.lynas.model.Employee
import com.lynas.model.Person
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

/**
 * Created by sazzad on 7/15/16
 */

@Controller
class HomeController {

    @GetMapping(value = "/")
    fun home(model: Model): String {
        model.addAttribute("varName", "var")
        val personList = listOf(
                Person(1, "name1"),
                Person(2, "name2"),
                Person(3, "name3"),
                Person(4, "name4")
        )
        model.addAttribute("personList", personList)
        return "home"
    }


    @PostMapping("/addPerson")
    fun addPerson(@ModelAttribute person: Person): String {
        print(person.toString())
        return "redirect:/"
    }

    @PostMapping("/addEmployee")
    fun addEmployee(@ModelAttribute employee: Employee, model: Model): String {
        print(employee.toString())
        model.addAttribute("employee", employee)
        return "employee"
    }


    @GetMapping("/anotherPage/{varName}")
    fun anotherPage(@PathVariable varName: String): String {
        return "anotherPage"
    }
}