package it.beije.cilacapmethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.cfg.Configuration;


public class DBManager {

	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "root";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/cilacap?serverTimezone=CET";

	public static Connection getMySqlConnection(String url, String user, String password)
			throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		return DriverManager.getConnection(url, user, password);
	}

	public static Configuration getHibernateConfigurationRubrica(){

		Configuration configuration = new Configuration();
		configuration = configuration.configure()
				.addAnnotatedClass(Contatto.class);
//				.addAnnotatedClass(altra classe)
		return configuration;
	}
	


}