package Classes;

import Interfaces.Tabuada;

import java.sql.SQLOutput;

public class TabuadaMultiplicacao implements Tabuada {

    int numeroDaTabuada;

    @Override
    public void mostrarTabuada(int numeroDaTabuada){
        System.out.println("Tabuada de multiplicação do " + numeroDaTabuada + ":");
       for(int i = 0; i <= 10 ; i++){
           int resultado = i * numeroDaTabuada;
           System.out.println(numeroDaTabuada + " x " + i + " = " + resultado );
       }
   }
}
