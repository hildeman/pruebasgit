package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPRESA")
public class Empresa {

	
@Id
@Column(name="ID_EMPRESA")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id_empresa;

@Column(name="RAZON_SOCIAL")
private String razon_social;

@Column(name="RIF")
private String rif;

@Column(name="UBICACION")
private String ubicacion;

@Column(name="DIRECCION")
private String direccion ;

@Column(name="ESTATUS")
private String  estatus ;



public Empresa() {
}



public Empresa(String razon_social, String rif, String ubicacion, String direccion, String estatus) {
	this.razon_social = razon_social;
	this.rif = rif;
	this.ubicacion = ubicacion;
	this.direccion = direccion;
	this.estatus = estatus;
}



public int getId_empresa() {
	return id_empresa;
}



public void setId_empresa(int id_empresa) {
	this.id_empresa = id_empresa;
}



public String getRazon_social() {
	return razon_social;
}



public void setRazon_social(String razon_social) {
	this.razon_social = razon_social;
}



public String getRif() {
	return rif;
}



public void setRif(String rif) {
	this.rif = rif;
}



public String getUbicacion() {
	return ubicacion;
}



public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}



public String getDireccion() {
	return direccion;
}



public void setDireccion(String direccion) {
	this.direccion = direccion;
}



public String getEstatus() {
	return estatus;
}



public void setEstatus(String estatus) {
	this.estatus = estatus;
}



@Override
public String toString() {
	return "Empresa [id_empresa=" + id_empresa + ", razon_social=" + razon_social + ", rif=" + rif + ", ubicacion="
			+ ubicacion + ", direccion=" + direccion + ", estatus=" + estatus + "]";
}























}