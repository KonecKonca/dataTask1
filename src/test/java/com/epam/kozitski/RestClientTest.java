package com.epam.kozitski;

import com.epam.kozitski.client.UKCommonClient;
import com.epam.kozitski.dto.ForceDto;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
import java.util.List;

public class RestClientTest {

    @Test
    public void test() throws URISyntaxException {

        new RestTemplate();

//        UKCommonClient ukCommonClient = new UKCommonClient();
//        List<ForceDto> forces = ukCommonClient.getDto("https://data.police.uk/api/forces");
//
//        forces.forEach(e -> System.out.println("id: " + e.getId() + "\t" + "name: " + e.getName()));

    }

}
