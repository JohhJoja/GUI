import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class My_Frame extends JFrame  {

    JButton button;

    My_Frame(){

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My frame!");
       // ImageIcon img = new ImageIcon("");
       // setIconImage(img);
        getContentPane().setBackground(Color.CYAN);

        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.orange);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        add(panel1, BorderLayout.WEST);
        add(panel2, BorderLayout.EAST);
        add(panel3, BorderLayout.SOUTH);
        add(panel4, BorderLayout.CENTER);
        add(panel5, BorderLayout.NORTH);

        
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

    //    setLayout(null);
//
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.GREEN);
//        panel.setBounds(0,0,150,150);
//        panel.add(new JLabel("Hello"));
//
//        add(panel);

//        button = new JButton("Click!");
//        button.setBounds(200,100,100,50);
//        button.addActionListener(this);
//        button.setFocusable(false);
//        button.setBackground(Color.magenta);
//        button.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
//
//        add(button);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==button){
//            System.out.println("Click!");
//            button.setEnabled(false);
//        }



    }
}
