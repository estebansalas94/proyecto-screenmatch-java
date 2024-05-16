package com.poojava.screenmatch.calculos;
import com.poojava.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private  int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
