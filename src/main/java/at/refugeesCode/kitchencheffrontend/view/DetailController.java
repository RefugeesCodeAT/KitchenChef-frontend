package at.refugeesCode.kitchencheffrontend.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/meals")
public class DetailController {
    @GetMapping
    String page(){
        return "detail";
    }
}
