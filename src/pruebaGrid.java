import javax.swing.*;
import java.awt.*;


class Ventana extends JFrame {
	 Icon icono = new ImageIcon("ready.PNG");
	 JButton btnSub = new JButton(icono);
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
		 metodoMagico(lbl2 ,0, 1,1, 1, 1);
		
		 JLabel clean = new JLabel("   ");
		 metodoMagico(clean, 0, 4,1 ,1, 1);
		 
		 JLabel FormO = new JLabel("Form options");
		 metodoMagico(FormO, 0, 5, 1, 1, 1);
		
		 
		 
		 JLabel include = new JLabel("Include the following                                             ");
		 metodoMagico(include, 0, 6, 1, 1, 1);
		 
		 JCheckBox title = new JCheckBox("a title for yur form");
		 metodoMagico(title, 0, 7, 1,1, 2);
		 
		 JTextArea subs = new JTextArea("Subscribe to our mailing list");
		 metodoMagico(subs, 0, 8, 1, 1, 2);
		 
		 JLabel clean1 = new JLabel("   ");
		 metodoMagico(clean1, 0, 9,1 ,1, 2);
		 
		 ButtonGroup bg = new ButtonGroup();
		 JRadioButton only = new JRadioButton("Only required fields");
		 metodoMagico(only, 0, 10, 1, 1, 2);
		 bg.add(only);
		 JRadioButton all = new JRadioButton("all fields");
		 metodoMagico(all, 0, 11, 1, 1, 2);
		 bg.add(all);
		 
		 JLabel edit = new JLabel("  (edit required fields in the form builder)");
		 metodoMagico(edit, 0, 12,1 ,1, 2);
		 
		 JLabel clean2 = new JLabel("   ");
		 metodoMagico(clean2, 0, 13,1 ,1, 2);
		 
		 JCheckBox interest = new JCheckBox("interest group fields");
		 metodoMagico(interest, 0, 14, 1, 1, 2);
		 
		 JCheckBox requiered = new JCheckBox("requiered field indicators");
		 
		 JLabel setForm = new JLabel("Set form width");
		 metodoMagico(setForm, 0, 15, 1, 1, 2);
		 
		 JTextArea serAreaForm = new JTextArea();
		 metodoMagico(serAreaForm, 0, 16, 1, 1, 2);
		 
		 JLabel clean3 = new JLabel("   ");
		 metodoMagico(clean3, 0, 17,1 ,1, 2);
		 
		 JLabel enhance = new JLabel("Enhance your form");
		 metodoMagico(enhance, 0, 18, 1, 1, 2);

		 JCheckBox evil = new JCheckBox("enable evil popup mode");
		 JCheckBox javaScript = new JCheckBox("disable all JavaSript");
		 JCheckBox archiveLink = new JCheckBox("include archive link");
		 JCheckBox monkey = new JCheckBox("include MonkeyRewards link");
		 
		 metodoMagico(evil, 0, 19, 1, 1, 2);
		 metodoMagico(javaScript, 0, 20, 1, 1, 2);
		 metodoMagico(archiveLink, 0, 21, 1, 1, 2);
		 metodoMagico(monkey, 0, 22, 1, 1, 2);
		 
		 
		 JLabel preview = new JLabel("              Preview                                                                                                                      ");
		 metodoMagico(preview, 4, 0, 5, 1, 2);
		 
		 JLabel clean4 = new JLabel("   ");
		 metodoMagico(clean4, 4, 4,1 ,1, 2);
		 
		 JLabel email = new JLabel("              Email Address");
		 metodoMagico(email, 4, 5, 1, 1, 2);
	 
		 JTextArea emailArea = new JTextArea("@gmail.com");
		 metodoMagico(emailArea, 5, 6, 0, 1, 2);
		
		 JLabel firstN = new JLabel("        Fisrt Name");
		 metodoMagico(firstN, 4, 7, 4, 1, 0);
		 
		 JTextArea firstNArea = new JTextArea();
		 metodoMagico(firstNArea, 5, 8, 0, 1, 2);
		 
		 JLabel lastN = new JLabel("       Last Name");
		 metodoMagico(lastN, 4, 9, 4, 1, 0);
		 
		 JTextArea lastNArea = new JTextArea();
		 metodoMagico(lastNArea, 5, 10, 0, 1, 2);
		 
		 
		 
		 metodoMagico(btnSub, 4, 11, 1, 1, 1);
		 
		 
		 JLabel copy = new JLabel("           Copy/paste onto your site");
		 metodoMagico(copy, 4, 13, 1, 1, 1);
		 
		 JTextArea area = new JTextArea();
		 metodoMagico(area, 5, 14, 4, 10, 1);
		 
		 
		 
		 
		 
		 
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
