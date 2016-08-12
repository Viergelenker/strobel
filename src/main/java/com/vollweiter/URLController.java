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

    @RequestMapping("/ajax/doors")
    public String haustueren() {
        return "fragments/doors";
    }
}
