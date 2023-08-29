package com.mottakin.birthdayReminder.controller;

import com.mottakin.birthdayReminder.model.Birthday;
import com.mottakin.birthdayReminder.service.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    /*@Autowired
    private BirthdayService birthdayService;*/

    @GetMapping("/")
    public String homePage()
    {
        return "home-page.html";
    }

    /*@PostMapping("/find-by-id")
    public String findById(@RequestParam Integer id, Model model) {
        model.addAttribute("birthday", birthdayService.findById(id));
        return "candidate-page.html";
    }
    @GetMapping("/add-candidate")
    public String addCandidate() {
        return "add-candidate-page.html";
    }

    @PostMapping("/save-candidate")
    public String saveCandidate(@ModelAttribute Birthday birthday) {
        birthdayService.addCandidate(birthday);
        return "home-page.html";
    }

    @GetMapping("/list-all-candidates")
    public String listAllCandidates(Model model) {
        model.addAttribute("birthdayList", birthdayService.getAllCandidate());
        return "all-candidates-page.html";
    }*/
}
