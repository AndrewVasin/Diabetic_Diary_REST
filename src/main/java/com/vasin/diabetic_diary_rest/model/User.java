package com.vasin.diabetic_diary_rest.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<SugarLevelRecord> sugarLevelRecordList;

    public User() {}
}
