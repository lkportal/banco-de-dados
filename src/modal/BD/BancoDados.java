package modal.BD;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BancoDados {
		
	
		private static Connection conecta =null;
		
		
		
		public static Connection conectabanco() {
		
			try {
			if(conecta == null) {
				Properties pro = carregaArquivo();
				String url = pro.getProperty("dburl");
				conecta = DriverManager.getConnection(url,pro);
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public static void desconectaBD() {
			try {
				if(conecta!=null) {
					conecta.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		public static Properties carregaArquivo() {
			try(FileInputStream file = new FileInputStream("arquivo.properties")) {
				 
				Properties pro = new Properties();
				pro.load(file);
				return pro;
					
			}catch(IOException e) {
				e.printStackTrace();
			}
			return null;
		}
}
