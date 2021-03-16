package pe.isil.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tbl_proveedor")
@Entity
public class Proveedor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "proveedor_id")
    private Integer id_proveedor;
    private String ruc;
    private String nombre_proveedor;
    private String email;
    private String telefono;

    @Column(name = "producto_Id")
    private Integer productoId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "producto_id",insertable = false , updatable = false)
    private Producto producto;

}
