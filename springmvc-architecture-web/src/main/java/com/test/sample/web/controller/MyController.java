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
public class MyController {

    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> test(){
        System.out.println("nihao ");
        return new ResponseEntity<>("成功了", HttpStatus.OK);
    }
}