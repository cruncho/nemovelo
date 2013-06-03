/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aurelien.vezzani
 */
public class GestionBd {

    private static GestionBd instance = new GestionBd();
    Connection conn;

    public static GestionBd getInstance() {
        return instance;
    }

    private GestionBd() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nemovelo?user=root");
        } catch (SQLException ex) {
            Logger.getLogger(GestionBd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionBd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void executeSql(String sql) {
        try {
            PreparedStatement pstnt = conn.prepareStatement(sql);
            pstnt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
}
