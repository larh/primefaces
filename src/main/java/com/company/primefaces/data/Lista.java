package com.company.primefaces.data;

import java.util.List;

public class Lista {
	private Long idLista;
	private String nombre;
	private String descripcion;
	private boolean activo;
	private List<Valor> valors;
	public Long getIdLista() {
		return idLista;
	}
	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public List<Valor> getValors() {
		return valors;
	}
	public void setValors(List<Valor> valors) {
		this.valors = valors;
	}
}
