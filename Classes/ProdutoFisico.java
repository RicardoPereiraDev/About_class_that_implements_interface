package Classes;

import Interfaces.Calculavel;

public class ProdutoFisico implements Calculavel {

    double descontos;
    double taxaAdicionais;

    double precoInicial = 0;
    @Override
    public double calcularPrecoFinal(double descontos, double taxaAdicionais) {
        precoInicial -= descontos + taxaAdicionais;

        return precoInicial;
    }
}
