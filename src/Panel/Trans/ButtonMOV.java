
package Panel.Trans;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

/**
 *
 * @author Administrator
 */
public class ButtonMOV extends JButton {
    private boolean over;
    private boolean tekan;

    private Paint paint;
    private Shape shape;

    private Paint glass;
    private Paint glass2;

    /**
     *
     */
    public ButtonMOV() {
setOpaque(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                 setOver(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOver(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setTekan(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setTekan(false);
            }
        });

    }

    /**
     *
     * @return
     */
    public boolean isOver() {
        return over;
    }

    /**
     *
     * @param over
     */
    public void setOver(boolean over) {
	 this.over = over;
	 repaint();
    }

    /**
     *
     * @return
     */
    public boolean isTekan() {
	 return tekan;
    }

    /**
     *
     * @param tekan
     */
    public void setTekan(boolean tekan) {
	 this.tekan = tekan;
	 repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr=(Graphics2D)g.create();


        paint =new GradientPaint(0,0,new Color(1F,1F,1F,0F),0,getHeight(),new Color(1F,1F,1F,0.2F));
        shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50);

        if(isOver()){
            glass =new GradientPaint(0,0,new Color(1F,1F,1F,0F),0,getHeight(),new Color(1F,1F,1F,0.3F));

        }
        else{
            glass =new GradientPaint(0,0,new Color(1F,1F,1F,0.3F),0,getHeight(),new Color(1F,1F,1F,0F));
        }

        if(isTekan()){
            glass2 =new GradientPaint(0,0,new Color(1F,1F,1F,0F),0,getHeight(),new Color(1F,1F,1F,0.3F));
        }
        else{
            glass2 =new GradientPaint(0,0,new Color(1F,1F,1F,0.2F),0,getHeight(),new Color(1F,1F,1F,0F));
        }

        gr.setPaint(paint);


        super.paintComponent(g);

        gr.setPaint(glass);
        gr.fill(shape);

        gr.setPaint(glass2);
        gr.fill(shape);

        gr.dispose();
    }

    /**
     *
     * @param string
     */
    public void setIcon(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
