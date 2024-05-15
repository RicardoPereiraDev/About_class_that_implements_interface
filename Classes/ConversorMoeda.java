package Classes;

import Interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    double valorEmDolar;
    @Override
    public void converterDolarParaReal(double valorEmDolar) {
        double umDolarValeQuantosReais = 5.00; //Valor em reais
        double valorEmDolarConvertidoParaReal   = valorEmDolar * umDolarValeQuantosReais;

        System.out.println("Valor de " + valorEmDolar + " dolares" + " convertido para real é = " + valorEmDolarConvertidoParaReal + " reais");
    }
}
