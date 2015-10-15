package graficas;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel1 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g); 
        g.drawString("Hola desde www.capa8.tv", 100, 100);
    }
    
    
    
}
