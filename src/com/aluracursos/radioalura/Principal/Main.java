package com.aluracursos.radioalura.Principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("rock and roll all'nite");
        miCancion.setArtista("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Pedro infante");
        miPodcast.setTitulo("amor de mar");

        for (int i = 0; i < 100; i++) {
            miCancion.likes();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }
        System.out.println("total de reproducciones: "+miCancion.getTotalReproducciones());
        System.out.println("total de me gusta: "+miCancion.getTotalLikes());


    }
}
