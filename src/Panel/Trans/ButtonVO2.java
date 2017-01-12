/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel.Trans;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JButton;
/**
 *
 * @author ARDIN
 */
public class ButtonVO2 extends JButton {
    private Icon iconEnter, iconExit, iconPress;   

    public ButtonVO2() {
        iconEnter = null;
        iconExit = null;        
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        setFont(getFont().deriveFont(Font.BOLD));
        setForeground(Color.white);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                setIcon(iconEnter);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                setIcon(iconExit);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                setIcon(iconPress);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                setIcon(iconEnter);
            }
            
        });
    }

    public void setIconEnter(Icon iconEnter){
        this.iconEnter = iconEnter;
    }

    public void setIconExit(Icon iconExit){
        this.iconExit = iconExit;
    }

     public void setIconPress(Icon iconPress) {
        this.iconPress = iconPress;
    }
}
