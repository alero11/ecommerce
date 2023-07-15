package com.example.demo8.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDto {
    private Integer idProducto;
    private String nombreProducto;
    private String descripcion;
    private double precio;
}
