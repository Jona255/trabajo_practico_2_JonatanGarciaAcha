package ar.edu.unju.fi.ejercicio2.model;

import ar.edu.unju.fi.ejercicio2.model.constantes.Mes;

public class Efemeride {
	private int codigo;
	private Mes mes;
	private int dia;
	private String detalle;
	
	
	public Efemeride() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Efemeride [codigo=" + codigo + ", mes=" + mes + ", dia=" + dia + ", detalle=" + detalle + "]";
	}



	public Efemeride(int codigo, Mes mes, int dia, String detalle) {
		super();
		this.codigo = codigo;
		this.mes = mes;
		this.dia = dia;
		this.detalle = detalle;
	}



	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Mes getMes() {
		return mes;
	}


	public void setMes(int opc) {
		switch (opc) {
		case 1:
			this.mes = Mes.ENERO;
			break;
		case 2:
			this.mes = Mes.FEBRERO;
			break;
		case 3:			
			this.mes = Mes.MARZO;
			break;
		case 4:
			this.mes = Mes.ABRIL;			
			break;
		case 5:
			this.mes = Mes.MAYO;						
			break;
		case 6:
			this.mes = Mes.JUNIO;			
			break;
		case 7:
			this.mes = Mes.JULIO;			
			break;
		case 8:
			this.mes = Mes.AGOSTO;			
			break;
		case 9:
			this.mes = Mes.SEPTIEMBRE;			
			break;
		case 10:
			this.mes = Mes.OCTUBRE;			
			break;
		case 11:
			this.mes = Mes.NOVIEMBRE;			
			break;
		case 12:
			this.mes = Mes.DICIEMBRE;					
			break;

		default:
			break;
		}
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
}
