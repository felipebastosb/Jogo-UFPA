
package jogo.ufpa;

import javax.swing.JOptionPane;


public class JogoCLI 
{
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogador3;
    private Jogador jogador4;
    private Dado dado;
    private Acao acao;
    private boolean fim = false;
    private int face;
    private String Ganhou;
    
    
     public void JogoCLI(Jogador jogador1, Jogador jogador2,Jogador jogador3,Jogador jogador4) 
    {
        this.jogador1=jogador1;
        this.jogador2=jogador2;
        this.jogador3=jogador3;
        this.jogador4=jogador4;
        this.jogador1.setNumero(1);
        this.jogador2.setNumero(2);
        this.jogador3.setNumero(3);
        this.jogador4.setNumero(4);
        this.dado= new Dado();
        this.acao = new Acao();
        
        while(fim == false)
        {
            this.face = dado.getFace();
            this.jogador1.setPosicao(this.jogador1.getPosicao()+face);
            this.fim = this.acao.Acao(jogador1);
            this.Ganhou = this.jogador1.getNome();
            if(this.jogador1.getCRG()<=0)
            {
                this.jogador1.setJubilado(this.jogador1.getJubilado()+1);
            }
            if(this.jogador1.getJubilado()>3)
            {
                this.jogador1.setCahorro(true);
            }
            
            this.face = dado.getFace();
            this.jogador2.setPosicao(this.jogador2.getPosicao()+face);
            this.fim = this.acao.Acao(jogador2);
            this.Ganhou = this.jogador2.getNome();
            if(this.jogador2.getCRG()<=0)
            {
                this.jogador2.setJubilado(this.jogador2.getJubilado()+1);
            }
            if(this.jogador2.getJubilado()>3)
            {
                this.jogador2.setCahorro(true);
            }
            
            this.face = dado.getFace();
            this.jogador3.setPosicao(this.jogador3.getPosicao()+face);
            this.fim = this.acao.Acao(jogador3);
            this.Ganhou = this.jogador3.getNome();
            if(this.jogador3.getCRG()<=0)
            {
                this.jogador3.setJubilado(this.jogador3.getJubilado()+1);
            }
            if(this.jogador3.getJubilado()>3)
            {
                this.jogador3.setCahorro(true);
            }
            
            this.face = dado.getFace();
            this.jogador4.setPosicao(this.jogador4.getPosicao()+face);
            this.fim = this.acao.Acao(jogador4);
            this.Ganhou = this.jogador4.getNome();
            if(this.jogador4.getCRG()<=0)
            {
                this.jogador4.setJubilado(this.jogador4.getJubilado()+1);
            }
            if(this.jogador4.getJubilado()>3)
            {
                this.jogador4.setCahorro(true);
            }
        }
        
        JOptionPane.showMessageDialog(null, this.Ganhou + "é o vencedor");
        
       
        
    }
}
