public class Casello implements Comparable{

	public Autostrada codiceAutostrada;
	public String nomeCasello;
	public double altezza_km;
	
	
	// Metodi Get e Set 
	
	public Autostrada getCodiceAutostrada() {
		return codiceAutostrada;
	}

	public void setCodiceAutostrada(Autostrada codiceAutostrada) {
		this.codiceAutostrada = codiceAutostrada;
	}

	public String getNomeCasello() {
		return nomeCasello;
	}

	public void setNomeCasello(String nomeCasello) {
		this.nomeCasello = nomeCasello;
	}

	public double getAltezza_km() {
		return altezza_km;
	}

	public void setAltezza_km(double altezza_km) {
		this.altezza_km = altezza_km;
	}

	
	// Costruttore
	
	public Casello(Autostrada codiceAutostrada, String nome, float km) {
		
		this.codiceAutostrada = codiceAutostrada;
		this.nomeCasello = nome;
		this.altezza_km = km;
	}
	
	
	// Costruttore Vuoto
	
	public Casello() {}
	
	
    // Metodo toString
    
    @Override
	public String toString() {
		return "Casello [codiceAutostrada=" + codiceAutostrada + ",  nome=" + nomeCasello + ", km="
				+ altezza_km + "]";
	}
    
    
    // Metodo Equals
    
	public boolean equals(Object o){
        if (o instanceof Casello){
            return (((Casello)o).codiceAutostrada == codiceAutostrada);
        }
        else {
             return false;
             }    
    }
	
	
	// Metodo compareTo
	
	@Override
	public int compareTo(Object o) {
		
		if (this.altezza_km < (((Casello)o).getAltezza_km())) return 1;	
		return 0;
	}	
}