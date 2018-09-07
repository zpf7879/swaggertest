package org.zpf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControl {
    @RequestMapping("/swagger")
    public String home() {
        return "redirect:/swagger-ui.html";
    }
}
