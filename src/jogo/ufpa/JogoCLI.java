
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
            
            if(this.jogador1.getPass()==0)
            {
            JOptionPane.showMessageDialog(null, this.jogador1.getNome() + ", é a sua vez, aperte ok para jogar o dado.");
            this.face = dado.getFace();
            JOptionPane.showMessageDialog(null, "Dado = " + Integer.toString(this.face));
            this.jogador1.setPosicao(this.jogador1.getPosicao()+face);
            JOptionPane.showMessageDialog(null, this.jogador1.getNome() + ", voce foi para a posição = " + Integer.toString(this.jogador1.getPosicao()));
            this.fim = this.acao.Acao(jogador1);
            this.Ganhou = this.jogador1.getNome();
            if(this.jogador1.getCRG()<=0)
            {
                this.jogador1.setJubilado(this.jogador1.getJubilado()+1);
                JOptionPane.showMessageDialog(null, this.jogador1.getNome() + ", você foi Jubilado");
                this.jogador1.setCRG(10);
            }
            if(this.jogador1.getJubilado()>3)
            {
                this.jogador1.setCahorro(true);
                JOptionPane.showMessageDialog(null, this.jogador1.getNome() + ", você virou um cachorro");
            }
            }
            else
            {
                this.jogador1.setPass(this.jogador1.getPass()-1);
            }
            JOptionPane.showMessageDialog(null, this.jogador1.getNome() + ", seu CRG é " + Integer.toString(this.jogador1.getCRG()));
        
            if(this.jogador2.getPass()==0)
            {
            JOptionPane.showMessageDialog(null, this.jogador2.getNome() + ", é a sua vez, aperte ok para jogar o dado.");
            this.face = dado.getFace();
            JOptionPane.showMessageDialog(null, "Dado = " + Integer.toString(this.face));
            this.jogador2.setPosicao(this.jogador2.getPosicao()+face);
            JOptionPane.showMessageDialog(null, this.jogador2.getNome() + ", voce foi para a posição = " + Integer.toString(this.jogador2.getPosicao()));
            this.fim = this.acao.Acao(jogador2);
            this.Ganhou = this.jogador2.getNome();
            if(this.jogador2.getCRG()<=0)
            {
                this.jogador2.setJubilado(this.jogador2.getJubilado()+1);
                JOptionPane.showMessageDialog(null, this.jogador2.getNome() + ", você foi Jubilado");
                this.jogador1.setCRG(10);
            }
            if(this.jogador2.getJubilado()>3)
            {
                this.jogador2.setCahorro(true);
                JOptionPane.showMessageDialog(null, this.jogador2.getNome() + ", você virou um cachorro");
            }
            }
            else
            {
                this.jogador2.setPass(this.jogador1.getPass()-1);
            }
            JOptionPane.showMessageDialog(null, this.jogador2.getNome() + ", seu CRG é " + Integer.toString(this.jogador2.getCRG()));
            
            if(this.jogador3.getPass()==0)
            {
            JOptionPane.showMessageDialog(null, this.jogador3.getNome() + ", é a sua vez, aperte ok para jogar o dado.");
            this.face = dado.getFace();
            JOptionPane.showMessageDialog(null, "Dado = " + Integer.toString(this.face));
            this.jogador3.setPosicao(this.jogador3.getPosicao()+face);
            JOptionPane.showMessageDialog(null, this.jogador3.getNome() + ", voce foi para a posição = " + Integer.toString(this.jogador3.getPosicao()));
            this.fim = this.acao.Acao(jogador3);
            this.Ganhou = this.jogador3.getNome();
            if(this.jogador3.getCRG()<=0)
            {
                this.jogador3.setJubilado(this.jogador3.getJubilado()+1);
                JOptionPane.showMessageDialog(null, this.jogador3.getNome() + ", você foi Jubilado");
                this.jogador1.setCRG(10);
            }
            if(this.jogador3.getJubilado()>3)
            {
                this.jogador3.setCahorro(true);
                JOptionPane.showMessageDialog(null, this.jogador3.getNome() + ", você virou um cachorro");
            }
            }
            else
            {
                this.jogador3.setPass(this.jogador1.getPass()-1);
            }
            JOptionPane.showMessageDialog(null, this.jogador3.getNome() + ", seu CRG é " + Integer.toString(this.jogador3.getCRG()));
            
            if(this.jogador4.getPass()==0)
            {
            JOptionPane.showMessageDialog(null, this.jogador4.getNome() + ", é a sua vez, aperte ok para jogar o dado.");
            this.face = dado.getFace();
            JOptionPane.showMessageDialog(null, "Dado = " + Integer.toString(this.face));
            this.jogador4.setPosicao(this.jogador4.getPosicao()+face);
            JOptionPane.showMessageDialog(null, this.jogador4.getNome() + ", voce foi para a posição = " + Integer.toString(this.jogador4.getPosicao()));
            this.fim = this.acao.Acao(jogador4);
            this.Ganhou = this.jogador4.getNome();
            if(this.jogador4.getCRG()<=0)
            {
                this.jogador4.setJubilado(this.jogador4.getJubilado()+1);
                JOptionPane.showMessageDialog(null, this.jogador4.getNome() + ", você foi Jubilado");
                this.jogador1.setCRG(10);
            }
            if(this.jogador4.getJubilado()>3)
            {
                this.jogador4.setCahorro(true);
                JOptionPane.showMessageDialog(null, this.jogador4.getNome() + ", você virou um cachorro");
            }
            }
            else
            {
                this.jogador4.setPass(this.jogador1.getPass()-1);
            }
            JOptionPane.showMessageDialog(null, this.jogador4.getNome() + ", seu CRG é " + Integer.toString(this.jogador4.getCRG()));
        }
        
            JOptionPane.showMessageDialog(null, this.Ganhou + "é o vencedor");
        
       
        
    }
}
