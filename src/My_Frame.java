import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class My_Frame extends JFrame{

    JButton button;
    JTextField textField;
    JCheckBox checkbox;

    My_Frame(){

        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My frame!");
       // ImageIcon img = new ImageIcon("");
       // setIconImage(img);
        getContentPane().setBackground(Color.CYAN);

        setLayout(new FlowLayout());

//        checkbox = new JCheckBox("Check: ");
//        checkbox.setHorizontalTextPosition(JCheckBox.LEFT);
//
//        button = new JButton("Submit");
//        button.addActionListener(this);
//        add(checkbox);
//        add(button);
//        textField = new JTextField();
//        textField.setPreferredSize(new Dimension(250,40));
//
//        button = new JButton("Click!");
//        button.addActionListener(this);
//
//        add(textField);
//        add(button);
//        JLabel label1 = new JLabel();
//        label1.setOpaque(true);
//        label1.setBackground(Color.red);
//        label1.setBounds(50,50,200,200);
//
//        JLabel label2 = new JLabel();
//        label2.setOpaque(true);
//        label2.setBackground(Color.green);
//        label2.setBounds(100,100,200,200);
//
//        JLabel label3 = new JLabel();
//        label3.setOpaque(true);
//        label3.setBackground(Color.blue);
//        label3.setBounds(150,150,200,200);
//
//        JLayeredPane pane1 = new JLayeredPane();
//        pane1.setBounds(0,0,500,500);
//
//        pane1.add(label1, JLayeredPane.DEFAULT_LAYER);
//        pane1.add(label2, JLayeredPane.DEFAULT_LAYER);
//        pane1.add(label3, JLayeredPane.DRAG_LAYER);
//
//        setLayout(null);
//
//
//        add(pane1);

//        add(new JButton("1"));
//        add(new JButton("2"));
//        add(new JButton("3"));
//        add(new JButton("4"));
//        add(new JButton("5"));
//        add(new JButton("6"));
//        add(new JButton("7"));
//        add(new JButton("8"));
//        add(new JButton("9"));

//        setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
//
//        add(new JButton("1"));
//        add(new JButton("2"));
//        add(new JButton("3"));
//        add(new JButton("4"));
//        add(new JButton("5"));
//        add(new JButton("6"));
//        add(new JButton("7"));
//        add(new JButton("8"));
//        add(new JButton("9"));
//        add(new JButton("10"));

//        JPanel panel1 = new JPanel();
//        JPanel panel2 = new JPanel();
//        JPanel panel3 = new JPanel();
//        JPanel panel4 = new JPanel();
//        JPanel panel5 = new JPanel();
//
//        panel1.setBackground(Color.RED);
//        panel2.setBackground(Color.green);
//        panel3.setBackground(Color.orange);
//        panel4.setBackground(Color.yellow);
//        panel5.setBackground(Color.blue);
//
//        panel1.setPreferredSize(new Dimension(100,100));
//        panel2.setPreferredSize(new Dimension(100,100));
//        panel3.setPreferredSize(new Dimension(100,100));
//        panel4.setPreferredSize(new Dimension(100,100));
//        panel5.setPreferredSize(new Dimension(100,100));
//
//        add(panel1, BorderLayout.WEST);
//        add(panel2, BorderLayout.EAST);
//        add(panel3, BorderLayout.SOUTH);
//        add(panel4, BorderLayout.CENTER);
//        add(panel5, BorderLayout.NORTH);


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


//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==button){
//            System.out.println(checkbox.isSelected()? "yes": "no");
//        }
//    }
}
