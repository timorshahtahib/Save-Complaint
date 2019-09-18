package com.poraan.Learn.Spring.controller;


import com.poraan.Learn.Spring.model.Teacher;
import com.poraan.Learn.Spring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher/register")
    public String getRegisterPage(Model model) {

        model.addAttribute("teacher", new Teacher());

        return "teacher-form";
    }


    @PostMapping("/teacher/register")
    public String register(@ModelAttribute Teacher teacher) {

        teacherService.saveTeacher(teacher);

        return "redirect:/teacher/list";
    }

    @RequestMapping(path = {"/teacher/list", "/teacher"}, method = RequestMethod.GET)
    public String getStudentListPage(Model model) {

        model.addAttribute("teachers", teacherService.findAll());
        return "teacher-list";
    }


    @GetMapping("/teacher/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Teacher teacher = teacherService.findStudentById(id);
        model.addAttribute("teacher", teacher);

        return "teacher-form";

    }

    @PostMapping("/teacher/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {

        teacherService.deleteStudentById(id);

        return "redirect:/teacher/list";
    }

}
