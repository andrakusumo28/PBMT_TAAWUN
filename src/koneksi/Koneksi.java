package koneksi;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Koneksi {

    /**
     *
     * @return @throws SQLException
     */
    public Connection bukaKoneksi() throws SQLException {

        Connection connect;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");//("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/pbmt_taawun", "sa", "0911500908");//("jdbc:mysql://localhost:3306/pbmt_taawun", "root", "");
            return connect;
        } catch (SQLException sqlexc) {
            JOptionPane.showMessageDialog(null, sqlexc, "Koneksi Database", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
        } catch (ClassNotFoundException classexc) {
            JOptionPane.showMessageDialog(null, classexc, "Koneksi Database", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, exc, "Koneksi Database", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
        }
    }

    /*test koneksi sql server
     public class test_koneksi {   
     private Connection connect;   
     private String driverName = "net.sourceforge.jtds.jdbc.Driver"; //  
     private String jdbc = "jdbc:jtds:sqlserver://";   
     private String host = "localhost:"; //   
     private String port = "1433/"; //   
     private String database = "pbmt_taawun"; //    
     private String url = jdbc + host + port + database;   
     private String username = "sa"; //  
     private String password = "0911500908";   
     public Connection getKoneksi() throws SQLException {   
        if (connect == null) {   
            try {   
                Class.forName(driverName);   
                System.out.println("Class Driver Ditemukan");   
            try {   
                connect = DriverManager.getConnection(url, username, password);   
                System.out.println("Koneksi Database Sukses");   
        } catch (SQLException se) {   
                System.out.println("Koneksi Database Gagal : " + se);   
                System.exit(0);   
        }   
        } catch (ClassNotFoundException cnfe) {   
                System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : " + cnfe);   
                System.exit(0);   
        }   
        }   
            return connect;   
        }   
     }
     */
}
