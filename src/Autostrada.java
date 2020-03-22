import java.util.TreeSet;

public class Autostrada {

	public String idAutostrada;
	public double tariffa_km;
	public String partenza;
	public String destinazione;
	public float km_totali;
	TreeSet<Casello> listaCaselli ;
	
	
	// Metodi get e set 
	
	public String getIdAutostrada() {
		return idAutostrada;
	}


	public void setIdAutostrada(String idAutostrada) {
		this.idAutostrada = idAutostrada;
	}


	public double getTariffa_km() {
		return tariffa_km;
	}


	public void setTariffa_km(double tariffa_km) {
		this.tariffa_km = tariffa_km;
	}


	public String getPartenza() {
		return partenza;
	}


	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}


	public String getDestinazione() {
		return destinazione;
	}


	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}


	public float getKm_totali() {
		return km_totali;
	}


	public void setKm_totali(float km_totali) {
		this.km_totali = km_totali;
	}


	public TreeSet<Casello> getListaCaselli() {
		return listaCaselli;
	}


	public void setListaCaselli(TreeSet<Casello> listaCaselli) {
		this.listaCaselli = listaCaselli;
	}
	

	// Costruttore 
	
	public Autostrada(String idAutostrada, float tariffa_km, String partenza, String destinazione, float lunghezza,
			TreeSet<Casello> listacaselli) {
		this.idAutostrada = idAutostrada;
		this.tariffa_km = tariffa_km;
		this.partenza = partenza;
		this.destinazione = destinazione;
		this.km_totali = lunghezza;
		this.listaCaselli= new TreeSet<Casello>();
	}
	
	
	// Costruttore vuoto 

	public Autostrada() {}

	
	// Metodo toString 
	
	@Override
	public String toString() {
		return "Autostrada [idAutostrada=" + idAutostrada + ", tariffa=" + tariffa_km + ", Partenza="
				+ partenza + ", Destinazione=" + destinazione + ", Km totali=" + km_totali + ", listaCaselli=" + listaCaselli + "]";
	}
	
	
	// Metodi Per Aggiunta Caselli 

	public boolean addCasello(Autostrada autostrada, String nome, float km) {
		Casello casello = new Casello (autostrada, nome, km);
		 return listaCaselli.add(casello);	
	}
	
	
	public boolean addCasello(Casello c) {
		return listaCaselli.add(c);	
	}
}