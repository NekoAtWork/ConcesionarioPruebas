package Concesionario;

public class Cliente extends Thread{
    private String nombre;
    private final ControlAcceso control;

    public Cliente(String nombre, ControlAcceso control){
        this.nombre = nombre;
        this.control = control;
    }

    @Override
    public void run(){
        try{
            Vehiculo vehiculo= control.solicitarVehiculo(nombre);
            RegistroPruebas.registrarInicio(nombre, vehiculo.getId());
            Thread.sleep((long)(Math.random()*2000+1000));
            RegistroPruebas.registrarFin(nombre, vehiculo.getId());
            control.liberarVehiculos(vehiculo);
        } catch(InterruptedException e){
            System.out.println(nombre + "fue interrumpida durante la prueba");
        }
    }
}
