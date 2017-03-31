package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
public class App 
{
	@RequestMapping(value="/testRun")
	@ResponseBody
    public String testMethod()
    {
        return "list";
    }
}
