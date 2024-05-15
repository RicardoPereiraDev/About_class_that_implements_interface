package Classes;

import Interfaces.Calculavel;

public class Livro implements Calculavel {

   // double descontos;
    //double taxaAdicionais;

    double precoInicial = 0;
    @Override
   public double calcularPrecoFinal(double descontos, double taxaAdicionais){
        precoInicial -= descontos + taxaAdicionais;

        return precoInicial;
    }

    public double getPrecoInicial() {
        return precoInicial;
    }

    public void setPrecoInicial(double precoInicial) {
        this.precoInicial = precoInicial;
    }
}
