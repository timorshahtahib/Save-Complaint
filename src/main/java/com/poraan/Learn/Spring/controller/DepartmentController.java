package com.poraan.Learn.Spring.controller;


import com.poraan.Learn.Spring.model.Comita;
import com.poraan.Learn.Spring.model.Department;
import com.poraan.Learn.Spring.model.Teacher;
import com.poraan.Learn.Spring.service.ComitaService;
import com.poraan.Learn.Spring.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService comitaService;

    @GetMapping("/department/register")
    public String getRegisterPage(Model model) {

        model.addAttribute("department", new Teacher());

        return "department-form";
    }


    @PostMapping("/department/register")
    public String register(@ModelAttribute Department comita) {


        comitaService.saveDepartment(comita);

        return "redirect:/department/list";
    }

    @RequestMapping(path = {"/department/list", "/department"}, method = RequestMethod.GET)
    public String getStudentListPage(Model model) {

        model.addAttribute("departments", comitaService.findAll());
        return "department-list";
    }


    @GetMapping("/department/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Department department = comitaService.findDepartmentById(id);
        model.addAttribute("department", department);

        return "department-form";

    }

    @PostMapping("/department/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {

        comitaService.deleteDepartmentById(id);

        return "redirect:/department/list";
    }

}
