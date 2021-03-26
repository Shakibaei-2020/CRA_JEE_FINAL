package com.infocom.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.infocom.model.Collaborateur;
import com.infocom.model.util.DBUtil;

public class CollaborateurDAO {
	
	private  final String INSERT_COLLAB_SQL = "INSERT INTO collaborateur" + "  (nom_coll, societe_coll, poste_coll) VALUES " + " (?, ?, ?);";

	
	 public void insertCollab(Collaborateur collaborateur) throws SQLException {
	        System.out.println(INSERT_COLLAB_SQL);
	         Connection connection = DBUtil.getConnection(); 
	        	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_COLLAB_SQL); 
	            preparedStatement.setString(1, collaborateur.getnomCollab());
	            preparedStatement.setString(2, collaborateur.getsocieteCollab());
	            preparedStatement.setString(3, collaborateur.getpostCollab());
	            System.out.println(preparedStatement);
	            preparedStatement.executeUpdate();
	            connection.close();
	            
	            System.out.println("ajoute effectué");
	            
	 }          
	
}

