
package jogo.ufpa;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Acao 
{
    private int Numero;
    private Jogador Jogador;
    private Random gerador = new Random();
    private static final String[] Cmuller = { "1","2","3","4","5","6","7","8","9","10" };
    private static final String[] Cadeia = { "(28T^2+8).sec^2(16T^3+2)","(32T^2+17).cosec^2(4T^3+1)","(12T^2+1).sec^2(4T^3+1)","(12T^2+1).sin^2(4T^3+1)"};
    private static final String[] Cvadi = { "1","2","3","4","5","6","7","8","9","10" };
    private boolean AddCRG = false;
    private boolean exit = false;
    private int chance;
    private int amuller;
    private String muller;
    private int imuller;
    private int avadi;
    private String vadi;
    private int ivadi;
    private String Ccadeia;
    private boolean Ganhou = false;
    private int Default;
    SorteRevez SorteRevez = new SorteRevez();
    Nelson Nelson = new Nelson();
    
    public boolean Acao(Jogador jogador)
    {
        this.Jogador = jogador;
        this.Numero = Jogador.getPosicao();
        
        switch (this.Numero)
        {
             case 1:
            {
                Jogador.setPass(1);
                Jogador.lessCRG(2);
                JOptionPane.showMessageDialog(null,"TERMINAL :Tiroteio no terminal, perca -2 no seu CRG e fique uma rodada sem jogar");
                break;
            }
             case 45:
            {
                Jogador.setPosicao(18);
                JOptionPane.showMessageDialog(null,"RU DO PROFISSIONAL: Problemas hidráulicos, volte para o RU do Básico");
                break;
            }
             case 16:
            {
                Jogador.setPass(2); 
                JOptionPane.showMessageDialog(null,"CIAC: A fila de espera está quilométrica, duas rodadas sem jogar");
                break;
            }
             case 44:
            {
                  
                  while (exit == false)
                  {
                    this.amuller = 1+gerador.nextInt(10);
                    JFrame frame = new JFrame("FCT");
                    this.muller = (String) JOptionPane.showInputDialog(frame, 
                    "Onde está o Müller? Você tem três tentativas",
                    "FCT",
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    Cmuller, 
                    Cmuller[0]);
                    this.imuller = Integer.parseInt(muller);
                    if (amuller == imuller)
                    {
                      this.AddCRG = true;
                      this.exit = true;
                    }
                    else
                    {
                      this.chance = this.chance +1;
                    }
                    if(this.chance>2)
                    {
                        this.exit = true;
                    }
                  }
                  
                  if(this.AddCRG == true)
                  {
                      Jogador.addCRG(3);
                  }
                  else
                  {
                      Jogador.lessCRG(3);
                  }
                  
                  this.chance = 0;
                  this.AddCRG = false;
                  this.exit = false;
                
                  break;
            }
             case 41:
            {
                Jogador.setPass(2); 
                JOptionPane.showMessageDialog(null,"AUDITÓRIO DO ICJ: Você esqueceu seu comprovante de residência, duas rodadas sem jogar");
                break;
            }
             case 46:
            {
                Jogador.setPass(2); 
                Jogador.lessCRG(5);
                JOptionPane.showMessageDialog(null,"SALA 01 DO BLOCO NOVO: Seus professores entraram em greve, -5 CRG, 2 rodadas sem jogar");
                break;
            }
             case 35:
            {
                Jogador.addCRG(1);
                JOptionPane.showMessageDialog(null,"BETINA: +1 CRG");
                break;
            }
             case 37:
            {
                JFrame frame2 = new JFrame("Delegacia");
                this.Ccadeia = (String) JOptionPane.showInputDialog(frame2, 
                "Dada a função W = tg(4T^3+T), ache dW/dT. Dica, você está na cadeia!",
                "Delegacia",
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                Cadeia, 
                Cadeia[0]);
                 
                 if(this.Ccadeia == "(12T^2+1).sec^2(4T^3+1)")
                 {
                     Jogador.addCRG(3);
                 }
                 else
                 {
                     Jogador.lessCRG(3);
                 }
                Jogador.setPass(2);
                JOptionPane.showMessageDialog(null,"DELEGACIA DO GUAMÁ: 2 rodadas sem jogar");
                break;
            }
             case 26:
            {
                Jogador.lessCRG(1);
                JOptionPane.showMessageDialog(null,"PGITEC - PROJETO NEWTON: você esqueceu de entregar a lista, perca -1 no seu CRG.");
                break;
            }
             case 47:
            {
                JOptionPane.showMessageDialog(null,"LEC: se seu CRG for maior que 5 avance três casas, se não volte três casas");
                if(jogador.getCRG()>5)
                {
                    jogador.setPosicao(Jogador.getPosicao()+3);
                }
                else  
                {
                    Jogador.setPosicao(Jogador.getPosicao()-3);
                }
                break;
            }
             case 48:
            { 
                Jogador.addCRG(1);
                JOptionPane.showMessageDialog(null,"VER-O-PESINHO: você ganhou um Italiano da Wal, +1 CRG.");
                break;
            }
             case 22:
            {
                Jogador.addCRG(3);
                JOptionPane.showMessageDialog(null,"BIBLIOTECA CENTRAL: +3 CRG");
                break;
            }
             case 11:
            {
                Jogador.addCRG(2);
                JOptionPane.showMessageDialog(null,"BIBLIOTECA DO ICEM: +1 CRG");
                break;
            }
             case 53:
            { 
                Jogador.lessCRG(2);
                JOptionPane.showMessageDialog(null,"BIBLIOTECA DO ITEC: Não está funcionando, -1 CRG");
                break;
            }
              case 18:
            {
                Jogador.setPass(1); 
                JOptionPane.showMessageDialog(null,"RU BÁSICO: Fila quilométrica. Uma rodada sem jogar.");
                break;
            }
               case 20:
            {
                Jogador.setPass(2); 
                Jogador.lessCRG(2);
                Jogador.setPosicao(35); 
                JOptionPane.showMessageDialog(null,"ORLA DA UFPA: Você caiu no Rio Guamá e foi arrastado pela correnteza. Encontraram seu corpo depois de duas rodadas. -2 CRG, volta para o Bettina");
                break;
            }
                case 24:
            {
                  while (exit == false)
                  {
                    this.avadi = 1+gerador.nextInt(10);
                    JFrame frame3 = new JFrame("Vadião");
                    this.vadi = (String) JOptionPane.showInputDialog(frame3, 
                    "Vaiii safadão!!! Ache o Leandro. Você tem três tentativas",
                    "Vadião",
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    Cvadi, 
                    Cvadi[0]);
                    this.ivadi = Integer.parseInt(vadi);
                    if (avadi == ivadi)
                    {
                      this.AddCRG = true;
                      this.exit = true;
                    }
                    else
                    {
                      this.chance = this.chance +1;
                    }
                    if(this.chance>2)
                    {
                        this.exit = true;
                    }
                  }
                  if(this.AddCRG == true)
                  {
                      JOptionPane.showMessageDialog(null,"Você achou o safadão, avance duas casas.");
                      Jogador.setPosicao(Jogador.getPosicao()+2);
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null,"Você não achou o safadão, volte três casas.");
                      Jogador.setPosicao(Jogador.getPosicao()-3);
                  }
                  this.chance = 0;
                  this.AddCRG = false;
                  this.exit = false;
                break;
            }
                 case 14:
            {
                Jogador.setPass(1); 
                Jogador.lessCRG(2);
                JOptionPane.showMessageDialog(null,"ICEM - LAB.01: Você passou em Estrutura de Dados com Exec, se seu CRG for maior que 5 avance três casas, se não volte três casas.");
                if(jogador.getCRG()>5)
                {
                    jogador.setPosicao(Jogador.getPosicao()+3);
                }
                else
                {
                    Jogador.setPosicao(Jogador.getPosicao()-3);
                }
                
                break;
            }
                case 59:
            {
                if(this.Jogador.isCahorro() == false)
                {
                JOptionPane.showMessageDialog(null,"HANGARZINHO - FORMATURA: Você ganhou o Jogo");
                this.Ganhou = true;
                }
                else
                {
                    this.Jogador.setPosicao(0);
                }
                break;
            }
                default:
                {
                    this.Default = 1+gerador.nextInt(3);
                    if (this.Default == 2)
                    {
                       SorteRevez.SorteRevez(this.Jogador); 
                    }
                    if(this.Default == 3)
                    {
                        Nelson.Nelson(this.Jogador);
                    }
                }
        }
        return this.Ganhou;
    }
    
}
