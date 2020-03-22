//Esempio di calcolo con 3 pedaggi

public class Main {

	public static void main(String[] args) {
		
		// Nuovi Veicoli
	     Veicolo v1 = new Veicolo("YAMAHA R6", "YAMAHA", 2014, "CD584GT", 20, (float)1.10, 2, 'A');
	     Veicolo v2 = new Veicolo("JEEP RENEGADE","JEEP", 2020, "HT845PE", (float)25.7 , (float)1.40 , 2, 'B');
	     Veicolo v3 = new Veicolo("IVECO X-WAY","IVECO", 2018, "EK955VH",(float)50.7, (float)1.90, 2, '3');
		     
	    
	     // Nuove Autostrade
	     Autostrada a1 = new Autostrada("a14",(float)1.40,"Roseto degli Abruzzi","Riccione", (float)209.1, null);
	     Autostrada a2 = new Autostrada("a24",(float)1.70,"Roma Est","L'Aquila Ovest",(float) 98.4, null);
	     
	     
		 // Caselli Autostrade
		 a1.addCasello(a1, "Pineto",(float)15); 
		 a1.addCasello(a1, "Imola", (float)45);
		     
	 
		 // Aggiunta dei caselli, aggiunta dei caselli nell'Autostrada
	   
	     Casello c4 = new Casello(a2,"Roseto",(float)20);
	     a2.addCasello(c4);
	     Casello c3 = new Casello(a2,"L'Aquila",(float)70);
	     a2.addCasello(c3);
	     Casello c5 = new Casello(a1,"Roma",(float)50);
	     a1.addCasello(c5);
	     Casello c6 = new Casello(a1,"Roma",(float)3.6);
	     a1.addCasello(c6); 
	     Casello c7 = new Casello(a1,"Pineto",(float)59.7);
	     a1.addCasello(c7);
	     
	    
	     // Calcolo dei pedaggi con caselli e veicoli creai in precedenza    
		 Pedaggio p1 = new Pedaggio(c7,c6,v1);
	     Pedaggio p2 = new Pedaggio(c6,c7,v2);
	     Pedaggio p3 = new Pedaggio(c4,c3,v3);
	     
	     
	     // Stampa dei pedaggi calcolati per veicolo
	     
	     System.out.println(p1.calcolaPedaggio() + " € calcolo primo pedaggio");
	     System.out.println(p2.calcolaPedaggio() + " € calcolo secondo pedaggio");
	     System.out.println(p3.calcolaPedaggio() + " € calcolo terzo pedaggio");
	}

}