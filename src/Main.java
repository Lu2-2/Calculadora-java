import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();
        int resp;
        double a, b = 0;
        boolean autenticador = true;

        do{
            System.out.println("Seja bem-vindo. ");
            System.out.println("1. Soma ");
            System.out.println("2. Subtração ");
            System.out.println("3. Divisão ");
            System.out.println("4. Multiplicação ");
            System.out.println("5. Potência ");
            System.out.println("6. Raiz quadrada ");
            System.out.println("7. Porcentagem ");
            System.out.println("8. Média ");
            System.out.println("9. Fatorial ");
            System.out.println("10. Fechar ");

            resp = sc.nextInt();

            switch (resp){
                case 1:
                    do {
                        System.out.println("Digite 1. número: ");
                        a = sc.nextDouble();
                        System.out.println("Digite 2. número: ");
                        b = sc.nextDouble();

                        System.out.println(op.opSoma(a, b));

                        System.out.println("Continuar (1) ou Alterrar (2)");
                        resp = sc.nextInt();

                    }while(resp != 2);
                    break;

                case 2:
                    do {
                        System.out.println("Digite 1. número: ");
                        a = sc.nextDouble();
                        System.out.println("Digite 2. número: ");
                        b = sc.nextDouble();

                        System.out.println(op.opSubtracao(a, b));

                        System.out.println("Continuar (1) ou Alterrar (2)");
                        resp = sc.nextInt();

                    }while(resp != 2);
                    break;

                case 3:
                    do {
                        System.out.println("Digite 1. número: ");
                        a = sc.nextDouble();
                        System.out.println("Digite 2. número: ");
                        b = sc.nextDouble();

                        System.out.println(op.opDivisao(a, b));

                        System.out.println("Continuar (1) ou Alterrar (2)");
                        resp = sc.nextInt();

                    }while(resp != 2);
                    break;

                case 4:
                    do {
                        System.out.println("Digite 1. número: ");
                        a = sc.nextDouble();
                        System.out.println("Digite 2. número: ");
                        b = sc.nextDouble();

                        System.out.println(op.opMultiplicacao(a, b));

                        System.out.println("Continuar (1) ou Alterrar (2)");
                        resp = sc.nextInt();

                    }while(resp != 2);
                    break;

                case 5:
                    do {
                        System.out.println("Digite o número: ");
                        a = sc.nextDouble();
                        System.out.println("Digite a potência: ");
                        b = sc.nextDouble();

                        System.out.println(op.opPotencia(a,b));

                        System.out.println("Continuar (1) ou Alterrar (2)");
                        resp = sc.nextInt();

                    }while(resp != 2);
                    break;

                case 6:
                    do {
                        System.out.println("Digite o número: ");
                        a = sc.nextDouble();

                        System.out.println(op.opRaizQ(a));

                        System.out.println("Continuar (1) ou Alterrar (2)");
                        resp = sc.nextInt();

                    }while(resp != 2);
                    break;

                case 7:
                    do {
                        System.out.println("Digite o número para referência: ");
                        a = sc.nextDouble();
                        System.out.println("Digite o número da quantidade: ");
                        b = sc.nextDouble();

                        System.out.println(op.opPorcentagem(a,b) + "%");

                        System.out.println("Continuar (1) ou Alterrar (2)");
                        resp = sc.nextInt();

                    }while(resp != 2);
                    break;

                case 8:
                    do {
                        System.out.println("Digite o número para referência: ");
                        a = sc.nextDouble();
                        System.out.println("Digite o número da quantidade: ");
                        b = sc.nextDouble();

                        System.out.println(op.opMedia(a,b) + "%");

                        System.out.println("Continuar (1) ou Alterrar (2)");
                        resp = sc.nextInt();

                    }while(resp != 2);
                    break;

                case 10:
                    autenticador = false;
                    break;
            }

        }while(autenticador == true);
        System.out.println("Sistema fechando...");
    }
}