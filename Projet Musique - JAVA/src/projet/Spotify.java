package projet;

public class Spotify extends Plateforme{
    private int nombreUtilisateurs;
    private double prixAbonnement;


    public Spotify(int nombreUtilisateurs, double prixAbonnement) {
        this.nombreUtilisateurs = nombreUtilisateurs;
        this.prixAbonnement = prixAbonnement;
    }

    public int getNombreUtilisateurs() {
        return nombreUtilisateurs;
    }
    public void setNombreUtilisateurs(int nombreUtilisateurs) {
        this.nombreUtilisateurs = nombreUtilisateurs;
    }

    public double getPrixAbonnement() {
        return prixAbonnement;
    }

    public void setPrixAbonnement(double prixAbonnement) {
        this.prixAbonnement = prixAbonnement;
    }



}
