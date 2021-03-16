package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.isil.model.Producto;
import pe.isil.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor , Integer> {

//    @Query("select c from Proveedor c where c.id_proveedor =  :id")
  //  Proveedor findById(String id);




}
