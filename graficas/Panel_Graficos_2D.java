
package graficas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.io.File;
public class Panel_Graficos_2D extends JPanel
{
   
    private Image imagen;
    
    
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        
        Font mifuente=new Font("Arial",Font.PLAIN,25);
        g2.setFont(mifuente);
        g2.setColor(Color.orange);
        g2.drawString("Hola desde www.capa8.tv", 300, 100);
        
        try {
            File file=new File("src/images/cesar.png");
            imagen=ImageIO.read(file);
        } catch (Exception e) 
        {
            System.out.println("la imagen no se encuentra");
        }
        g2.drawImage(imagen,5,5,null);
        
    }
    
    
}
