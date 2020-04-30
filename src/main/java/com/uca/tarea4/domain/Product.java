package com.uca.tarea4.domain;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Product {
	
	@NotEmpty(message = "No puedes dejar este campo vacio")
	@Digits(integer=12, fraction=0, message = "No se pueden ingresar numeros decimales")
	@Size(min=12, max=12, message="El codigo de producto debe contener exactamente 12 digitos")
	private String pCode;
	
	@NotEmpty(message = "No puedes dejar este campo vacio")
	@Size(min=1, max=100, message="El nombre debe contener 1 caracter como mininmo y 100 como max")
	private String pName;
	
	@NotEmpty(message = "No puedes dejar este campo vacio")
	@Size(min=1, max=100, message="El nombre debe contener 1 caracter como mininmo y 100 como max")
	private String pBrand;
	
	@NotEmpty(message = "No puedes dejar este campo vacio")
	@Size(min=1, max=500, message="El nombre debe contener 1 caracter como mininmo y 500 como max")
	private String pDesc;
	
	@NotEmpty(message = "No puedes dejar este campo vacio")
	@Digits(integer=10, fraction=0, message = "No se pueden ingresar numeros decimales")
	private String pExistence;
	
	@NotEmpty(message = "La cagaste")
	@Pattern(regexp = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))", message="la fecha no tiene el formato requerido")
	private String pEDate;
	
	
	public Product() {

	}


	public Product(String pCode, String pName, String pBrand, String pDesc, String pExistence, String pEDate) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pBrand = pBrand;
		this.pDesc = pDesc;
		this.pExistence = pExistence;
		this.pEDate = pEDate;
	}


	public String getpCode() {
		return pCode;
	}


	public void setpCode(String pCode) {
		this.pCode = pCode;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getpBrand() {
		return pBrand;
	}


	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}


	public String getpDesc() {
		return pDesc;
	}


	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}


	public String getpExistence() {
		return pExistence;
	}


	public void setpExistence(String pExistence) {
		this.pExistence = pExistence;
	}


	public String getpEDate() {
		return pEDate;
	}


	public void setpEDate(String pEDate) {
		this.pEDate = pEDate;
	}
	
	

	
}
