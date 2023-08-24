package Factory;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConexionBase {
	
	public DataSource dataSou;
	
	public ConexionBase() {
		ComboPooledDataSource comboPool = new ComboPooledDataSource();
		comboPool.setJdbcUrl("DIRECCION DE LA BBDD");
		comboPool.setUser("root");
		comboPool.setPassword("contraseña");
		
	}

}
