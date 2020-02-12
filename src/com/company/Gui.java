package com.company;
import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{

	private JPanel northContentPanel;
	private JPanel southContentPanel;

	private JTextField textFieldPistonDiameter;
	private JTextField textFieldNrOfCyl;
	private JTextField textFieldCrankshaftRadius;
	private JTextField textFieldWidthConnetingRod;
	private JTextField textFieldLengthConnectingRod;
	private JTextField textFieldOperatingPressure;
	private JTextField textFieldPistonStroke;

	private JButton buttonTheoretischeLeistungskurve;


	public Gui() {

		northContentPanel = new JPanel();
		southContentPanel = new JPanel();


		textFieldPistonDiameter = new JTextField();					//Kolbendurchmesser
		textFieldNrOfCyl = new JTextField();
		textFieldCrankshaftRadius = new JTextField();
		textFieldWidthConnetingRod = new JTextField();
		textFieldLengthConnectingRod = new JTextField();
		textFieldOperatingPressure = new JTextField();
		textFieldPistonStroke = new JTextField();

		buttonTheoretischeLeistungskurve = new JButton("Theoretische Leistung berechnen");

		initWindow();
	}

	protected void initWindow()
	{
		this.setTitle("Engine Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Schließt nicht nur das Fenster sondern beendet die ganze Anwendung
		this.setSize(500,250);
		this.setLocationRelativeTo(null);

		//northContentPanel.setBackground(Color.GREEN);

		northContentPanel.setLayout( new GridLayout(0,3));

		northContentPanel.add(new JLabel("Piston Diameter: "));
		northContentPanel.add(textFieldPistonDiameter);
		northContentPanel.add(new JLabel("mm"));

		northContentPanel.add(new JLabel("Number of cylinders: "));
		northContentPanel.add(textFieldNrOfCyl);
		northContentPanel.add(new JLabel("Pieces"));

		northContentPanel.add(new JLabel("Crankshaft radius: "));
		northContentPanel.add(textFieldCrankshaftRadius);
		northContentPanel.add(new JLabel("mm"));

		northContentPanel.add(new JLabel("Width of connecting rod: "));
		northContentPanel.add(textFieldWidthConnetingRod);
		northContentPanel.add(new JLabel("mm"));

		northContentPanel.add(new JLabel("Length of connecting rod:"));
		northContentPanel.add(textFieldLengthConnectingRod);
		northContentPanel.add(new JLabel("mm"));

		northContentPanel.add(new JLabel("Piston stroke: "));
		northContentPanel.add(textFieldPistonStroke);
		northContentPanel.add(new JLabel("mm"));

		northContentPanel.add(new JLabel("Operating Pressure: "));
		northContentPanel.add(textFieldOperatingPressure);
		northContentPanel.add(new JLabel("Bar"));

		buttonTheoretischeLeistungskurve.addActionListener(event -> {
			String[] input = {
					textFieldPistonDiameter.getText(),
					textFieldNrOfCyl.getText(),
					textFieldCrankshaftRadius.getText(),
					textFieldWidthConnetingRod.getText(),
					textFieldLengthConnectingRod.getText(),
					textFieldPistonStroke.getText(),
					textFieldOperatingPressure.getText()
			};
			initObject(input);
		});


		southContentPanel.add(buttonTheoretischeLeistungskurve);

		this.add(BorderLayout.NORTH,northContentPanel);
		this.add(BorderLayout.SOUTH,southContentPanel);

		this.setVisible(true);

	}

	private String initObject(String[] input){		//Exception handling

		double[] values = new double[input.length];
		for(int i = 0; i < input.length; i++) {
			try{
				values[i] = Double.parseDouble(input[i]);
			}
			catch (NumberFormatException e){
				System.err.println("Fehler: Falscher Typ");
				
			}

			if(input[i] != null) {
				System.out.println(input[i]);
			}
		}

		return null;
	}
}
