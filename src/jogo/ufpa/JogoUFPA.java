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
        Jogador Felipe = new Jogador();
        boolean ga;
        Felipe.setNome("Felipe");
        Felipe.setPosicao(58);
        Acao Acao = new Acao();
        ga = Acao.Acao(Felipe);
        System.out.println(ga);
    }
    
}
