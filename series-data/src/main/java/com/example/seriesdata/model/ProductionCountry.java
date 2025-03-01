package com.example.seriesdata.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class ProductionCountry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String name;

    @ManyToMany
    private List<Series> series = new ArrayList<>();

}
