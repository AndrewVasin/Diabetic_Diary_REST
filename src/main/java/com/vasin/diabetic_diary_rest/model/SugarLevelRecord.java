package com.vasin.diabetic_diary_rest.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "sugar_level")
public class SugarLevelRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    private User user;
}
