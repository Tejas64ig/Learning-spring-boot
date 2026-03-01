package com.first_day.truing_spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class hellocontroller {

    // " say-hello" => "heyz dude `~"

    //say-he llo
    //http://loclhost:8080/say-hello
@RequestMapping("say-hello")
@ResponseBody
    public String sayhello(){
        return " heyz m   ~ ";
    }
}
