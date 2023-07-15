package com.example.demo8.repository;

import com.example.demo8.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {

//    consulta JPA
//    @Query(value = "select c from Producto where nombreProducto like %?0%")
//    List<Producto> encontrarProductosPorNombre(@Param("nombre") String nombre);

//    consulta QUERY NATIVA
    @Query(value = "select * from producto where nombre_producto like %:nombre%",nativeQuery = true)
    List encontrarProductosPorNombreNativo(@Param("nombre") String nombre);

//    consulta por funcion
    List<Producto> findAllByNombreProducto(String nombre);
}
