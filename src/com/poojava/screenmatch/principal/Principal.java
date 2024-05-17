package com.poojava.screenmatch.principal;

import com.poojava.screenmatch.calculos.CalculadoraDeTiempo;
import com.poojava.screenmatch.calculos.FiltroRecomendaciones;
import com.poojava.screenmatch.modelos.Episodio;
import com.poojava.screenmatch.modelos.Pelicula;
import com.poojava.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Soul", 2023);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        System.out.println("************************************************");

        Serie casaDragon = new Serie("La casa del dragon", 2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        System.out.println("************************************************");

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());

        System.out.println("*************************************************");

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa de Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendaciones.filtra(episodio);

        Pelicula peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);

        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculaDeBruno);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("Primera pelicula: " + listaDePeliculas.get(0).getNombre());
        System.out.println("Todas las peliculas: " + listaDePeliculas);
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());





    }
}
