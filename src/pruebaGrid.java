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
		 metodoMagico(lbl1, 0, 0,3, 1, 1);
		
		 JLabel lbl2 = new JLabel("this list");
		 metodoMagico(lbl2 ,0, 1,1, 1, 1);
		
		 JLabel clean = new JLabel("   ");
		 metodoMagico(clean, 0, 4,1 ,1, 1);
		 
		 JLabel FormO = new JLabel("Form options");
		 metodoMagico(FormO, 0, 5, 1, 1, 1);
		
		 
		 
		 JLabel include = new JLabel("Include the following");
		 metodoMagico(include, 0, 6, 1, 1, 1);
		 
		 JCheckBox title = new JCheckBox("a title for yur form");
		 metodoMagico(title, 0, 7, 1,1, 1);
		 
		 JTextArea subs = new JTextArea("Subscribe to our mailing list");
		 metodoMagico(subs, 0, 8, 1, 1, 1);
		 
		 JLabel clean1 = new JLabel("   ");
		 metodoMagico(clean1, 0, 9,1 ,1, 1);
		 
		 ButtonGroup bg = new ButtonGroup();
		 JRadioButton only = new JRadioButton("Only required fields");
		 metodoMagico(only, 0, 10, 1, 1, 1);
		 bg.add(only);
		 JRadioButton all = new JRadioButton("all fields");
		 metodoMagico(all, 0, 11, 1, 1, 1);
		 bg.add(all);
		 
		 JLabel edit = new JLabel("  (edit required fields in the form builder)");
		 metodoMagico(edit, 0, 12,1 ,1, 1);
		 
		 JLabel clean2 = new JLabel("   ");
		 metodoMagico(clean2, 0, 13,1 ,1, 1);
		 
		 JCheckBox interest = new JCheckBox("interest group fields");
		 metodoMagico(interest, 0, 14, 1, 1, 1);
		 
		 JCheckBox requiered = new JCheckBox("requiered field indicators");
		 
		 JLabel setForm = new JLabel("Set form width");
		 metodoMagico(setForm, 0, 15, 1, 1, 1);
		 
		 JTextArea serAreaForm = new JTextArea();
		 metodoMagico(serAreaForm, 0, 16, 1, 1, 1);
		 
		 JLabel clean3 = new JLabel("   ");
		 metodoMagico(clean3, 0, 17,1 ,1, 1);
		 
		 JLabel enhance = new JLabel("Enhance your form");
		 metodoMagico(enhance, 0, 18, 1, 1, 1);

		 JCheckBox evil = new JCheckBox("enable evil popup mode");
		 JCheckBox javaScript = new JCheckBox("disable all JavaSript");
		 JCheckBox archiveLink = new JCheckBox("include archive link");
		 JCheckBox monkey = new JCheckBox("include MonkeyRewards link");
		 
		 metodoMagico(evil, 0, 19, 1, 1, 1);
		 metodoMagico(javaScript, 0, 20, 1, 1, 1);
		 metodoMagico(archiveLink, 0, 21, 1, 1, 1);
		 metodoMagico(monkey, 0, 22, 1, 1, 1);
		 
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
