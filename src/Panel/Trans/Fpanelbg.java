package Panel.Trans;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fpanelbg extends JPanel {
    private Image gam;

    public Fpanelbg() {
        setOpaque(true);
        gam=new ImageIcon(getClass().getResource("/panelbgtransparan/mus.jpg")).getImage();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(gam, 0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}
