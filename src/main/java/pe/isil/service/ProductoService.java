package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Producto;
import pe.isil.repository.ProductoRepository;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public void createOrUpdate(Producto producto){
        productoRepository.save(producto);
    }

    public void delete(Integer id){
        productoRepository.deleteById(id);
    }

    public Producto findById(Integer id){
        return productoRepository.findById(id).orElse(null);
    }

    public List<Producto> findAll(){
        return productoRepository.findAll();
    }
}
