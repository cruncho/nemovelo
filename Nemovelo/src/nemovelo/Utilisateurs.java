/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nemovelo;

/**
 *
 * @author clement.defourneaux
 */
public class Utilisateurs {

    private String nom;
    private String prenom;
    private int fonction;
    private String login;
    private String password;

    public Utilisateurs(String nom, String prenom, int fonction, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.login = login;
        this.password = password;
    }



    // Méthodes

    //------------ connexion base

    public void connexion(String login, String password){

        // fonction se connectant à la base

        System.out.println("Connexion reussi");

    }








    // Getters et Setters

    public int getFonction() {
        return fonction;
    }

    public void setFonction(int fonction) {
        this.fonction = fonction;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


}
