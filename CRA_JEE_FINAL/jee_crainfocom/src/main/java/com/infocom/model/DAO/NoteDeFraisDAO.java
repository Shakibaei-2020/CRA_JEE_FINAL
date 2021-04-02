package com.infocom.model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infocom.model.Collaborateur;
import com.infocom.model.NoteDeFrais;
import com.infocom.model.util.DBUtil;

public class NoteDeFraisDAO {

	private  final String INSERT_FRAIS_SQL = "INSERT INTO notedefrais  (raison, prix, date) VALUES  (?, ?, ?);";

	  public void insertFrais(NoteDeFrais noteDeFrais) throws SQLException { 
	        try (Connection connection = DBUtil.getConnection(); 
	        	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FRAIS_SQL)) {
	            preparedStatement.setString(1, noteDeFrais.getRaison());
	            preparedStatement.setDouble(2, noteDeFrais.getPrix());
	            preparedStatement.setDate(3, (Date) noteDeFrais.getDate());
	            preparedStatement.executeUpdate();
	            connection.close();
	        } catch (SQLException e) {
	        	 System.err.println(e); 
	        }
	    }
	  
	  
		private final String SELECT_ALL_FRAIS = "SELECT * FROM notedefrais ";

		public List<NoteDeFrais> selectAllFrais() throws SQLException {
			System.out.println("selectAllCollab1");
			List<NoteDeFrais> noteDeFrais = new ArrayList<NoteDeFrais>();
			Connection connection = DBUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FRAIS);
			System.out.println(SELECT_ALL_FRAIS);
			ResultSet rs =  preparedStatement.executeQuery();
			System.out.println(rs);

			while (rs.next()) {
				int id = rs.getInt("id");
				String raison = rs.getString("raison");
				double prix = rs.getDouble("prix");
				Date date = rs.getDate("date");
				noteDeFrais.add(new NoteDeFrais(id, raison, prix, date));
				System.out.println(id+" "+raison+" "+prix+" "+date);

			}
			rs.close();
			System.out.println(noteDeFrais);
			return noteDeFrais;
		}

		private final String DELETE_FRAIS_SQL = "DELETE FROM notedefrais WHERE raison = ?;";

		public boolean deleteFrais(String raison) throws SQLException {
			boolean rowDeleted;
			Connection connection = DBUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(DELETE_FRAIS_SQL);
			statement.setString(1, raison);
			rowDeleted = statement.executeUpdate() > 0;
			return rowDeleted;
		}

		private final String UPDATE_FRAIS_SQL = "UPDATE collaborateur SET raison = ?,prix =? ,date =? WHERE id = ?;";

		public boolean updateFrais(NoteDeFrais noteDeFrais) throws SQLException {
			boolean rowUpdated;
			Connection connection = DBUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(UPDATE_FRAIS_SQL);
			statement.setString(1, noteDeFrais.getRaison());
			statement.setDouble(2, noteDeFrais.getPrix());
			statement.setDate(3, (Date) noteDeFrais.getDate());
			statement.setInt(4, noteDeFrais.getId());
			rowUpdated = statement.executeUpdate() > 0;
			return rowUpdated;

		}

		
}
