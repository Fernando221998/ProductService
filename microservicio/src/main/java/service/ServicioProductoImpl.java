package service;

import dto.Producto;

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
