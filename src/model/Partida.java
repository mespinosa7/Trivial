package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Partida {
    private String playerName;
    private int score;
    private ArrayList<Pregunta> preguntas;

    private int preguntasAcertadas;

    private void initPlayer(String playerName){
        this.playerName=playerName;
        this.score=0;
        this.preguntasAcertadas=0;

    }

    private void initPreguntas(){
        this.preguntas=new ArrayList<>();
        Pregunta firstPregunta=new Pregunta("La capital de Francia es Paris?",true,1);
        Pregunta secondPregunta=new Pregunta("La capital de España es Berlin?",false,2);
        Pregunta thirdPregunta=new Pregunta("La capital de Alemania es Praga?",false,3);
        Pregunta fourthPregunta=new Pregunta("La capital de Venezuela es Caracas?",true,2);
        Pregunta fifthPregunta=new Pregunta("La capital de Mexico es Miami ?",true,3);
        this.preguntas.add(firstPregunta);
        this.preguntas.add(secondPregunta);
        this.preguntas.add(thirdPregunta);
        this.preguntas.add(fourthPregunta);
        this.preguntas.add(fifthPregunta);
    }

    public Partida() {
        initPlayer("Juan");
        initPreguntas();
    }
    public void jugarPartida() {
        for (int i=0;i< preguntas.size();i++) {
            Pregunta preguntaActual = preguntas.get(i);
            mostrarPregunta(preguntaActual);
            boolean respuesta = preguntaUsuario();

            if (respuesta == preguntaActual.isTrue()) {

                this.score = this.score + preguntaActual.getDificultad();
                System.out.println("Has acertado, tu puntuacion se ha incrementado a: " + this.score);
                preguntasAcertadas++;
            } else {
                System.out.println("Buen intento, has fallado");
            }
        }
        mostrarEstadisticas();
    }
    private void mostrarPregunta(Pregunta pregunta){
        String afirmacion=pregunta.getAfirmacion();
        System.out.println(afirmacion);
    }
    private boolean preguntaUsuario(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("True or false?");
        boolean result= scanner.nextBoolean();

        //scanner.close();
        return result;


    }
    private void mostrarEstadisticas(){
        System.out.println("Total de respuestas acertadas: "+this.preguntasAcertadas);
        System.out.println("Total de puntuacion: "+this.score);
        double porcentage=(double)this.preguntasAcertadas / this.preguntas.size()*100;
        System.out.println("Tanto por ciento de aciertos: "+porcentage+ "%");


    }

}
