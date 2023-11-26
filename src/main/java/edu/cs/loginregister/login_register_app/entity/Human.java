package edu.cs.loginregister.login_register_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "humans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "sex")
//    private String sex;

    @Column(name = "birthday", nullable = false)
    private String birthday;

    @Column(name = "height", nullable = false)
    private Long height;

    @Column(name = "weight", nullable = false)
    private Long weight;
}