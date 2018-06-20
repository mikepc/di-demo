package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Author: Michael Draper
 * Date: 6/20/18
 **/
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!! ");

        return "foo";
    }
}
