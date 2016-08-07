package com.vollweiter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Julien on 07.08.16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "welcome";
    }
}
