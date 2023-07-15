package com.example.demo8.service;

import com.example.demo8.dto.ProductoDto;
import com.example.demo8.entity.Producto;

import java.util.List;

public interface ProductoService {
    // guardar
    ProductoDto guardar(ProductoDto producto);
    // actualizar
    void actualizar(Producto producto);
    // listar
    List<Producto> listar();
    // buscar por id
    Producto buscarPorId(int idProducto);
    // eliminar
    void eliminar(int idProducto);
    // buscar por nombre
    List<Producto> buscarPorNombre(String nombre);
}
