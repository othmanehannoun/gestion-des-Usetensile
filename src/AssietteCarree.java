import java.time.Year;

public class AssietteCarree extends Assiette{

	private double cote;
	
	public AssietteCarree(int annéF, double cote) {
		super(annéF);
		this.cote = cote;
		
	}

	public AssietteCarree() {
		
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	// calculer Surface
	
		 public double calculerSurface() {
		        return (getCote() * getCote());
		    }
	
		 public double CalculerValeur() {
			    //Year.now().getValue())
				int year = (2020 - getAnneFabrication());
				double CalculeValeur = 0;
				if(year > 50) {
					CalculeValeur = (year - 50) * 5;
				}
				return CalculeValeur;
			}
}
