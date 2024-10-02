import java.util.Random;
import java.util.Scanner;

public class Atividade06revsiao {
    public static void main(String[] args) {


        int opcao = 0;

        Scanner sc = new Scanner(System.in);
        String[] tarefas = {"Limpar a casa", "Programar","Correr","Cozinhar","Tomar Banho"};

        //Random random = new Random(5);


        while (opcao != 9) {
            System.out.println("Menu Unipar");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Contar");
            System.out.println("6 - Escolher tarefa");
            System.out.println("9 - Sair");
            opcao = sc.nextInt();

        /*switch (opcao) {
            case 1:
                System.out.println("Digite o nome do aluno");
                String nomeAluno = sc.next();
                System.out.println("Digite a primeira nota");
                int primeiraNota = sc.nextInt();
                System.out.println("Digite a segunda nota");
                int segundaNota = sc.nextInt();
                resultado = primeiraNota + segundaNota;
                System.out.println("Resultado é: + resultado);
                break;
                case 2:


        }
        */
            if (opcao == 1) {
                System.out.println("Informe um valor: ");
                int primeiroValor = sc.nextInt();
                System.out.println("Informe outro valor");
                int segundoValor = sc.nextInt();
                int resultado = primeiroValor + segundoValor;
                System.out.println("Resultado: " + resultado);

            } else if (opcao == 2) {
                System.out.println("Informe um valor: ");
                int primeiroValor = sc.nextInt();
                System.out.println("Informe outro valor");
                int segundoValor = sc.nextInt();
                int resultado = primeiroValor - segundoValor;
                System.out.println("Resultado: " + resultado);

            } else if (opcao == 3) {
                System.out.println("Informe um valor: ");
                int primeiroValor = sc.nextInt();
                System.out.println("Informe outro valor");
                int segundoValor = sc.nextInt();
                int resultado = primeiroValor * segundoValor;
                System.out.println("Resultado: " + resultado);

            } else if (opcao == 4) {
                System.out.println("Informe um valor: ");
                int primeiroValor = sc.nextInt();
                System.out.println("Informe outro valor");
                int segundoValor = sc.nextInt();
                double resultado = primeiroValor / segundoValor;
                System.out.println("Resultado: " + resultado);

            }else if(opcao == 5) {
                System.out.println("Até quanto você deseja contar? ");
                int contar = sc.nextInt();

                for (int i = 0; i <= contar; i++) {
                    System.out.println(i);
                }

            } else if (opcao == 6) {



                int valorRondomico =(int) (Math.random() * tarefas.length);
                System.out.println(random.nextInt());

            }
        }

        System.out.println("Voce saiu ! ");
    }
}
