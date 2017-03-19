package mylearn.controller.seckill;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Greeting on 2017/3/19.
 */
@Controller
@RequestMapping(value="/seckill/")
public class SeckillController {

    @RequestMapping(value="")
    public String index(){
        return "seckill/index";
    }

}
