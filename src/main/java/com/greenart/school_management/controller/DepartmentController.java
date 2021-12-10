package com.greenart.school_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentController {
    @GetMapping("/department")
    public String getDepartment() {
        return "/department/list";
    }
}
