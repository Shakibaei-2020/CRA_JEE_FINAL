package com.infocom.model.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String DB_DRIVER_CLASS="com.mysql.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/crainfocom";
	
	private static Connection connection = null;
	// Pourquoi t'as utilis� le static ici ? 
	
	/**
	 * La cr�ation des objets de type Connection est couteuse
	 * est ressources, de ce fait cr�er une connection � chaque fois qu'on veut int�rroger la
	 * base de donn�es est des mauvaises pratique de la programmation qui influe
	 * �norm�ment les performances de l'application (temps de r�ponse, m�moire
	 * consomm�e
	 */
	
	static{
		try {
			Class.forName(DB_DRIVER_CLASS);
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return connection;
	}
}
