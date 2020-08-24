package lp2.atividade;

import lp2.atividade.dados;


public class motorista extends dados {
 private String rota;
 private String cnh;
 
 public motorista(String rota, String cnh, String cpf, String nome, int DatadeNascimento, int pis, String usuario, String senha) {
 super(cpf, nome, DatadeNascimento, pis, usuario, senha);
 this.rota = rota;
 this.cnh = cnh;
  }

public String getRota() {
	return rota;
}

public void setRota(String rota) {
	this.rota = rota;
}

public String getCnh() {
	return cnh;
}

public void setCnh(String cnh) {
	this.cnh = cnh;
}

}
