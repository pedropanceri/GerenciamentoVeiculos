package GerenciamentoVeiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoVeiculos {
    public static void main(String[] args) {
        //String marca, String modelo, int rodas, int ano, float preco
        boolean opc = true;
        int c = 1;

        Scanner scanner = new Scanner(System.in);

        //ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        while (opc) {
            System.out.println("Gostaria de adicionar um veículo à lista? Caso sim, digite 1. Caso deseje finalizar o atendimento, digite 0. ");
            int resp = scanner.nextInt();
            if (resp == 1){
                System.out.println("Qual tipo de veículo gostaria de adicionar? ");
                System.out.println("1: Carro ");
                System.out.println("2: Moto ");
                System.out.println("3: Caminhão ");
                System.out.println("Digite 0 caso queira encerrar o atendimento. ");
                resp = scanner.nextInt();
            }
            else{
                break;
            }
            if (resp == 1){
                System.out.println("Marca do carro: ");
                String marca = scanner.next();

                System.out.println("Modelo do carro: ");
                String modelo = scanner.next();

                System.out.println("Ano do modelo: ");
                int ano = scanner.nextInt();

                System.out.println("Preço: R$");
                float preco = scanner.nextFloat();

                System.out.println("Placa: ");
                String placa = scanner.next();

                System.out.println("Número de portas: ");
                int portas = scanner.nextInt();

                Carro carro = new Carro(marca, modelo, ano, preco, placa, portas);
                System.out.println("Carro adicionado com sucesso! ");
                carro.detalhes();

            }
            else if (resp == 2){
                System.out.println("Marca da moto: ");
                String marca = scanner.next();

                System.out.println("Modelo: ");
                String modelo = scanner.next();

                System.out.println("Ano do modelo: ");
                int ano = scanner.nextInt();

                System.out.println("Preço: R$");
                float preco = scanner.nextFloat();

                System.out.println("Placa: ");
                String placa = scanner.next();

                System.out.println("Cilindradas: ");
                int cilindradas = scanner.nextInt();

                Moto moto = new Moto(marca, modelo, ano, preco, placa, cilindradas);
                System.out.println("Moto adicionada com sucesso! ");
                moto.detalhes();
            }
            else if (resp == 3){
                System.out.println("Marca do caminhão: ");
                String marca = scanner.next();

                System.out.println("Modelo: ");
                String modelo = scanner.next();

                System.out.println("Ano do modelo: ");
                int ano = scanner.nextInt();

                System.out.println("Preço: R$");
                float preco = scanner.nextFloat();

                System.out.println("Placa: ");
                String placa = scanner.next();

                System.out.println("Capacidade (toneladas): ");
                int capacidade = scanner.nextInt();

                System.out.println("Número de eixos: ");
                int eixos = scanner.nextInt();

                System.out.println("Número de rodas: ");
                int rodas = scanner.nextInt();

                Caminhao caminhao = new Caminhao(marca, modelo, ano, preco, placa, capacidade, eixos, rodas);
                System.out.println("Caminhão adicionado com sucesso! ");
                caminhao.detalhes();
            }
            else if (resp == 0){
                System.out.println("Atendimento finalizado. ");
                break;
            } else{
                System.out.println("Digite uma opção válida.");
            }
        }
    }
}

