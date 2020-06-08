/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent;

import service.ReclamationService;
import tunisiangottalent.domain.Reclamation;
import tunisiangottalent.domain.Utilisateur;


public class TunisianGotTalent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReclamationService rs=new ReclamationService();
        rs.insert(new Reclamation(Double.NaN, new Utilisateur(), "test", "test", "test"));
    }
    
}
