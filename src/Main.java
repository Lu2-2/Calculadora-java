import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();
        int resp;
        double a = 0, b = 0;

        System.out.println("Seja bem-vindo!");

        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Soma ");
            System.out.println("2. Subtração ");
            System.out.println("3. Divisão ");
            System.out.println("4. Multiplicação ");
            System.out.println("5. Potência ");
            System.out.println("6. Raiz quadrada ");
            System.out.println("7. Porcentagem ");
            System.out.println("8. Média ");
            System.out.println("9. Fatorial ");
            System.out.println("0. Fechar ");

            resp = sc.nextInt();

            if ((resp == 6) ||  (resp == 9)){
                System.out.println("Digite o número: ");
                a = sc.nextDouble();
            }

            if(resp == 0){
                break;
            }

            else if (resp >= 1 && resp <= 7){
                System.out.println("Digite 1. número: ");
                a = sc.nextDouble();
                System.out.println("Digite 2. número: ");
                b = sc.nextDouble();

            } else if (resp != 8){
                System.out.println("Opção invalida");
                continue;
            }

            switch (resp) {
                case 1:
                    double adicao = op.opAdicao(a, b);

                    System.out.println(a + " + " + b);
                    System.out.println("Resulta: " + adicao);

                    break;

                case 2:
                    double subtracao = op.opSubtracao(a, b);

                    System.out.println(a + " - " + b);
                    System.out.println("Resultado: " + subtracao);

                    break;

                case 3:
                    double divisao = op.opDivisao(a, b);

                    if (b == 0){
                        System.out.println("Erro: Número não pode ser dividio por zero.");
                    } else {
                        System.out.println(a + " / " + b);
                        System.out.println("Resultado: " + divisao);
                    }

                    break;

                case 4:
                    double multiplicacao = op.opMultiplicacao(a, b);

                    System.out.println(a + " x " + b);
                    System.out.println("Resultado: " + multiplicacao);

                    break;

                case 5:
                    double potencia = op.opPotencia(a, b);

                    System.out.println(a + " ^ " + b);
                    System.out.println("Resultado: " + potencia);

                    break;

                case 6:
                    double raiz = op.opRaizQ(a);

                    System.out.println("A raiz quadrada de: " + a);
                    System.out.println("Resulta em: " + raiz);

                    break;

                case 7:
                    double porcentagem = op.opPorcentagem(a,b);

                    System.out.println(a + " representa: " + porcentagem + "%");
                    System.out.println("De " + b);

                    break;

                case 8:
                    int cont = 0;
                    int continuar = 0;
                    double soma = 0;


                    while(true){
                        System.out.println("Adicione um número");
                        double numeroDigitado = sc.nextDouble();

                        soma += numeroDigitado;
                        cont += 1;

                        if (cont >= 2){
                            System.out.println("Deseja continuar com a soma?");
                            System.out.println("Sim [1] Não [2]");
                            continuar = sc.nextInt();
                        }

                        if (continuar == 2) {
                            break;
                        }
                    }

                    double media = op.opMedia(soma, cont);

                    System.out.println("Soma dos números: " + soma);
                    System.out.println("Quantidade de números: " + cont);
                    System.out.println("Média: " + media);
            }

            System.out.println("Voltar para o menu?");
            System.out.println("Sim [1] Não [2]");

            resp = sc.nextInt();

            if(resp == 2){
                break;
            }

        } while (true);

        System.out.println("Sistema fechando...");

        sc.close();
    }
}