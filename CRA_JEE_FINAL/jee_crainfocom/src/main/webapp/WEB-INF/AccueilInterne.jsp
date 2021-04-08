<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><p>Interne</p></center>
<hr>
<p>Ajout</p><p> Probleme parse </p>


<form method="post" action="ControleInterneGestionFrais" >
 
            <label for="raisonIn">raison : </label>
            <input type="text" name="raisonIn" id="raisonIn" />
            
            <label for="mailIn">prix : </label>
            <input type="text" name="prixIn" id="prixlIn" />
        
            <label for="dateIn">date : </label>
            <input style="margin: .4rem 0;" type="date" id="dateIn" name="dateIn" value="2018-07-22"  min="2018-01-01" max="2018-12-31">
            
   			<label for="idId">idColl : </label>
            <input type="text" name="idIn" id="idIn" />
            
            <input type="submit" name="button_clicked" value="ajoutFrais" />
</form>


</body>
</html>