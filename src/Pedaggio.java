
public class Pedaggio {
	
	public static final double IVA = 0.22;

	public Casello caselloPartenza;
	public Casello caselloDestinazione;
	public Veicolo veicolo;
	
	
	//  Costruttore
	
	public Pedaggio(Casello caselloPartenza, Casello caselloDestinazione, Veicolo veicolo) {
		this.caselloPartenza = caselloPartenza;
		this.caselloDestinazione = caselloDestinazione;
		this.veicolo = veicolo;
	}
	
	
	// Metodo che calcola il pedaggio
	
	public double calcolaPedaggio() {
		Autostrada a=caselloPartenza.codiceAutostrada;
		Autostrada b=caselloDestinazione.codiceAutostrada;
		double y=a.getTariffa_km();
		double aggiunta=0;
		
		
	// utilizzo la classe del veicolo per calcolare la classe di appartenenza
		char x=veicolo.getClasse_veicolo();
		
		switch(x) {
		case 'B':
			aggiunta= 0.10;
			break;
		case '3':
			aggiunta= 0.30;
			break;
		case '4':
			aggiunta = 0.50;
			break;
		case '5':
			aggiunta= 0.70;
			break;
		default :
			aggiunta= 0.05; //Per default calcola  l'aggiunta della classe A
		}
		
		
		if(a.equals(b)){
				double e=Math.abs(caselloPartenza.getAltezza_km() - caselloDestinazione.getAltezza_km());
				y= y*aggiunta;
				double tot = e*y;
				float aggIVA= (float) (tot*(IVA)) ;
				double arr=(Math.round((tot + aggIVA)*10)/10);
				return arr;		
				}
		
		return 0;
		
	}
	
	

}