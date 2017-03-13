package com.lynas.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created by sazzad on 7/15/16
 */

@Controller
class HomeController{

    @GetMapping(value = "/")
    fun home(): String {
        return "home"
    }
}