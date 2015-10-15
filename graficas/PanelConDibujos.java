
package graficas;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelConDibujos extends JPanel {

   
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Estamos apendiendo", 100,100);
        g.drawRect(50, 150, 200, 50);//generar cuadrado o rectángulo
        g.drawOval(50, 150, 100, 100);
        g.drawLine(50,150, 100, 100);
    }
    
    
}
