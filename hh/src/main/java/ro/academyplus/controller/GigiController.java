package ro.academyplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by agheboianu on 12.05.2016.
 */

@Controller
public class GigiController {

    @RequestMapping("/")
    public String welcome(Model model) {
        UserData userData = new UserData("gigi@example.com", "Gigi");
        model.addAttribute("userData", userData);
        model.addAttribute("user",new UserData("",""));
        return "index";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String createUser(@ModelAttribute(value = "user") @Valid UserData userData, BindingResult result, Model model){
        if(result.hasErrors()){
            return "index";
        }

        System.out.println("Name: "+userData.getName());
        System.out.println("Email: "+userData.getEmail());
        return "redirect:/";
    }
    @RequestMapping(value = "/ana")
    public String deff() {
        return "index2";
    }
    @RequestMapping(value = "/ana", method = RequestMethod.POST)
    public String loadUser()
    {
        return "bla";
    }
}
