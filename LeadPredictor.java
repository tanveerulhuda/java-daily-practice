import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LeadPredictor extends JFrame {

    JComboBox<String> interestBox;
    JTextField budgetField, interactionField;
    JLabel resultLabel;

    public LeadPredictor() {
        setTitle("Lead Conversion Predictor");
        setSize(420, 420);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Lead Conversion Predictor");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(60, 20, 300, 30);
        add(title);

        JLabel interestLabel = new JLabel("Interest Level:");
        interestLabel.setBounds(40, 80, 150, 30);
        add(interestLabel);

        String[] interest = {"Low", "Medium", "High"};
        interestBox = new JComboBox<>(interest);
        interestBox.setBounds(200, 80, 150, 30);
        add(interestBox);

        JLabel budgetLabel = new JLabel("Budget (in thousands):");
        budgetLabel.setBounds(40, 130, 200, 30);
        add(budgetLabel);

        budgetField = new JTextField();
        budgetField.setBounds(200, 130, 150, 30);
        add(budgetField);

        JLabel interactionLabel = new JLabel("Previous Interactions:");
        interactionLabel.setBounds(40, 180, 200, 30);
        add(interactionLabel);

        interactionField = new JTextField();
        interactionField.setBounds(200, 180, 150, 30);
        add(interactionField);

        JButton predictBtn = new JButton("Predict");
        predictBtn.setBounds(130, 240, 150, 40);
        predictBtn.setBackground(Color.GREEN);
        predictBtn.setForeground(Color.BLACK);
        add(predictBtn);

        resultLabel = new JLabel("Result will appear here...");
        resultLabel.setBounds(60, 300, 300, 30);
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(resultLabel);

        predictBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                predictLead();
            }
        });

        setVisible(true);
    }

    // Simple built-in prediction logic (ML-like)
   private void predictLead() {
    try {
        // Interest value
        String interest = interestBox.getSelectedItem().toString();
        int interestValue;

        switch (interest) {
            case "Low":
                interestValue = 1;
                break;
            case "Medium":
                interestValue = 2;
                break;
            default:
                interestValue = 3;
                break;
        }

        int budget = Integer.parseInt(budgetField.getText());
        int interactions = Integer.parseInt(interactionField.getText());

        // BALANCED prediction formula
        // Budget is given in thousands, so divide by 1000 to scale properly
        int score = (interestValue * 30) + (budget / 1000) + (interactions / 10);

        // Decision threshold
        if (score >= 120) {
            resultLabel.setText("✔ Lead WILL Convert!");
            resultLabel.setForeground(Color.GREEN);
        } else {
            resultLabel.setText("✘ Lead Will NOT Convert");
            resultLabel.setForeground(Color.RED);
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    public static void main(String[] args) {
        new LeadPredictor();
    }
}
