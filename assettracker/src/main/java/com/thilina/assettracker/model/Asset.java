package com.thilina.assettracker.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetName;
    private String category;
    private String location;
    private String status; // Active, Under_Maintenace, Retired

    private LocalDate purchaseDate;
    private LocalDate lastServiceDate;
    private LocalDate nextServiceDate;
}
