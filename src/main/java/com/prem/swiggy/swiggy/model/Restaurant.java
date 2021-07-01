package com.prem.swiggy.swiggy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity(name = "Restaurant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="my_entity_seq_gen")
    @SequenceGenerator(name="my_entity_seq_gen", sequenceName="MY_ENTITY_SEQ")
    private int id;
    private String name;
    private String pincode;



}
