package com.example.gametest.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
public class Responses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idResponse")
    private int idResponse;
    @Column(name = "description")
    private String description;
    @Column(name = "questionId")
    private int questionId;
    @Column(name = "isTrue")
    private boolean isTrue;
}
