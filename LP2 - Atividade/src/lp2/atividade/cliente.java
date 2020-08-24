package lp2.atividade;


public class cliente extends dados {
 int rg;
 String endereco;
 String origem;
 String destino;
 double servico;
    boolean valorservice;
 
 public cliente(String cpf, String nome, int rg, String endereco, String origem, String destino,double servico ){
 super(cpf, nome);
 this.rg = rg;
 this.endereco = endereco;
 this.origem = origem;
 this.destino = destino;
 this.servico = servico;
     boolean valorservice1 = this.valorservice;
 }

   

public int getRg() {
	return rg;
}

public void setRg(int rg) {
	this.rg = rg;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getOrigem() {
	return origem;
}

public void setOrigem(String origem) {
	this.origem = origem;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}

public double getServico() {
	return servico;
}

public void setServico(double servico) {
	this.servico = servico;
}
}