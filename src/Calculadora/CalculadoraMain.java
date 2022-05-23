package bbdd;

import java.sql.*;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarProductos {

	public static void main(String[] args) {		
		
		String bbdd="productosprog";		
		String url="jdbc:mysql://localhost:3306/"+bbdd;
		
		String usuario="root";
		String password="";		
		
		FileReader fr=null;
		BufferedReader br=null;
		
		String[]linea=null;
		
		Connection conn= null;
		PreparedStatement ps =null;		
		
		try {			
			fr= new FileReader("C:\\Users\\ALUMNOS\\Desktop\\Fernando\\PROG\\Ficheros\\productos.csv");
			br = new BufferedReader(fr);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection(url, usuario, password);
			conn.setAutoCommit(false);
			
			ps= conn.prepareStatement("insert into productos values(?,?,?,?)");
			
			br.readLine();
			while(br.ready()) {
				linea=br.readLine().split(",");
				ps.setString(1, linea[0]);
				ps.setString(2, linea[1]);
				ps.setInt(3, Integer.parseInt(linea[2]));
				ps.setFloat(4, Float.parseFloat(linea[3]));
				
				ps.executeUpdate();					
			}			
			conn.commit();
			System.out.println("insertado correctamente");
			
		}catch(FileNotFoundException ex) {			
			
			System.out.println("Fichero no encontrado");
			
		}catch(ClassNotFoundException ex) {
			System.out.println("Calse no encontrada");
			
		}catch(SQLException ex) {			
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println("Error de E/S");
		}
	}
}
