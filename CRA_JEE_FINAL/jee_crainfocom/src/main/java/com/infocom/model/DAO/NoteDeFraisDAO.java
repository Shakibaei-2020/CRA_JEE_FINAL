package com.infocom.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.infocom.model.NoteDeFrais;
import com.infocom.model.util.DBUtil;

public class NoteDeFraisDAO {

	private  final String INSERT_FRAIS_SQL = "INSERT INTO notedefrais  (raison_frais, prix_frais, date_frais) VALUES  (?, ?, ?);";

	  public void insertFrais(NoteDeFrais noteDeFrais) throws SQLException { 
	        try (Connection connection = DBUtil.getConnection(); 
	        	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FRAIS_SQL)) {
	            preparedStatement.setString(1, noteDeFrais.getRaisonFrais());
	            preparedStatement.setDouble(2, noteDeFrais.getPrixFrais());
	            preparedStatement.setDate(3, noteDeFrais.getDateFrais());
	            preparedStatement.executeUpdate();
	            connection.close();
	        } catch (SQLException e) {
	        	 System.err.println(e); 
	        }
	    }
}
