package koneksi;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Koneksi {
    
//    public static Connection con;
//    
//    public static Connection getConnection() throws SQLException {
//        if (con == null) {
//            //panggil Driver Mysql
//            Driver driver = new Driver() {
//
//                @Override
//                public Connection connect(String url, Properties info) throws SQLException {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                @Override
//                public boolean acceptsURL(String url) throws SQLException {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                @Override
//                public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                @Override
//                public int getMajorVersion() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                @Override
//                public int getMinorVersion() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                @Override
//                public boolean jdbcCompliant() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                @Override
//                public Logger getParentLogger() throws SQLFeatureNotSupportedException {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//            };
//            //buat koneksi
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_arinda", "root", "");
//        }
//        return con;
//    }
    
    public Connection bukaKoneksi()throws SQLException{

        Connection connect;
  	try{
            Class.forName("com.mysql.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbmt_taawun","root","");
            return connect;
  	}
  	catch(SQLException sqlexc){
            JOptionPane.showMessageDialog(null,sqlexc,"Koneksi Database",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
  	}
  	catch(ClassNotFoundException classexc){
            JOptionPane.showMessageDialog(null,classexc,"Koneksi Database",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
  	}
  	catch(Exception exc){
            JOptionPane.showMessageDialog(null,exc,"Koneksi Database",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
  	}
    }
}