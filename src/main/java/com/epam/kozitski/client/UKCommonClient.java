package com.epam.kozitski.client;

import com.epam.kozitski.dto.ForceDto;
import com.epam.kozitski.dto.ForcesDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class UKCommonClient {
    private RestTemplate restTemplate;

    public UKCommonClient() {
        restTemplate = new RestTemplate();
//
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        converter.setObjectMapper(new ObjectMapper());
//        restTemplate.getMessageConverters().add(converter);
    }

    public List<ForceDto> getDto(String url) throws URISyntaxException {
        ForcesDto forcesDto = restTemplate.getForObject(new URI(url), ForcesDto.class);

        return forcesDto.getItems();
    }


    public String getStr(String url) throws URISyntaxException {
        String str  = restTemplate.getForObject(new URI(url), String.class);

        return str;
    }

}
