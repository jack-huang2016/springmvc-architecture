/**
 * FileName: RabbitmqController
 * Author:   huang.yj
 * Date:     2020/5/14 17:50
 * Description:
 */
package com.test.sample.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈〉
 *
 * @author huang.yj
 * @create 2020/5/14
 * @since 1.0.0
 */

@Controller
@RequestMapping("/my")
public class MyController {

    @RequestMapping(value = "test", method= RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> test(){
        System.out.println("nihao");
        return new ResponseEntity<>("成功了", HttpStatus.OK);
    }

    @RequestMapping(value="test2", method= RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> test2(){
        System.out.println("nihao2");
        return new ResponseEntity<>("成功了2", HttpStatus.OK);
    }
}