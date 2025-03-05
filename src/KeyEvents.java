import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvents extends JFrame implements KeyListener {

    JLabel label = new JLabel();

    KeyEvents(){

        setVisible(true);
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setLayout(null);

        label.setBounds(0,0,100,100);
        label.setBackground(Color.GREEN);
        label.setOpaque(true);

        add(label);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyCode()){
            case 87: label.setLocation(label.getX(), label.getY()-4);
                break;
            case 65: label.setLocation(label.getX()-4, label.getY());
                break;
            case 83: label.setLocation(label.getX(), label.getY()+4);
                break;
            case 68: label.setLocation(label.getX()+4, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 87: label.setLocation(label.getX(), label.getY()-4);
            break;
            case 65: label.setLocation(label.getX()-4, label.getY());
            break;
            case 83: label.setLocation(label.getX(), label.getY()+4);
            break;
            case 68: label.setLocation(label.getX()+4, label.getY());
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

       // System.out.println("U press " + e.getKeyChar()+ " --- " + e.getKeyCode());

        //label.setLocation(label.getX(), label.getY());
    }
}
