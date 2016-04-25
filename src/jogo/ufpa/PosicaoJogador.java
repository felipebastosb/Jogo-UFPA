package jogo.ufpa;

import java.awt.Image;
import javax.swing.ImageIcon;

public class PosicaoJogador {
    private int x,y; //coordenadas no background
    private Image icone; // icone do jogador
    private Jogador Jogador;
    private int Posicao;
    
    public void PosicaoJogador(Jogador jogador){

        this.Jogador = jogador;
        this.Posicao = Jogador.getPosicao();
        
        switch (this.Posicao){
            case 0:
            {
            ImageIcon ref = new ImageIcon("res//player1.png");
            icone = ref.getImage();
            this.x = 540;
            this.y = 90;
            
            break;
            }
            
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

}
