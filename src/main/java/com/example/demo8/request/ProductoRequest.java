package com.example.demo8.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductoRequest {
    // que parametros de datos necesitan en la entrada

    @JsonProperty("nombre")
    private String nombreProducto;
    private String descripcion;

    @NotNull
    private double precio;

}
