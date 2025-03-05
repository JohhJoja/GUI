import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListeners extends JFrame implements MouseListener {

    JLabel label = new JLabel();

    MouseListeners(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
        setLayout(null);

        label.setBounds(0,0,100,100);
        label.setBackground(Color.GREEN);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);

    }

    @Override
    public void mouseClicked(MouseEvent e){System.out.println("U click!");}
    @Override
    public void mousePressed(MouseEvent e) {System.out.println("U press");}
    @Override
    public void mouseReleased(MouseEvent e) {System.out.println("U release");}
    @Override
    public void mouseEntered(MouseEvent e) {System.out.println("U enter");}
    @Override
    public void mouseExited(MouseEvent e) {System.out.println("U leave");}
}
