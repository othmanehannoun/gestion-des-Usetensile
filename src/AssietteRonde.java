import java.sql.SQLException;
import java.util.Calendar;

public class AssietteRonde extends Assiette{

	private double rayon;
	
	public AssietteRonde() {}
	public AssietteRonde(int annéF, double rayon) {
		super(annéF);
		this.rayon = rayon;
	}
	

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	// calculer Surface
	public double CalculerSurface() {
		return getRayon() * getRayon() * 3.14;
	}

	 public double CalculerValeur() {
		    //Year.now().getValue())
			int year = (2020 - getAnneFabrication());
			double CalculeValeur = 0;
			if(year > 50) {
				CalculeValeur = (year - 50);
			}
			return CalculeValeur;
		}
	

	 
}
