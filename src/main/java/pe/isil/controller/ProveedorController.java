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
public class ProveedorController {

    @Autowired
    private ProductoService productoService;


    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/proveedor")
    public String proveedoresList(Model model){
        model.addAttribute("proveedor",proveedorService.findAll());
        return "proveedor";
    }

    @GetMapping("/proveedor/add")
    public String proveedorAdd(Model model){
        model.addAttribute("proveedor",new Proveedor());
        model.addAttribute("proveed", productoService.findAll());
        return "proveedor-add";
    }

    @PostMapping("/proveedor/save")
    public String proveedorSave(Proveedor proveedor){
        proveedorService.createOrUpdate(proveedor);
        return "redirect:/proveedor";
    }

    @GetMapping("/proveedor/edit/{id}")
    public String proveedorEdit(@PathVariable Integer id, Model model){
        model.addAttribute("proveedor", proveedorService.findById(id));
        model.addAttribute("proveed", productoService.findAll());
        return "proveedor-add";
    }

    @GetMapping("/proveedor/delete/{id}")
    public String proveedorDelete(@PathVariable Integer id){
        proveedorService.delete(id);
        return "redirect:/proveedor";
    }
}
