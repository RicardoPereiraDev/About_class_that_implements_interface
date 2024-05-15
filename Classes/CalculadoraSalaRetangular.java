package Classes;

import Interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    //Atributos

    double altura;
    double largura;

    @Override
    public void calcularArea(double altura, double largura) {
        double resultadoDaArea = altura * largura;

        System.out.println("Resultado do calculo da área = " + resultadoDaArea);
    }

    @Override
    public double calcularPerimetro(double largura, double altura) {
        double resultado = (largura * 2) + (altura * 2);
        return resultado;
    }
}
