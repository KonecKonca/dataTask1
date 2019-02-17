package com.epam.kozitski.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ForceDto implements Serializable {
    private String id;
    private String name;
}
