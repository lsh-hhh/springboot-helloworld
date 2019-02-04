package my.lsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lsh
 * @create 2019-02-04 14:57
 */
@Controller
public class hello {

    @ResponseBody
    @RequestMapping("/hello")
    public String say(){
        return "hello world!";
    }

}
