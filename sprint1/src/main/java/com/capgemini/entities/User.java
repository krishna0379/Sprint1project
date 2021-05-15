package com.capgemini.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="user_data")

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int userId;
    private String username;
    private String password;
}
