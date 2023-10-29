package com.example.crud.model;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_generator")
    @SequenceGenerator(name = "user_id_generator", sequenceName = "USER_ID_SEQUENCE")
    private Long id;
    private String name;
    private int age;

}