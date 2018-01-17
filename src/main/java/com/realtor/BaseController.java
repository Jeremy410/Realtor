package com.realtor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JLOPEZ on 1/17/2018.
 */
@Controller
public class BaseController {

    @GetMapping("/")
    public String test(){
        return "pages-login";
    }
}
