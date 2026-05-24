import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();
        int resp;
        double num1 = 0, num2 = 0;
        double numUnico = 0;

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
                numUnico = sc.nextDouble();
            }

            else if(resp == 0){
                break;
            }

            else if (resp >= 1 && resp <= 7){
                System.out.println("Digite 1. número: ");
                num1 = sc.nextDouble();
                System.out.println("Digite 2. número: ");
                num2 = sc.nextDouble();
            }

            switch (resp) {
                case 1:
                    double adicao = op.opAdicao(num1,num2);

                    System.out.println(num1 + " + " + num2);
                    System.out.println("Resulta: " + adicao);

                    break;

                case 2:
                    double subtracao = op.opSubtracao(num1,num2);

                    System.out.println(num1 + " - " + num2);
                    System.out.println("Resultado: " + subtracao);

                    break;

                case 3:
                    double divisao = op.opDivisao(num1,num2);

                    if (num2 == 0){
                        System.out.println("Erro: Número não pode ser dividio por zero.");
                    } else {
                        System.out.println(num1 + " / " + num2);
                        System.out.println("Resultado: " + divisao);
                    }

                    break;

                case 4:
                    double multiplicacao = op.opMultiplicacao(num1,num2);

                    System.out.println(num1 + " x " + num2);
                    System.out.println("Resultado: " + multiplicacao);

                    break;

                case 5:
                    double potencia = op.opPotencia(num1,num2);

                    System.out.println(num1 + " ^ " + num2);
                    System.out.println("Resultado: " + potencia);

                    break;

                case 6:
                    double raiz = op.opRaizQ(numUnico);

                    System.out.println("A raiz quadrada de: " + numUnico);
                    System.out.println("Resulta em: " + raiz);

                    break;

                case 7:
                    double porcentagem = op.opPorcentagem(num1,num2);

                    System.out.println(num1 + " representa: " + porcentagem + "%");
                    System.out.println("De " + num2);

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
                    break;

                case 9:
                    int fatorial = 1;

                    for (int i = 1; i <= numUnico; i++) {
                        fatorial = op.opFatorial(fatorial, i);
                    }

                    System.out.println("O fatorial de " + numUnico + " é: " + fatorial);
                    break;
            }

            System.out.println("Voltar para o menu?");
            System.out.println("Sim [1] Não [2]");

            resp = sc.nextInt();

            if(resp == 2){
                break;
            }

        } while (true);

        System.out.println("Fechando o sistema ...");

        sc.close();
    }
}