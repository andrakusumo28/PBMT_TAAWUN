package pbmt_taawun;
//import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
//import de.javasoft.plaf.synthetica.SyntheticaClassyLookAndFeel;
import javax.swing.UIManager;
/**
 *
 * @author andrakusumo28
 */
public class Main {
    MenuUtama menu = new MenuUtama();
    //FormLogin form = new FormLogin();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try {
            UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        new FormLogin().show();//new LoginForm().show();
        }
}
