package com.poraan.Learn.Spring.controller;


import com.poraan.Learn.Spring.model.Comita;
import com.poraan.Learn.Spring.model.Teacher;
import com.poraan.Learn.Spring.service.ComitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ComitaController {

    @Autowired
    private ComitaService comitaService;

    @GetMapping("/comita/register")
    public String getRegisterPage(Model model) {

        model.addAttribute("comita", new Teacher());

        return "comita-form";
    }


    @PostMapping("/comita/register")
    public String register(@ModelAttribute Comita comita) {


        comitaService.saveComita(comita);

        return "redirect:/comita/list";
    }

    @RequestMapping(path = {"/comita/list", "/comita"}, method = RequestMethod.GET)
    public String getStudentListPage(Model model) {

        model.addAttribute("comitas", comitaService.findAll());
        return "comita-list";
    }


    @GetMapping("/comita/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Comita teacher = comitaService.findComitaById(id);
        model.addAttribute("comita", teacher);

        return "comita-form";

    }

    @PostMapping("/comita/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {

        comitaService.deleteComitaById(id);

        return "redirect:/comita/list";
    }

}
