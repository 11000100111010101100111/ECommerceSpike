package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xjh
 * @since 2022/7/2
 * Time: 16:22
 **/
@Service
public class TestService {

    @RequestMapping("/fun")
    public void fun(){}
}
