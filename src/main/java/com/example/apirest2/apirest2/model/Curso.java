package com.example.apirest2.apirest2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Curso{
    private @NonNull int id;
    private @NonNull String nombre;
    private @NonNull int creditos;
}