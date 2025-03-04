import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class My_Frame extends JFrame implements ActionListener {

    JButton button;

    My_Frame(){

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My frame!");
       // ImageIcon img = new ImageIcon("");
       // setIconImage(img);
        getContentPane().setBackground(Color.CYAN);

//        JLabel label = new JLabel("Bro, darova");
//        ImageIcon img = new ImageIcon("");
//        label.setIcon(img);
//        label.setHorizontalTextPosition(JLabel.CENTER);
//        label.setVerticalTextPosition(JLabel.TOP);
//        label.setForeground(Color.GREEN);
//        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
//        label.setIconTextGap(10);
//        label.setBackground(Color.BLACK);
//        label.setOpaque(true);
//        label.setBorder(BorderFactory.createLineBorder(Color.BLUE, 10));
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setVerticalAlignment(JLabel.CENTER);
       // label.setBounds(0,0,250,250);

  //      add(label);

        setLayout(null);
//
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.GREEN);
//        panel.setBounds(0,0,150,150);
//        panel.add(new JLabel("Hello"));
//
//        add(panel);

        button = new JButton("Click!");
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBackground(Color.magenta);
        button.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));

        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("Click!");
            button.setEnabled(false);
        }
    }
}
