package com.poojava.screenmatch.calculos;

public class FiltroRecomendaciones {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasificacion() >= 2 ){
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colocalo en tu vista para verlo despues");
        }

    }
}
