


package dao;


import java.sql.SQLEXception;
import java.sql.Connection;

import metier.Client;

Public class ClientDao implements GestionInterfaceClient> {




@Overhide
public int insert(Client client ) throws SQLEXception {

    //CREATION DE L4OBJET connection / CNX  

/* Connect connect = connect.getInstance(); // la fonction getInstance est static 
Connection cnx = connect.getConnection();*/n


Connection cnx = connect.getInstance().getConnection();

// 

String req = "INSERT INTO client (Nom,Nrenom,Numtel) Values (?,?,?)  ";
//  Etape n°3 creation de l'objet preparedStatement

PreparedStatement stm = cnx.preparedStatement(req);
// connexion à créer avant sinon => marche pas 

//4 stm 

stm.setString(1, Client.getNom ());
stm.setString(1, Client.getPrenom ());
stm.setString(1, Client.getNumTel ());


// 5 Etape appel de la fonction excute

stm.executeUpdate
}

@Overhide 

public int delete (int id) throws SQLException  {
//  TODO Auto - generated method stub 

}