package Concesionario;

public class Main {
    public static void main(String[] args) {
        int numeroVehiculos=4;
        ControlAcceso control = new ControlAcceso(numeroVehiculos);
        String [] nombreCliente= {
                "Cliente1", "Cliente2", "Cliente3", "Cliente4",
                "Cliente5", "Cliente6", "Cliente7", "Cliente8",
                "Cliente9"
        };
        Cliente[] clientes=new Cliente[nombreCliente.length];
        for(int i=0;i<nombreCliente.length;i++){
            clientes[i]= new Cliente(nombreCliente[i], control);
            clientes[i].start();
        }
        for(Cliente cliente:clientes){
            try{
                cliente.join();
            }catch(InterruptedException e){
                System.out.println("Error esperando que termine cliente");
            }
        }
        System.out.println("\n----Simulacion terminada----");
    }
}
