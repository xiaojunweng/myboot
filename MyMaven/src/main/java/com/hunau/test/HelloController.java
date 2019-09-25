package com.hunau.test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 肖鋆雯
 * @单位：湖南农业大学
 * @Date: $date$ $time$
 */


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "肖鋆雯  201841882216";
    }
}

