import javax.swing.JFrame;

/*****
 * @shashwatshukla
******/
public class Main {
    public static void main(String[] args) {
         JFrame f=new JFrame();
         Gameplay gameplay=new Gameplay();
         f.setBounds(10,10,700,600);
         f.setLocationRelativeTo(null);
         f.setTitle("Bang Ball");
         f.setResizable(false);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.add(gameplay);


    }
}
