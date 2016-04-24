package jogo.ufpa;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Nelson 
{
    private static final String[] Oq1 = { "(28T^2+8).sec^2(16T^3+2)","(32T^2+17).cosec^2(4T^3+1)","(12T^2+1).sec^2(4T^3+1)","(12T^2+1).sin^2(4T^3+1)"}; //Alternativas da questão 1
    private static final String[] Oq2 = { "(28T^2+8).sec^2(16T^3+2)","(32T^2+17).cosec^2(4T^3+1)","(12T^2+1).sec^2(4T^3+1)","(12T^2+1).sin^2(4T^3+1)"}; //Alternativas da questão 2
    private static final String[] Oq3 = { "(28T^2+8).sec^2(16T^3+2)","(32T^2+17).cosec^2(4T^3+1)","(12T^2+1).sec^2(4T^3+1)","(12T^2+1).sin^2(4T^3+1)"}; //Alternativas da questão 3
    private static final String[] Oq4 = { "(28T^2+8).sec^2(16T^3+2)","(32T^2+17).cosec^2(4T^3+1)","(12T^2+1).sec^2(4T^3+1)","(12T^2+1).sin^2(4T^3+1)"}; //Alternativas da questão 4
    private static final String[] Oq5 = { "(28T^2+8).sec^2(16T^3+2)","(32T^2+17).cosec^2(4T^3+1)","(12T^2+1).sec^2(4T^3+1)","(12T^2+1).sin^2(4T^3+1)"}; //Alternativas da questão 5
    private static final String[] Oq6 = { "(28T^2+8).sec^2(16T^3+2)","(32T^2+17).cosec^2(4T^3+1)","(12T^2+1).sec^2(4T^3+1)","(12T^2+1).sin^2(4T^3+1)"}; //Alternativas da questão 6
    private String Cq1;
    private String Cq2;
    private String Cq3;
    private String Cq4;
    private String Cq5;
    private String Cq6;
    
    private int Numero;
    private int Posicao;
    private Jogador Jogador;
    private Random gerador = new Random();
    
     public void Nelson(Jogador jogador) 
    {
        this.Jogador = jogador;
        this.Posicao =Jogador.getPosicao();
        
        
        if(this.Posicao>19)
        {
            if(this.Posicao>49)
            {
                this.Numero= gerador.nextInt(2)+5;
            }
            else
            {
              this.Numero= gerador.nextInt(2)+3;  
            }
        }
        else
        {
            this.Numero= gerador.nextInt(2)+1;
        }
        
        switch (this.Numero)
        {
            case 1:
            {
              JFrame frame1 = new JFrame("Sr. Nelson");
              this.Cq1 = (String) JOptionPane.showInputDialog(frame1, 
              "Dada a função W = tg(4T^3+T), ache dW/dT. Dica, você está na cadeia!", //Questão 1
              "Sr. Nelson",
              JOptionPane.QUESTION_MESSAGE, 
              null, 
              Oq1, 
              Oq1[0]);
                 
                 if(this.Cq1 == "(12T^2+1).sec^2(4T^3+1)")  //Resposta certa da 1
                 {
                     JOptionPane.showMessageDialog(null,"Certo, +2 CRG");
                     Jogador.addCRG(2);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Errado, -2 CRG");
                     Jogador.lessCRG(2);
                 }
                break;  
            }
            
            case 2:
            {
              JFrame frame2 = new JFrame("Sr. Nelson");
              this.Cq2 = (String) JOptionPane.showInputDialog(frame2, 
              "Dada a função W = tg(4T^3+T), ache dW/dT. Dica, você está na cadeia!", //Questão 2
              "Sr. Nelson",
              JOptionPane.QUESTION_MESSAGE, 
              null, 
              Oq2, 
              Oq2[0]);
                 
                 if(this.Cq2 == "(12T^2+1).sec^2(4T^3+1)")  //Resposta certa da 2
                 {
                     JOptionPane.showMessageDialog(null,"Certo, +2 CRG");
                     Jogador.addCRG(2);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Errado, -2 CRG");
                     Jogador.lessCRG(2);
                 }
                break;   
            }
            
            case 3:
            {
              JFrame frame3 = new JFrame("Sr. Nelson");
              this.Cq1 = (String) JOptionPane.showInputDialog(frame3, 
              "Dada a função W = tg(4T^3+T), ache dW/dT. Dica, você está na cadeia!", //Questão 3
              "Sr. Nelson",
              JOptionPane.QUESTION_MESSAGE, 
              null, 
              Oq3, 
              Oq3[0]);
                 
                 if(this.Cq3 == "(12T^2+1).sec^2(4T^3+1)")  //Resposta certa da 3
                 {
                     JOptionPane.showMessageDialog(null,"Certo, +2 CRG");
                     Jogador.addCRG(2);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Errado, -2 CRG");
                     Jogador.lessCRG(2);
                 }
                break;    
            }
            
            case 4:
            {
              JFrame frame4 = new JFrame("Sr. Nelson");
              this.Cq4 = (String) JOptionPane.showInputDialog(frame4, 
              "Dada a função W = tg(4T^3+T), ache dW/dT. Dica, você está na cadeia!", //Questão 4
              "Sr. Nelson",
              JOptionPane.QUESTION_MESSAGE, 
              null, 
              Oq4, 
              Oq4[0]);
                 
                 if(this.Cq4 == "(12T^2+1).sec^2(4T^3+1)")  //Resposta certa da 4
                 {
                     JOptionPane.showMessageDialog(null,"Certo, +2 CRG");
                     Jogador.addCRG(2);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Errado, -2 CRG");
                     Jogador.lessCRG(2);
                 }
                break;    
            }
            
            case 5:
            {
             JFrame frame5 = new JFrame("Sr. Nelson");
              this.Cq5 = (String) JOptionPane.showInputDialog(frame5, 
              "Dada a função W = tg(4T^3+T), ache dW/dT. Dica, você está na cadeia!", //Questão 5
              "Sr. Nelson",
              JOptionPane.QUESTION_MESSAGE, 
              null, 
              Oq5, 
              Oq5[0]);
                 
                 if(this.Cq5 == "(12T^2+1).sec^2(4T^3+1)")  //Resposta certa da 5
                 {
                     JOptionPane.showMessageDialog(null,"Certo, +2 CRG");
                     Jogador.addCRG(2);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Errado, -2 CRG");
                     Jogador.lessCRG(2);
                 }
                break;     
            }
            
            case 6:
            {
              JFrame frame6 = new JFrame("Sr. Nelson");
              this.Cq1 = (String) JOptionPane.showInputDialog(frame6, 
              "Dada a função W = tg(4T^3+T), ache dW/dT. Dica, você está na cadeia!", //Questão 6
              "Sr. Nelson",
              JOptionPane.QUESTION_MESSAGE, 
              null, 
              Oq6, 
              Oq6[0]);
                 
                 if(this.Cq6 == "(12T^2+1).sec^2(4T^3+1)")  //Resposta certa da 6
                 {
                     JOptionPane.showMessageDialog(null,"Certo, +2 CRG");
                     Jogador.addCRG(2);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Errado, -2 CRG");
                     Jogador.lessCRG(2);
                 }
                break;    
            }
        }
    }    
}
