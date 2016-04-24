package jogo.ufpa;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Background extends JPanel{
    
    private Image background;
    private PosicaoJogador posicaoJogador;
    
    public Background(){
        ImageIcon ref = new ImageIcon("res//untitled.png");
        background = ref.getImage();
        
        posicaoJogador = new PosicaoJogador();
    }
    
    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D)g;
        graficos.drawImage(background, 0, 0, null);
        graficos.drawImage(posicaoJogador.getIcone(), posicaoJogador.getX(), posicaoJogador.getY(), this);
        
        g.dispose();
    }
   
}