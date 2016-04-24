
package jogo.ufpa;
import java.util.Random;
import javax.swing.JOptionPane;

public class SorteRevez 
{   
    private int Numero;
    private int CRG;
    private boolean Pess;
    private Jogador Jogador;
    
    public void SorteRevez(Jogador jogador) 
    {
        this.Jogador = jogador;
        Random gerador = new Random();
        this.Numero= 1+gerador.nextInt(20);
        
        switch (this.Numero)
        {
            case 1:
            {
                Jogador.setPosicao(5); //Substituir por numera da delagacia.
                Jogador.lessCRG(2);
                JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você foi assaltado na Parimetral, vá para a delagacia e perca -2 no seu CRG");
                break;
            }
            case 2:
            {
               Jogador.setPosicao(5); //Substituir por numera da delagacia.
               Jogador.lessCRG(2);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você foi assaltado no banheiro, vá para a delagacia e perca -2 no seu CRG");
                break;
            }
            case 3:
            {
                Jogador.addCRG(2);
                JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você achou um ticket do RU e suas energias foram recarregadas, ganhe +2 no seu CRG");
                break;
            }
            case 4:
            {
               Jogador.setPass(1);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", o Curuçambá passou lotado e você ficou, fique uma rodada sem jogar.");
               break;
            }
            case 5:
            {
               Jogador.setPass(1);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você assistiu uma aula de Álgebra Linear e dormiu, fique uma rodada sem jogar.");
               break;
            }
            case 6:
            {
               Jogador.lessCRG(1);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você esqueceu de colocar o botão no LED, perca -1 no seu CRG");
               break;
            }
            case 7:
            {
               Jogador.addCRG(1);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você pegou um Pratinha vazio, ganhe +1 no seu CRG.");
               break;
            }
            case 8:
            {
               Jogador.addCRG(2);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você achou um livro do Halliday 8ª edição na biblioteca, ganhe +2 no seu CRG.");
               break;
            }
            case 9:
            {
               Jogador.lessCRG(3);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", o Governo cortou gastos na educação, perca -3 no seu CRG.");
               break;
            }
            case 10:
            {
               Jogador.addCRG(1);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você ganhou um chopp da biblioteca, ganhe +1 no seu CRG.");
               break;
            }
               case 11:
            {
               Jogador.lessCRG(2);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você fez uma prova de Variaveis Complexas, perca -2 no seu CRG.");
               break;
            }
            case 12:
            {
               Jogador.setPass(1);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", tia Daisy não abriu a sala, fique uma rodada sem jogar.");
               break;
            }
            case 13:
            {
               Jogador.lessCRG(2);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você perdeu seu pen drive com “Aquele trabalho”, perca -2 no seu CRG.");
               break;
            }
            case 14:
            {
               Jogador.addCRG(2);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", tia Daisy achou seu pen drive e guardou, ganhe +2 no seu CRG.");
               break;
            }
            case 15:
            {
               Jogador.lessCRG(10);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você perdeu o jogo, perca -10 no seu CRG.");
               break;
            }
            case 16:
            {
               Jogador.addCRG(gerador.nextInt(10));
               JOptionPane.showMessageDialog(null,"Jequiti");
               break;
            }
            case 17:
            {
               Jogador.addCRG(1);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você chegou cedo na aula de Estrutura de Dados, ganhe +1 no seu CRG.");
               break;
            }
            case 18:
            {
               Jogador.setPosicao(Jogador.getPosicao()+3);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você pegou o Circular, avance três casas.");
               break;
            }
            case 19:
            {
               Jogador.addCRG(2);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você encontrou um bebedouro com água potável, ganhe +2 no seu CRG.");
               break;
            }
            case 20:
            {
               Jogador.addCRG(2);
               JOptionPane.showMessageDialog(null, Jogador.getNome() + ", você ganhou uma tapioquinha, ganhe +2 no seu CRG.");
               break;
            }
              
        }
    }
}
