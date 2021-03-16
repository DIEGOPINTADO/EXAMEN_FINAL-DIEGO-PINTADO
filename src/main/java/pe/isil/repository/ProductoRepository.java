package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.isil.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {

   // @Query("select c from Producto c where c.id_producto =  :id")
    //Producto findById(String id);

    }
