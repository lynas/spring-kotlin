package com.lynas.model

/**
 * Created by lynas on 3/13/2017
 */

open class Person {
    var id: Int = 0
    var name: String = ""

    constructor() {

    }

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }


    override fun toString(): String {
        return "Person(id=$id, name='$name')"
    }


}