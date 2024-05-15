package Classes;

import Interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {



    public double celsiusParaFahrenheit(double temperaturaCelsius){
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    public double fahrenheitParaCelsius(double temperaturaFahrenheit){
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
