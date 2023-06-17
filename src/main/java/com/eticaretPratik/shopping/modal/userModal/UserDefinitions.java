package com.eticaretPratik.shopping.modal.userModal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserDefinitions {

    @Id
    @Column(name = "USERDEFKEY")
    private Long userDefKey;

    @Column(name = "USERID")
    private Integer userId;

    @Column(name = "AUTHORY")
    private Integer authory;



}
