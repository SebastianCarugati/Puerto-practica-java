package test;


import domain.Anfibioneta;
import domain.Catamaran;
import domain.Cliente;
import domain.Embarcacion;
import domain.Lancha;
import domain.Motos_Acuaticas;
import domain.Puerto;
import domain.Velero;
import domain.Yate;

public class PuertoTest {

	public static void main(String[] args) {
		Puerto puerto = new Puerto();
		puerto.mostrarAmarre();
		puerto.mostrarAlquiler();
		Cliente cliente = new Cliente("Rosario","Juarez", 41133421);
		Cliente cliente2 = new Cliente("Sebastian","Carugati", 14321467);
		Cliente cliente3 = new Cliente("Leandro","Sac", 14553412);
		Cliente cliente4 = new Cliente("Santiago","Azurduy", 17324664);
		Cliente cliente5 = new Cliente("Claudia","Belizan", 40361214);
		Embarcacion embarcacion = new Velero();
		Embarcacion embarcacion1 = new Yate();
		Embarcacion embarcacion2 = new Anfibioneta();
		Embarcacion embarcacion3 = new Catamaran();
		Embarcacion embarcacion4 = new Lancha();
		Embarcacion embarcacion5 = new Motos_Acuaticas();

		
		
		puerto.asignarAlquiler(cliente, embarcacion, 1 , 15, 3);
		puerto.asignarAlquiler (cliente2, embarcacion1, 10, 15, 2);
		puerto.asignarAlquiler (cliente2, embarcacion2, 17, 25, 1);
		puerto.mostrarAlquiler();
		puerto.mostrarAmarre();
		
	    System.out.println("");
		
		puerto.liberarAlquiler(cliente2, embarcacion1, 2 );
		puerto.liberarAlquiler(cliente, embarcacion, 3 );
		puerto.mostrarAlquiler();
		puerto.mostrarAmarre();
		
		System.out.println("");
		
		puerto.asignarAlquiler(cliente, embarcacion, 1 , 30, 3);
		puerto.asignarAlquiler (cliente4, embarcacion3, 15, 30, 5);
		puerto.asignarAlquiler (cliente5, embarcacion5, 7, 15, 4);
		puerto.mostrarAlquiler();
		puerto.mostrarAmarre();
		
		System.out.println("");
		
		puerto.asignarAlquiler(cliente3, embarcacion4, 1 , 15, 1);
		puerto.asignarAlquiler (cliente4, embarcacion3, 2, 9, 2);
		
		puerto.mostrarAlquiler();
		puerto.mostrarAmarre();
		
		
	
		

		

	}

}
