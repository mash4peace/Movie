package Mohamed.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tq1499vg on 3/29/2017.
 */
public class MovieRatings extends JFrame {
    private JButton submitButton;
    private JComboBox movieRatingcomboBox1;
    private JTextField movienametextField1;
    private JPanel rootpanel;
    protected MovieRatings(){
        this.setContentPane(rootpanel);
        
        configuration();
        configuartionBtn();
        pack();
        setVisible(true);
    }

    private void configuartionBtn() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movename = movienametextField1.getText();
                String rating = (String)movieRatingcomboBox1.getSelectedItem();

                String result = "You gave " + movename + " "+ rating;
                JOptionPane.showMessageDialog(MovieRatings.this, result);
            }
        });
    }

    private void configuration() {
        for (int i = 1; i <= 5; i++) {
            if(i == 1 ){
                movieRatingcomboBox1.addItem(i + " star ");
            }
            else{
                movieRatingcomboBox1.addItem(i + " stars");
            }

        }
    }
}
