package com.johnAlp.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee") // для всех методов
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

//        @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }
    @RequestMapping("/showDetails")
    public String showEmpDetails(HttpServletRequest request, Model model) {
        String empName = request.getParameter("employeeName");
        empName = "Mr." + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", "May");
        return "show-emp-details-view";
    }
    // альтарнатива с @RequestParam
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr." + empName + "!";
//        model.addAttribute("nameAttribute", empName);
////        model.addAttribute("description", "May");
//        return "show-emp-details-view";

}
