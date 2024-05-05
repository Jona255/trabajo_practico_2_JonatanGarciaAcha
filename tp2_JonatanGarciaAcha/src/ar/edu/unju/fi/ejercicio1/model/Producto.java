package ar.edu.unju.fi.ejercicio1.model;

import ar.edu.unju.fi.ejercicio1.model.constantes.Categoria;
import ar.edu.unju.fi.ejercicio1.model.constantes.OrigenFabricacion;

public class Producto {
	private int codigo;
	private String descripcion;
	private float precioUnitario;
	private OrigenFabricacion origen;
	private Categoria categoria;
	
	public Producto() {
		super();
	}
	
	
	
	public Producto(int codigo, String descripcion, float precioUnitario, OrigenFabricacion origen,
			Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.origen = origen;
		this.categoria = categoria;
	}



	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", origen=" + origen + ", categoria=" + categoria + "]";
	}



	public OrigenFabricacion getOrigen() {
		return origen;
	}



	public void setOrigen(int opc) {
		switch (opc) {
		case 0:			
			this.origen = origen.ARGENTINA;
			break;
		case 1:			
			this.origen = origen.BRASIL;
			break;
		case 2:
			this.origen = origen.CHINA;
			break;
		case 3:
			this.origen = origen.URUGUAY;
			break;
		default:
			break;
		}
	}



	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(int opc) {
		switch (opc) {
		case 0:			
			this.categoria = categoria.TELEFONIA;
			break;
		case 1:			
			this.categoria= categoria.INFORMATICA;
			break;
		case 2:
			this.categoria= categoria.ELECTROHOGAR;
			break;
		case 3:
			this.categoria= categoria.HERRAMIENTAS;
			break;
		default:
			break;
		}
	}



	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
}
