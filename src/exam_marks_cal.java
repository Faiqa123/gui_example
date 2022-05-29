import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exam_marks_cal {
    private JTextField Q1;
    private JTextField Q2;
    private JTextField Q3;
    private JTextField Remark;
    private JButton Calculate;
    private JTextField TotalMark;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("exam_marks_cal");
        frame.setContentPane(new exam_marks_cal().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public exam_marks_cal() {
        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,total;

                m1 = Integer.parseInt(Q1.getText());
                m2 = Integer.parseInt(Q2.getText());
                m3 = Integer.parseInt(Q3.getText());

                total = m1 + m2 + m3;
                TotalMark.setText(String.valueOf(total));

                if(total > 50){
                    Remark.setText("Pass");
                }
                else{
                    Remark.setText("Fail");
                }

            }
        });
    }
}
