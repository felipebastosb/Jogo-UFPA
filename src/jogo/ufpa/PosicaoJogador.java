package jogo.ufpa;

import java.awt.Image;
import javax.swing.ImageIcon;

public class PosicaoJogador {
    private int x, y; //coordenadas no background
    private int dx, dy; // variação das coordenadas
    private Image icone; // icone do jogador
    
    
    public PosicaoJogador(){
        
        ImageIcon referencia = new ImageIcon("res//player1.png");
        icone = referencia.getImage();
        
        this.x = 560;
        this.y = 180;
    }
    
    public void mexer(){
        x += dx;
        y += dy;
    }
     
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public Image getIcone(){
        return icone;
    }
    
    }
