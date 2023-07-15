package com.example.demo8.service;

import com.example.demo8.entity.Producto;
import com.example.demo8.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductoService {

    @Autowired
    ProductoRepository repository;

    public Producto guardar(Producto producto) {
        return null;
    }

    public void actualizarPorId(Integer idProducto, Producto producto) {
        Producto oldProducto = repository.findById(idProducto).orElse(null);
        if(oldProducto != null){
            oldProducto.setNombreProducto(producto.getNombreProducto());
            oldProducto.setDescripcion(producto.getDescripcion());
            oldProducto.setPrecio(producto.getPrecio());
            repository.save(oldProducto);
        }

    }

    public List<Producto> listar() {
        return null;
    }

    public Producto buscarPorId(int idProducto) {
        return null;
    }

    public void eliminar(int idProducto) {

    }

    public List<Producto> buscarPorNombre(String nombre) {
        return null;
    }
}
