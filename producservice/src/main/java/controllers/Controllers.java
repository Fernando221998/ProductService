package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.Producto;
import service.ServicioProductoI;

@RestController
@RequestMapping("*")
public class Controllers {
	
	@Autowired
	private ServicioProductoI servicioProductoI;
	
	@GetMapping(value="/{id}")
	public Producto getProducto(@PathVariable Integer id) {
		System.out.println(id);
		return servicioProductoI.porGetProducto(id);
	}
	
	@PostMapping(value="/{id}")
	public Producto postProduct(@PathVariable Integer id) {
		return servicioProductoI.porPostProduct(id);
	}

}
