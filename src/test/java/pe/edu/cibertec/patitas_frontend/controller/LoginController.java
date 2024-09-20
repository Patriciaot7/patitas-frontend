package pe.edu.cibertec.patitas_frontend.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/inicio")
    public String inicio(Model model){

        return "inicio";
    }
}
