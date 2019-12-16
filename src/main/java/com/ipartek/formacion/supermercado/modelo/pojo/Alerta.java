package com.ipartek.formacion.supermercado.modelo.pojo;

public class Alerta {

	// TODO resto de tipos
	public static final String TIPO_PRIMARY = "primary";
	public static final String TIPO_DANGER = "danger";

	private String tipo;
	private String texto;

	public Alerta() {
		super();
		this.texto = "ERROR inesperado en la aplicación";
		this.tipo = "danger";
	}

	public Alerta(String tipo, String texto) {
		super();
		this.tipo = tipo;
		this.texto = texto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public static String getTipoPrimary() {
		return TIPO_PRIMARY;
	}

	public static String getTipoDanger() {
		return TIPO_DANGER;
	}

}
