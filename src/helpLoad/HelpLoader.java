/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpLoad;

import javax.help.HelpBroker;
import javax.help.HelpSet;
import java.net.URL;

public class HelpLoader {

    public static void loadHelp() {
        try {
            
            URL hsURL = HelpLoader.class.getResource("/help/helpset.hs");
            if (hsURL == null) {
                System.err.println("Archivo helpset no encontrado");
                return;
            }

            
            HelpSet helpSet = new HelpSet(null, hsURL);
            HelpBroker helpBroker = helpSet.createHelpBroker();

            
            helpBroker.setDisplayed(true); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        loadHelp();
    }
}
