package mylearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Greeting on 2017/3/19.
 */
@Controller
public class IndexController {
    @RequestMapping(value={"/","/index.html"})
    public String index(){
        return "index";
    }
}
