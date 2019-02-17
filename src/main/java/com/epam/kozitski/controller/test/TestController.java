package com.epam.kozitski.controller.test;

import com.epam.kozitski.client.UKCommonClient;
import com.epam.kozitski.dto.ForceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
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

        System.out.println("                " + new RestTemplate());

        return "index";
    }

    @GetMapping(value = "/xxx")
    public String test1(){
        return "countries";
    }

    @GetMapping("/forces")
    public String test2() throws URISyntaxException {

        UKCommonClient ukCommonClient = new UKCommonClient();
//        List<ForceDto> forces = ukCommonClient.getDto("https://data.police.uk/api/forces");
//        forces.forEach(e -> System.out.println("id: " + e.getId() + "\t" + "name: " + e.getName()));

        System.out.println(ukCommonClient.getStr("https://data.police.uk/api/forces"));

        return "index";
    }

}
