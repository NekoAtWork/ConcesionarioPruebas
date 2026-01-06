package Concesionario;

public class RegistroPruebas {
    public static void registrarInicio(String nombreCliente, int idVehiculo){
        System.out.println(nombreCliente+" probando vehiculo "+ (idVehiculo+1));
    }
    public static void registrarFin(String nombreCliente, int idVehiculo){
        System.out.println(nombreCliente+" termino de probar vehiculo "+ (idVehiculo+1));
    }
}
