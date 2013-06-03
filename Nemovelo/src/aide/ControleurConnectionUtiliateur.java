/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aide;

/**
 *
 * @author aurelien.vezzani
 */
public class ControleurConnectionUtiliateur {
    public void traiterDemandeUtilisateur(Utilisateur utilisateur) {
         StringBuilder sb = new StringBuilder();
            sb.append("insert into membre(nom,prenom,mdp,abonnement) ");
            sb.append(" values('");
            sb.append("','");
            sb.append(utilisateur.getNom());
            sb.append("','");
            sb.append(utilisateur.getPrenom());
            sb.append("','");
            sb.append(utilisateur.getPwd());
            sb.append("','");
            sb.append(utilisateur.getAbonnement());
            sb.append("')");

            GestionBd gestionBd = GestionBd.getInstance();
            gestionBd.executeSql(sb.toString());
    }
}
