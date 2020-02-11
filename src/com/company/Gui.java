package com.company;
import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{

	//JTextField	textFieldPistonDiameter;		//Kolbendurchmesser
	//JTextField	textFieldPistonStroke;			//Kolbenhub
	//JTextField	textFieldNrOfCyl;				//ylinderanzahl
	//JTextField	textFieldCrankshaftRadius;		//Korbelwellenradius
	//JTextField	textFieldWidthConnectingRod;	//Pleuelbreite
	//JTextField	textFieldLenghtConnectingRod;	//Pleuellänge
	//JTextField	textFieldOperatingPressure;		//Betriebsdruck
	//JButton		buttonTheoretischeLeistungskurve;

	public Gui() {
		this.initWindow();
	}

	protected void initWindow()
	{
		JFrame frame = new JFrame("Engine Caculator");
		JPanel panel = new JPanel();
		frame.add(panel);

		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Schließt nicht nur das Fenster sondern beendet die ganze Anwendung

		JPanel contentPanel = new JPanel();
		contentPanel.setLayout( new GridLayout(8,3) );

		JLabel jLabelPistonDiameter = new JLabel();
		JTextField textFieldPistonDiameter = new JTextField();					//Kolbendurchmesser

		JButton buttonTheoretischeLeistungskurve = new JButton("Theoretische Leistung berechnen");

		contentPanel.add(textFieldPistonDiameter);

		contentPanel.add(buttonTheoretischeLeistungskurve);

		jLabelPistonDiameter.add(buttonTheoretischeLeistungskurve);

		frame.getContentPane().add(BorderLayout.CENTER,contentPanel);
		frame.setSize(500,200);
		frame.setVisible(true);


	}
}
