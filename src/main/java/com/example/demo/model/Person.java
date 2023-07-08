package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(name = "person")
public class Person {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
