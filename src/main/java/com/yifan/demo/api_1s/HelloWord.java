package com.yifan.demo.api_1s;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HelloWord {

    @RequestMapping(value = "/SayHello",method = {RequestMethod.GET})
    @ResponseBody
    public String sayHello(){
        String x = "Hello，7月";
        return x;
    }
    /*
    todo：注释的区别
    1、Controller和RestController区别
    2、ResponseBody：加和不加的区别
    3、getMapping和RequestMapping区别
     */
    @RequestMapping("/sayHello")
    public String SayHello(){
        return "Hello，7月*";
    }

    @RequestMapping("/sayhello")
    public void SayHello(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello,7月44");
    }
}
