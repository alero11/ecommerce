package com.example.demo8.controller;

import com.example.demo8.dto.ProductoDto;
import com.example.demo8.entity.Producto;
import com.example.demo8.service.IProductoService;
import com.example.demo8.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


////////// REST ///////////////////////
//POST << crear
//PUT << actualizar
//DELETE << borrar
//GET <<< LISTADO, BUSCAR POR ID, BUSCAR POR NOMBRE

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoServiceImpl service;

    @Autowired
    IProductoService iProductoService;

    @PostMapping
    public ResponseEntity<ProductoDto> guardar(@RequestBody ProductoDto producto){
        ProductoDto resultado = service.guardar(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
    }

    @PutMapping
    public void actualizar(@RequestBody Producto producto) {
        service.actualizar(producto);
    }

    @PutMapping("/actualizar/{id}")
    public void actualizar2metodo(@PathVariable Integer id,
            @RequestBody Producto producto) {


        iProductoService.actualizarPorId(id,producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Integer id){
        service.eliminar(id);
    }

    @GetMapping
    public List<Producto> obtenerProductos(){
        List<Producto> productos = service.listar();
        return productos;
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable Integer id){
        return  service.buscarPorId(id);
    }


}
