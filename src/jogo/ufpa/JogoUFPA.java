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
        Jogador Andre = new Jogador();
        Andre.setNome("André");
        
        Jogador Felipe = new Jogador();
        Felipe.setNome("Felipe");
        
        Jogador Helder = new Jogador();
        Helder.setNome("Helder");
        
        Jogador Joseph = new Jogador();
        Joseph.setNome("Joseph");
        
        JogoCLI jogo = new JogoCLI();
        jogo.JogoCLI(Andre, Felipe, Helder, Joseph);
    }
    
}
