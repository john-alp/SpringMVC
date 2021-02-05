package com.johnAlp.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
//@RequestMapping("/go")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("friend", new Friend());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("friend") Friend employee
            , BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }
}
