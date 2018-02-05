package com.candy.crud.controller;

import com.candy.crud.bean.Employee;
import com.candy.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/emps")
    public String getAll(){
        List<Employee> emps= employeeService.getAll();
        for (Employee e :
                emps) {
            System.out.println(e.getEmpName());
        }
        return "emps";
    }
}
