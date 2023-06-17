package com.eticaretPratik.shopping.modal.userModal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @Column(name = "USERID", unique = true)
    private Long userId;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "SECONDNAME")
    private String secondName;

    @Column(name = "SURNAME")
    private String surName;


}
