package com.looqbok.feature.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private Long id;

    @TextIndexed
    private String name;

    @TextIndexed
    private String position;

    @TextIndexed
    private String description;

}
