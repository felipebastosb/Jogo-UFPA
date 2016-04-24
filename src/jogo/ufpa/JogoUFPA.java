package jogo.ufpa;

import javax.swing.JFrame;

public class JogoUFPA extends JFrame{

    public JogoUFPA(){
        add(new Background());
        setTitle("Jogo UFPA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,768);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
}
    
    public static void main(String[] args) {
        new JogoUFPA();
    }
    
}
