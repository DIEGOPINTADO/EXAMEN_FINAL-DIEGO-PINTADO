package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Proveedor;
import pe.isil.repository.ProveedorRepository;

import java.util.List;

@Service
public class ProveedorService {


    @Autowired
    private ProveedorRepository proveedorRepository;

    public void createOrUpdate(Proveedor proveedor){
        proveedorRepository.save(proveedor);
    }

    public void delete(Integer id){
        proveedorRepository.deleteById(id);
    }

    public Proveedor findById(Integer id){
        return proveedorRepository.findById(id).orElse(null);
    }

    public List<Proveedor> findAll(){
        return proveedorRepository.findAll();
    }
}
