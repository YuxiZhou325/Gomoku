import java.awt.*;
import javax.swing.*;

public class Gomoku extends JFrame{

    private Board Board;
    //private Shape Shape;

    public Gomoku(){
        Board = new Board();
        //Shape = new Shape();
        //JPanel panel_west= new JPanel();
        //JPanel panel_east = new JPanel();
        //JPanel p1 = new JPanel();
        //JPanel p2 = new JPanel();
        //JPanel p3 = new JPanel();
        //JPanel p4 = new JPanel();

        //p1.add(Shape);
        //panel_east.add(p1, BorderLayout.EAST);
        //panel_west.add(Board, BorderLayout.WEST);

        setTitle("Gomoku");
        setSize(700,700);
        Container containerPane = getContentPane();
        containerPane.add(Board);
    }

    public static void main(String[] args) {
        Gomoku Gomoku = new Gomoku();
        Gomoku.setVisible(true);
    }
}
