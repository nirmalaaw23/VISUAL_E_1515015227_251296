package posttest7;
import java.sql.*;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            con = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/praktikum_visual","root","");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null, "Koneksi Gagal: " +e.getMessage());
    }
return con;
}
}