import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);

        String nome = "Tony Stark";
        String tipoDeConta = "Corrente";
        double saldoConta = 2500.00;
        int operacao = 0;
        double valorAReceber =0;
        double valorTransferencia = 0;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println(String.format("Saldo inicial R$ %.2f", saldoConta));

        System.out.println("************************************\n");

        String menu = """
                \nOperações
                1- Consultar Saldos
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                """;

        while (operacao != 4){
            System.out.println(menu);


            System.out.println("Digite a opção desejada: ");
            operacao = leitura.nextInt();


            if (operacao == 1){
                System.out.println(String.format("Saldo em conta R$ %.2f", saldoConta));

            }else if (operacao == 2){
                System.out.println("Informe o valor a receber:");
                valorAReceber = leitura.nextDouble();
                saldoConta +=  valorAReceber;
                System.out.println(String.format("Saldo atualidao R$ %.2f", saldoConta));

            }else if (operacao == 3){
                System.out.println("Informe o valor que deseja transferir:");
                valorTransferencia = leitura.nextDouble();

                if (valorTransferencia <= saldoConta){
                    saldoConta -= valorTransferencia;
                    System.out.println(String.format("Saldo atualidao R$ %.2f", saldoConta));
                } else {
                    System.out.println("Saldo insuficiente");
                }

            }else if (operacao == 4){
                System.out.println("Sistema finalizado");
            }else {
                System.out.println("Opção inválida");
            }

        }
    }
}