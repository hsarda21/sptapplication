package com.college.spt.controllers;

import com.college.spt.model.Person;
import com.college.spt.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController
{
    private final PersonService personService;

    public LoginController(PersonService personService)
    {
        this.personService = personService;
    }

    @RequestMapping("/verify")
    public String verifyLogin(String username, String password, Model model)
    {
        Person person = personService.findByUsername(username);

        if(person == null)
        {
            model.addAttribute("Status", "Not found");
            return "";
        }
        else if(person.getPassword().equals(password))
        {
            model.addAttribute("Status", "Success");
            return "redirect:/home/";
        }

        model.addAttribute("Status", "Invalid Username or Password");
        return "";
    }
}
