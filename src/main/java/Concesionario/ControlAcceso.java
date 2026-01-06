package Concesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class ControlAcceso {
    private final Semaphore semaforo;
    private final List<Vehiculo> vehiculos;

    public ControlAcceso(int numeroVehiculos){
        this.semaforo = new Semaphore(numeroVehiculos);
        this.vehiculos = new ArrayList<>();
        for(int i = 0; i < numeroVehiculos; i++){
            vehiculos.add(new Vehiculo(i));
        }
    }
    public Vehiculo solicitarVehiculo(String nombreCliente)throws InterruptedException{
        semaforo.acquire();
        synchronized (vehiculos){
            for (Vehiculo v:vehiculos){
                if (!v.isEnUso()){
                    v.setEnUso(true);
                    return v;
                }
            }
        }
        return null;
    }
    public void liberarVehiculos(Vehiculo vehiculo){
        synchronized (vehiculos){
        vehiculo.setEnUso(false);
        }
    semaforo.release();
    }
}
