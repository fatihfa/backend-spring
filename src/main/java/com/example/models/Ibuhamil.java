package com.example.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

@Table(name = "tbl_ibuhamil")
public class Ibuhamil implements Serializable {
   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String umur;
    private String pendidikan;
    private String hamilKe;
    private String alamat;


    // @OneToMany(mappedBy = "ibuhamil")
    // private Set<Skrining> skrinings;
    
}
