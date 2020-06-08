
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiangottalent.domain.Reclamation;
import utils.DataSource;

public class ReclamationService implements Iservice{
    //CRUD
   private Connection conn;
   private Statement ste;
   private PreparedStatement pst;
   private ResultSet rs;
    
    
    public ReclamationService() {
        conn=DataSource.getInstance().getCnx();
    }
    
  
    public void insert(Reclamation r){
        String req="insert into reclamation (type ,reclamation, id_utilisateur ,url) values(?,?,?,?)";
       try {
           pst=conn.prepareStatement(req);
           
           pst.setString(1, r.getType());
           pst.setString(2, r.getDetailReclamation());
           pst.setDouble(3, r.getUtilisateur().getIdUtilisateur());
           pst.setString(4, r.getUrl());
           
           pst.executeUpdate();
           
       } catch (SQLException ex) {
           Logger.getLogger(ReclamationService.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void delete(int id){
        String req="delete from reclamation where id = ?";
         try {
           pst=conn.prepareStatement(req);
           pst.setDouble(1, id);
             pst.executeUpdate();
           
       } catch (SQLException ex) {
           Logger.getLogger(ReclamationService.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void update(Reclamation p){
        
    }
    
//   @Override
//    public List<Reclamation> getAll(){
//        String requete="select * from personne";
//        List<Reclamation> list=new ArrayList<>();
//       try {
//           ste=conn.createStatement();
//           rs= ste.executeQuery(requete);
//          while(rs.next()){
//              list.add(new Reclamation(rs.getInt("id"), rs.getString(2), rs.getString("prenom")));
//          }
//       } catch (SQLException ex) {
//           Logger.getLogger(ReclamationService.class.getName()).log(Level.SEVERE, null, ex);
//       }
//       return list;
//    } 
//    
//    public Reclamation getById(int id){
//        String req="select * from personne where id="+id;
//        
//        
//    }
    
    
}


