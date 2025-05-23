package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productCrudRepository.findAll();
    }
}
