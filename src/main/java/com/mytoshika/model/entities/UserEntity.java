package com.mytoshika.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "invoice")
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id", unique=true, nullable=false, length=10)
    private Integer userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_mobile")
    private long userMobile;

	
}
