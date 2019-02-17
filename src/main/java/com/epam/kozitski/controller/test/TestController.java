package com.epam.kozitski.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/")
    public String test(){

        System.out.println("                    " + jdbcTemplate);
        List<TestEntity> list = jdbcTemplate.query("SELECT * FROM test", new BeanPropertyRowMapper<>(TestEntity.class));
        list.forEach(s -> System.out.println("              " + s));

        return "index";
    }

    @GetMapping(value = "/xxx")
    public String test1(){
        return "countries";
    }

}
