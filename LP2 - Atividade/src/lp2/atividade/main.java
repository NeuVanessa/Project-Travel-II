//FEITO POR VANESSA SILVA, ESTUDANTE DE ANALISE DE SISTEMA, NÃO PEGUEI A MATÉRIA NO SEMESTRE 2020.1, PORÉM APROVEITEI E FIZ ESSA ATIVIDADE AVALIATIVA
// Pode usa-lo caso precise para obter nota.
package lp2.atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class main extends dados {

    public static void main(String[] args) {

        System.out.println("==== SISTEMA DE VIAGENS ====\n");
        System.out.println("==== QUEM REGISTROU A PASSAGEM ====");
        //Arraylist de funcionários
        ArrayList<funcionario> f = new ArrayList();
        //cadastro do funcionário
        funcionario func = new funcionario("789456789", "Leandro Dos Santos de Jesus", 24-03-1996, 545418925, "Leo", "leo246782");
        f.add(func);

        //chamando a classe funcionário em seguida adicionando e mostrando na tela seus dados cadastrados 
        ArrayList<motorista> m = new ArrayList();

        //Cadastro de motoristas, segue a mestra estrutura do cadastro do funcionario, porém com novos atributos.
        motorista m1 = new motorista("Rio de Janeiro", "CNH: 54165414652", "CPF :42584659742", "Pedro Dos santos Junior", 31-06-1996, 312585487,  "Pedro123", "pedroP741868");
        m.add(m1);

        cliente[] Array = new cliente[3];
        ArrayList<cliente> c = new ArrayList();
        Array[0] = new cliente("CPF: 548752562", "Nome: João Victor dos Santos", 14228547 - 05, "Endereço: Rua Margarida", "Origin: Slavador", "Destino: Rio de Janeiro", 585.58);
        Array[1] = new cliente("CPF: 841524121", "Nome: Mariel Jose da Silva", 66885485 - 80, "Endereço: Rua São Miguel", "Origin: São Paulo", "Destino: Rio de Janeiro", 485.98);
        Array[2] = new cliente("CPF: 965854754", "Nome: Vanessa Lopes", 78548565 - 15, "Endereço: Rua São Jorge", "Origin: Pojuca", "Destino: Rio de Janeiro", 540.58);

        List<cliente> cli = new ArrayList<>();

        ArrayList<van> v = new ArrayList();
        van transporte = new van("chassi: 9 B2 H15D2D 8 V306585", "R02B352");
        v.add(transporte);

        ///
        try {

            for (funcionario i : f) {
                System.out.println(i.getMatricula());
                System.out.println(i.getNome());
                //Não solicitei todos os getters pois só preciso de algumas informaçoes desse funcionário log

            }
            for (van i : v) {
                System.out.println("");
                System.out.println(" INFORMAÇÃO DA VIAGEM ");
                System.out.println("==== VEÍCULO ====");
                System.out.println("" + i.getChassi());
                System.out.println("" + i.getPlaca());
            }
            System.out.println("==== DADOS DO MOTORISTA ====");
            for (motorista i : m) {
                System.out.println("" + i.getNome());
                System.out.println("Rota:" + i.getRota());
            }
            System.out.println("==== CLIENTES E DESITNOS ====");
            for (int i = 0; i < Array.length; i++) {
                System.out.println("==========================================");
                System.out.println(Array[i].nome);
                System.out.println(Array[i].cpf);
                System.out.println(Array[i].endereco);
                System.out.println(Array[i].origem);
                System.out.println(Array[i].destino);
                System.out.println(Array[i].servico);
            }

        } catch (Exception ops) {
            System.out.println("Ops, Gerou um erro: " + ops);
        }

    }

    public main(String cpf, String nome, int DatadeNascimento, int pis, String usuario, String senha) {
        super(cpf, nome, DatadeNascimento, pis, usuario, senha);
    }

}
