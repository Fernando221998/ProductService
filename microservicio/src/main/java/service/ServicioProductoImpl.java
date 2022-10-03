package service;

import org.springframework.stereotype.Service;

import dto.Producto;

@Service
public class ServicioProductoImpl implements ServicioProductoI {

	@Override
	public Producto porGetProducto(Integer id) {
		return new Producto(id, "GET");
	}

	@Override
	public Producto porPostProduct(Integer id) {
		return new Producto(id, "POST");
	}

	
}
