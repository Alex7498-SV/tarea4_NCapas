package com.uca.tarea4.domain;

import java.util.Date;

public class Producto {
	
	private int pCode;
	private String pName;
	private String pBrand;
	private String pDesc;
	private int pExistence;
	private Date pEDate;
	
	
	public Producto() {
		super();
	}


	public Producto(int pCode, String pName, String pBrand, String pDesc, int pExistence, Date pEDate) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pBrand = pBrand;
		this.pDesc = pDesc;
		this.pExistence = pExistence;
		this.pEDate = pEDate;
	}


	public int getpCode() {
		return pCode;
	}


	public void setpCode(int pCode) {
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


	public int getpExistence() {
		return pExistence;
	}


	public void setpExistence(int pExistence) {
		this.pExistence = pExistence;
	}


	public Date getpEDate() {
		return pEDate;
	}


	public void setpEDate(Date pEDate) {
		this.pEDate = pEDate;
	}
	
	

	
}
