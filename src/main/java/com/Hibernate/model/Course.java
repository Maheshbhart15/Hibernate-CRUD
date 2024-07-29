package com.Hibernate.model;

import jakarta.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Table (name = "course_Table")
public class Course {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "course_Id")
    private int id;

@Column(name = "course_name")
    private String name;

@Column(name = "course_decription")
    private String description;

@Column(name = "course_prize")
    private String price;
}
