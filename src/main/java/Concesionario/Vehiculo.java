package Concesionario;

public class Vehiculo {
    private final int id;
    private boolean enUso;

    public Vehiculo(int id) {
        this.id = id;
        this.enUso = false;
    }
    public int getId() {
        return id;
    }
    public boolean isEnUso() {
        return enUso;
    }
    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }
}
