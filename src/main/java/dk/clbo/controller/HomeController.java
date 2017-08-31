package dk.clbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by clbo on 29/08/2017.
 */


@Controller
public class HomeController {

    @GetMapping("/")
    public String index()
    {
        return "lists";
    }

    @GetMapping("/about")
    public String about()
    {

        return "testside";
    }




    // Lav en about methode der returnerer en about html side


}
