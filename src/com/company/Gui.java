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
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Schließt nicht nur das Fenster sondern beendet die ganze Anwendung

	}

	protected void initWindow()
	{
		JFrame f = new JFrame("Engine Caculator");
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout( new GridLayout(8,3) );

		JLabel jLabelPistonDiameter = new JLabel();
		JTextField textFieldPistonDiameter = new JTextField();					//Kolbendurchmesser

		JTextField textFieldPistonStroke = new JTextField();

		JTextField textFieldNrOfCyl = new JTextField();

		JTextField textFieldCrankshaftRadius = new JTextField();

		JTextField textFieldWidthConnectingRod = new JTextField();

		JTextField textFieldLenghtConnectingRod = new JTextField();

		JTextField textFieldOperatingPressure = new JTextField();

		JButton buttonTheoretischeLeistungskurve = new JButton("Theoretische Leistung berechnen");

		contentPanel.add(textFieldPistonDiameter);
		contentPanel.add(textFieldPistonStroke);
		contentPanel.add(textFieldNrOfCyl);
		contentPanel.add(textFieldCrankshaftRadius);
		contentPanel.add(textFieldWidthConnectingRod);
		contentPanel.add(textFieldLenghtConnectingRod);
		contentPanel.add(textFieldOperatingPressure);
		contentPanel.add(buttonTheoretischeLeistungskurve);

		jLabelPistonDiameter.add(buttonTheoretischeLeistungskurve);

		f.getContentPane().add(BorderLayout.CENTER,contentPanel);
		f.setSize(500,200);
		f.setVisible(true);


	}
}
