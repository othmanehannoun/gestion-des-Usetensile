
public class Cuill�re extends Ustensile{

	private double longueur;
	
	public Cuill�re(int ann�F, double lang) {
		super(ann�F);
		this.setLangure(lang);
	}

	public double getLangure() {
		return longueur;
	}

	public void setLangure(double longueur) {
		this.longueur = longueur;
	}
	
	public void calculerCuill�re(int nbrCuill�re) {
		System.out.println("le nombre de Cuill�re est:" + nbrCuill�re);
	}
}
