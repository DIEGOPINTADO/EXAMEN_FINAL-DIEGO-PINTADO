package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.isil.model.Producto;
import pe.isil.model.Proveedor;
import pe.isil.service.ProductoService;
import pe.isil.service.ProveedorService;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/product")
    public String productosList(Model model){
        model.addAttribute("proveed",productoService.findAll());
        return "producto";
    }

    @GetMapping("/product/add")
    public String productoAdd(Model model){
        model.addAttribute("product",new Producto());
        return "producto-add";
    }

    @PostMapping("/product/save")
    public String productoSave(Producto producto){
        productoService.createOrUpdate(producto);
        return "redirect:/product";
    }

    @GetMapping("/product/edit/{id}")
    public String productoEdit(@PathVariable Integer id,Model model){
        model.addAttribute("product", productoService.findById(id));
     return "producto-add";
    }

    @GetMapping("/product/delete/{id}")
    public String productoDelete(@PathVariable Integer id){
        productoService.delete(id);
        return "redirect:/product";
    }
}
