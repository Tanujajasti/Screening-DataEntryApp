package com.app.DataEntryApp.controller;

import com.app.DataEntryApp.entity.Person;
import com.app.DataEntryApp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/form")
    public String showPersonForm(Model model) {
        model.addAttribute("person", new Person());
        return "person-form";
    }

    @PostMapping("/save")
    public String savePerson(@ModelAttribute Person person) {
        personRepository.save(person);
        return "redirect:/persons/list"; // Redirect to the person-list page
    }

    @GetMapping("/list")
    public String listPersons(Model model) {
        List<Person> persons = personRepository.findAll();
        model.addAttribute("persons", persons);
        return "person-list";
    }

    @GetMapping("/confirmation")
    public String showConfirmationPage() {
        return "confirmation";
    }

}


