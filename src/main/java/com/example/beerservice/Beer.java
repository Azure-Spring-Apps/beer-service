package com.example.beerservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Beer {

    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    private String style;
    private String hops;
    private String malt;
    private String yeast;

}
