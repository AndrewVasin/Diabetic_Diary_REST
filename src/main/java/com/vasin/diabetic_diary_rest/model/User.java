package com.vasin.diabetic_diary_rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users_table")
@Getter
@Setter
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name", unique = true)
    @NonNull
    private String userName;

    @Column(name = "email", unique = true)
    @NonNull
    private String email;

    @OneToMany(mappedBy = "user")
    private List<SugarLevelRecord> sugarLevelRecordList;

    public User() {}
}
