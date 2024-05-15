package mainProgramme;
import Classes.*;
import Interfaces.ConversaoFinanceira;

public class Run {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("---------------------------------------------");

        System.out.println("1º exercicio -> Converter DOLAR para REAL");
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        System.out.println();
        conversorMoeda.converterDolarParaReal(500);
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("2º exercicio -> Calcular a área e o perimetro de uma sala retangular");
        System.out.println();

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        System.out.println("O valor do calculo do Perimetro = " + calculadoraSalaRetangular.calcularPerimetro(2,2));
        System.out.println();
        calculadoraSalaRetangular.calcularArea(4,4);
        System.out.println();
        System.out.println("----------------------------------------------");

        System.out.println("3º exercicio -> Exibir a tabuada de um número");
        System.out.println();

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(8);
        System.out.println();
        System.out.println("----------------------------------------------");

        System.out.println("4º exercicio -> Fórmulas de conversão e exibir os resultados.");
        System.out.println();

        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        System.out.println();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversorTemperaturaPadrao.celsiusParaFahrenheit(temperaturaCelsius);

        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit);
        System.out.println();

        System.out.println("----------------------------------------------");

        System.out.println("5º exercicio -> Retornar o preço final considerando descontos ou taxas adicionais.");
        System.out.println();

        Livro livro = new Livro();
        livro.setPrecoInicial(400);

        System.out.println("Preço do livro menos os descontos + a taxa adicional = " + livro.calcularPrecoFinal(200,100));








    }
}
