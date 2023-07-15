package com.example.demo8.service;

import com.example.demo8.dto.ProductoDto;
import com.example.demo8.entity.Producto;
import com.example.demo8.repository.ProductoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repository;

    @Override
    public ProductoDto guardar(ProductoDto productoDto) {
        Producto newProducto = new Producto();
        BeanUtils.copyProperties(productoDto,newProducto);
        Producto resultado = repository.save(newProducto);
        ProductoDto resultadoDto = mapearProductoDto(resultado);
        return resultadoDto;
    }

    @Override
    public void actualizar(Producto producto) {
        repository.save(producto);
    }

    @Override
    public List<Producto> listar() {
        return repository.findAll();
    }

    @Override
    public Producto buscarPorId(int idProducto) {
        return repository.findById(idProducto).orElse(null);
    }

    @Override
    public void eliminar(int idProducto) {
        repository.deleteById(idProducto);
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre) {
        return null;
    }

    private Producto mapearProducto(ProductoDto productoDto){
        Producto newProducto = new Producto();
        newProducto.setIdProducto(productoDto.getIdProducto());
        newProducto.setNombreProducto(productoDto.getNombreProducto());
        newProducto.setDescripcion(productoDto.getDescripcion());
        newProducto.setPrecio(productoDto.getPrecio());
        return newProducto;
    }

    private ProductoDto mapearProductoDto(Producto producto){
        ProductoDto newProductoDto = new ProductoDto();
        newProductoDto.setIdProducto(producto.getIdProducto());
        newProductoDto.setNombreProducto(producto.getNombreProducto());
        newProductoDto.setDescripcion(producto.getDescripcion());
        newProductoDto.setPrecio(producto.getPrecio());
        return newProductoDto;
    }
}
