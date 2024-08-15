
import com.mysql.cj.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Baglanti {
    private String kullanici_adi = "root";
    private String parola = "";
    private String host = "localhost";
    private int port = 3306;
    private String db_ismi = "demo";
    private Connection con = null;
    
    
    public Baglanti(){
        //jdbc:mysql://:localhost:3306/demo
        String url = "jdbc:mysql://"+ host + ":" + port + "/" +db_ismi;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadi");
        }
        
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı Başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız");
        }
        
        
    }
    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
    }
}
