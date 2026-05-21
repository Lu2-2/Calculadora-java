public class Operacoes {

    public double opAdicao(double a, double b){
        return a + b;
    }

    public double opSubtracao(double a, double b){
        return a - b;
    }

    public double opDivisao(double a, double b){
        return a / b;
    }

    public double opMultiplicacao(double a, double b){
        return a * b;
    }

    public double opPotencia(double a, double b){
        return Math.pow(a,b);
    }

    public double opRaizQ(double a){
        return Math.sqrt(a);
    }

    public double opPorcentagem(double a, double b){
        return (a*100) / b ;
    }

    public double opMedia(double soma, int cont){
        return  soma / cont;
    }


}
