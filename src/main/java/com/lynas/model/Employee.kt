package com.lynas.model

import com.lynas.misc.EmployeeType

/**
 * Created by lynas on 3/14/2017
 */


class Employee {
    var person: Person = Person()
    var employeeId: Int = 0
    var department: EmployeeType = EmployeeType.PERMANENT
    override fun toString(): String {
        return "Employee(person=$person, employeeId=$employeeId, department=$department)"
    }


}