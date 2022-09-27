package com.jkosgym.gymsystemloginservice.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;

    private String login;

    private String password;

}
