package com.looqbok.feature.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    private Long id;

    @TextIndexed
    private String name;

    @TextIndexed
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private Person person;
}
