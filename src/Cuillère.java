
public class Cuillère extends Ustensile{

	private double longueur;
	
	public Cuillère(int annéF, double lang) {
		super(annéF);
		this.setLangure(lang);
	}

	public double getLangure() {
		return longueur;
	}

	public void setLangure(double longueur) {
		this.longueur = longueur;
	}
	
	public void calculerCuillère(int nbrCuillère) {
		System.out.println("le nombre de Cuillère est:" + nbrCuillère);
	}
}
