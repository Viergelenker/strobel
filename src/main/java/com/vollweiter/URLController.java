package com.vollweiter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Julien on 07.08.16.
 */
@Controller
public class URLController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/products")
    public String products() {
        return "products";
    }

    @RequestMapping("/repair")
    public String repair() {
        return "repair";
    }

    @RequestMapping("/company")
    public String company() {
        return "aboutUs";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/about")
    public String about() {
        return "imprint";
    }
}
