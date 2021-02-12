import javax.swing.*;
import java.awt.*;

class Ventana extends JFrame{
	
	 GridBagLayout gbl = new GridBagLayout();
	 GridBagConstraints gbc = new GridBagConstraints();

	 public Ventana() {
		 getContentPane().setLayout(gbl);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setTitle("T1_A3_GridBagLayout");
		
		 
		 
		 setVisible(true);
		 
		 

		 
		 
		 
		 JLabel lbl1 = new JLabel("The Classic Form includes all visibles fields for");
		 metodoMagico(lbl1, 0, 0,1, 1, 0);
		
		 JLabel lbl2 = new JLabel("this list");
		 metodoMagico(lbl2 ,1, 1,1, 1, 0);
		 
		 
		 JLabel FormO = new JLabel("Form options");
		 metodoMagico(FormO, 0, 5, 1, 1, 0);
		 
		 
		 
		  pack();
	      setLocationRelativeTo(null);
	 }
	 public void metodoMagico(JComponent c, int gx, int gy, int gw, int gh, int f){
	        gbc.gridx = gx;
	        gbc.gridy = gy;
	        gbc.gridwidth = gw;
	        gbc.gridheight = gh;
	        gbc.fill = f;
	        gbl.setConstraints(c, gbc);
	        add(c);
	    }
}


public class pruebaGrid {

	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new Ventana();
	            }
	        });
		
	}

}
