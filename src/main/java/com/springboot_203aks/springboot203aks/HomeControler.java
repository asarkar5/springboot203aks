package com.springboot_203aks.springboot203aks;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeControler {
    @GetMapping("/songform")
    public String loadFormPage(Model model){
       model.addAttribute("song", new Song());
       return "songform";
    }
    @GetMapping("/songform")
    public String loadFormPage(@ModelAttribute Song song, Model model)
    {
        model.addAttribute("song", song);
        return "confirmsong";
    }

}
