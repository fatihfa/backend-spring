package com.example.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor

@Table(name = "tbl_skrining")
public class Skrining implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resikoName;

    private String nilai;
    private String periodeSatu;
    private String periodeDua;
    private String periodeTiga;
    private String periodeEmpat;
    

    @ManyToOne
    @JoinColumn(name = "skrining_id", nullable = false)
    private Ibuhamil ibuhamil;

}
