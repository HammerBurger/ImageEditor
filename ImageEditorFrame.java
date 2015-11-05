import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
public class ImageEditorFrame extends JFrame{
 public ImageEditorFrame(){
	 
	setTitle("Image Editor");
	ImageEditorPanel panel = new ImageEditorPanel();
	add(panel);
	
	BufferedImage bufferedImage = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
    Graphics g = bufferedImage.getGraphics();
    g.setColor(Color.YELLOW);
    g.fillOval(10, 10, 380, 280);
    panel.setImage(bufferedImage);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(400, 300);
	this.setVisible(true);
	
 }

 public static void main(String[] args)
 {
  ImageEditorFrame frame = new ImageEditorFrame();
 }
}
