package ru.pavelbev.CrudAppWithSpringBoot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The first line in your passport. Come on, I believe in you!")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Look in your passport, the second line after the name. This is a last name")
    @Size(min = 2, max = 30, message = "Lastname should be between 2 and 30 characters")
    @Column(name = "last_name")
    private String lastName;

    @Min(value = 0,message = "Age cannot be less than zero. Dalbaeb!")
    @Max(value = 135, message = "Age cannot exceed 135 years. Ti sho syka, mumia ?")
    @Column(name = "age")
    private int age;
}
