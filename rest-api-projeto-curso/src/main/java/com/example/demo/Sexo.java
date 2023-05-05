package com.example.demo;

public enum Sexo {
	M("Masculino"),
	F("Feminino"),
	I("Não Informar");
	
	private String sexo;
	
	Sexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
