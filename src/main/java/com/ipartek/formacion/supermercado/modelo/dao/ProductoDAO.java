package com.ipartek.formacion.supermercado.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.supermercado.modelo.pojo.Producto;

public class ProductoDAO implements IDAO<Producto> {

	// Singleton
	private static ProductoDAO INSTANCE;

	// Simulacion BBDD
	private ArrayList<Producto> registros;
	private int indice = 1;

	// Constructor
	private ProductoDAO() {
		super();
		registros = new ArrayList<Producto>();
//		for (int i = 0; i < 10; i++) {
//			registros.add(new Producto());
//			indice++;
//		}
		registros.add(
				new Producto(++indice, "Zumo", 2.75f, "https://supermercado.eroski.es/images/13899539.jpg", "Zumo", 2));
		registros.add(new Producto(++indice, "CavaBrut", 13.95f, "https://supermercado.eroski.es/images/399691.jpg",
				"Bebida Cava", 5));
		registros.add(new Producto(++indice, "Mimosin", 3.99f, "https://supermercado.eroski.es/images/19614684.jpg",
				"Suavizante", 2));
		registros.add(new Producto(++indice, "La Gula", 4.75f, "https://supermercado.eroski.es/images/19780345.jpg",
				"La gula del norte", 15));
		registros.add(new Producto(++indice, "San Miguel", 8.79f, "https://supermercado.eroski.es/images/16514556.jpg",
				"Cerveza", 3));
		registros.add(new Producto(++indice, "Tartaleta de marisco", 6.95f,
				"https://supermercado.eroski.es/images/20206900.jpg", "Tartaleta", 5));
		registros.add(new Producto(++indice, "Kiwi Zespri Green", 3.75f,
				"https://supermercado.eroski.es/images/12063319.jpg", "Kiwi Zespri Green", 7));
		registros.add(new Producto(++indice, "XLS Kilos/centímetros", 34.60f,
				"https://supermercado.eroski.es/images/17967647.jpg", "XLS Kilos/centímetros", 2));
		registros.add(new Producto(++indice, "Lechuga Label PAís Vasco", 1.39f,
				"https://supermercado.eroski.es/images/13344924.jpg", "Lechuga Label País Vasco", 5));
		registros.add(new Producto(++indice, "Chocolate", 2.29f, "https://supermercado.eroski.es/images/487595.jpg",
				"Chocolate 70% Cacao Lindt", 15));

	}

	public static synchronized ProductoDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ProductoDAO();
		}
		return INSTANCE;
	}

	@Override
	public List<Producto> getAll() {
		return registros;
	}

	@Override
	public Producto getbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto update(int id, Producto pojo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto create(Producto pojo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
