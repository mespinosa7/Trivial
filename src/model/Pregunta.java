package model;

public class Pregunta {
    private  String afirmacion;
    private boolean isTrue;
    private int dificultad;

    public Pregunta(String afirmacion, boolean isTrue, int dificultad) {
        this.afirmacion = afirmacion;
        this.isTrue = isTrue;
        this.dificultad = dificultad;
    }

    public String getAfirmacion() {
        return afirmacion;
    }

    public void setAfirmacion(String afirmacion) {
        this.afirmacion = afirmacion;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    @Override
    public String toString(){
        return    "Pregunta{" +
                "afirmacion="+afirmacion+'\''+
                ", isTrue="+isTrue+
                ", dificultad="+dificultad+
                '}';
    }
}
