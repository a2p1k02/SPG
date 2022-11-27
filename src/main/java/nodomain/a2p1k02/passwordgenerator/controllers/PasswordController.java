package nodomain.a2p1k02.passwordgenerator.controllers;

import nodomain.a2p1k02.passwordgenerator.utils.PasswordGenerator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PasswordController {
    private PasswordGenerator passwordGenerator = new PasswordGenerator();

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/gen-passwd")
    public String genPasswd(@RequestParam(name="length", required=false, defaultValue="8") String length, Model model) {
        model.addAttribute("password", passwordGenerator.passwd(Integer.parseInt(length)));
        return "index";
    }
}
