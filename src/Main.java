
import java.sql.Connection;
import java.util.Calendar;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	
	static String url = "jdbc:mysql://localhost/gestionUstensiles";
	static String passwrd = "";
	static String user = "root";
	
	static Connection conn;

	public static void main(String[] args) throws SQLException {
		Statement stmt;
		
	
		// Connection database
		try {
			
			conn = DriverManager.getConnection(url, user, passwrd);
			System.out.println("ok");
			}catch(SQLException ee){
				System.out.println(ee.getMessage());
			}
				
		boolean check = true;
		
		AssietteRonde assietteRonde = new AssietteRonde();
		AssietteCarree assietteCarree = new AssietteCarree();
		
		while(check) {
			Scanner reader = new Scanner(System.in);
			System.out.println("=====beinvenue sur gestions des Ustensile======");
			System.out.println("1: gestion Cuill�re");
			System.out.println("2: gestion Assiette");
			
			int choix = reader.nextInt();
			
			switch(choix) {
			case 1:
				System.out.println("1: ajouter Cuill�re");
				System.out.println("2: afficher Cuill�re");
				System.out.println("3: afficher le nombre totale de Cuill�re");
				int chioxCuill�re = reader.nextInt();
				
				switch(chioxCuill�re) {
				
				case 1:
					System.out.println("Entrer anne� de fabrication");
					int anne�F = reader.nextInt();
					System.out.println("Entrer langure de Cuill�re");
					double longueur = reader.nextDouble();
					
					stmt = conn.createStatement();
					String query = "INSERT INTO cuill�re (id,anne�Fabrication,langure) VALUES (null, '"+anne�F+"', '"+longueur+"')";
					stmt.executeUpdate(query);
				
					break;
				case 2:
					stmt = conn.createStatement();
					String queryAffiche = "SELECT * FROM cuill�re";
					ResultSet res = stmt.executeQuery(queryAffiche);
					
					while(res.next()) {
						System.out.println("ID:" + res.getInt("id") + " Anne� de fabrication:" + res.getInt("anne�Fabrication") + " langure:" + res.getDouble("langure"));
					}
					break;
				case 3:
					stmt = conn.createStatement();
					String queryCalTOtal = "SELECT COUNT(*) AS COUNT FROM cuill�re";
					ResultSet rs = stmt.executeQuery(queryCalTOtal);
					rs.next();
					System.out.println("Le nombre total de Cuill�re est: " + rs.getInt("COUNT"));	    
					break;
				}break; 
				
			case 2:
				System.out.println("1: Assiette Ronde");
				System.out.println("2: Assiette Carre�");
				System.out.println("3: afficher le nombre totale de Assiette");
				int choisAssiette = reader.nextInt();
				
				switch(choisAssiette) {
				case 1:
					System.out.println("1: Ajouter Assiette Ronde");
					System.out.println("2: Afficher Surface Assiette Ronde");
					int choisRonde = reader.nextInt();
					
					switch(choisRonde) {
					case 1:
						
						System.out.println("Entrer anne� de fabrication");
						int anneeF = reader.nextInt();
						assietteRonde.setAnn�Fabrication(anneeF);
						
						System.out.println("Entrer Rayon");
						double rayon = reader.nextDouble();
						assietteRonde.setRayon(rayon);
						
						
						
						stmt = conn.createStatement();
						
						
					
							String query = "INSERT INTO `assietteronde`(`anne�Fabrication`, `rayon`, `surface`, `valeur`) VALUES (?,?,?,?)";
							PreparedStatement ps = conn.prepareStatement(query);
							ps.setInt(1, assietteRonde.getAnneFabrication());
							ps.setDouble(2, assietteRonde.getRayon());
							ps.setDouble(3, assietteRonde.CalculerSurface());
							ps.setDouble(4, assietteRonde.CalculerValeur());
							
							ps.executeUpdate();
							
						
						break;
					case 2:
					
						
					
						stmt = conn.createStatement();
						String queryCalSurface = "SELECT SUM(surface) AS sum_surface FROM assietteronde";
						ResultSet rs = stmt.executeQuery(queryCalSurface);
						rs.next();
						System.out.println("la Surface de Assiette Ronde : " + rs.getDouble("sum_surface")); 
						break;      
						        }break;
				case 2:
					System.out.println("1: Ajouter Assiette Carre�");
					System.out.println("2: Afficher Surface Assiette Carre�");
					int choisCarre� = reader.nextInt();
					
					switch(choisCarre�) {
					case 1:
						System.out.println("Entrer anne� de fabrication");
						int anneF = reader.nextInt();
						assietteCarree.setAnn�Fabrication(anneF);
						
						System.out.println("Entrer Cote");
						double cote = reader.nextDouble();
						assietteCarree.setCote(cote);
						
						stmt = conn.createStatement();
						String query = "INSERT INTO assiettecarre� (anne�Fabrication,cote,surface,valeur) VALUES (?,?,?,?)";
						PreparedStatement ps = conn.prepareStatement(query);
						ps.setInt(1, assietteCarree.getAnneFabrication());
						ps.setDouble(2, assietteCarree.getCote());
						ps.setDouble(3, assietteCarree.calculerSurface());
						ps.setDouble(4, assietteCarree.CalculerValeur());
						
						ps.executeUpdate();
						break;
						
					case 2:
						stmt = conn.createStatement();
						String queryCalSurface = "SELECT SUM(surface) AS sum_surface FROM assiettecarre�";
						ResultSet rs = stmt.executeQuery(queryCalSurface);
						
						rs.next();
						System.out.println("la Surface de Assiette Carree : " + rs.getDouble("sum_surface")); 
						break; 
					}break; 
				case 3:
					int nbrTotaleAssiette;
					stmt = conn.createStatement();
					String query1 = "SELECT COUNT(*) AS nbRonde FROM assietteronde";
					ResultSet rs1 = stmt.executeQuery(query1);
					rs1.next();
					int R1 = rs1.getInt("nbRonde");
					
					String query2 = "SELECT COUNT(*) AS nbCarree FROM assiettecarre�";
					ResultSet rs2 = stmt.executeQuery(query2);
					rs2.next();
					int R2 = rs2.getInt("nbCarree");
					System.out.println("Le nombre total des Assiettes est: " + (R1+R2));
					break;
					}
				
				}
			}
		}
	
}
