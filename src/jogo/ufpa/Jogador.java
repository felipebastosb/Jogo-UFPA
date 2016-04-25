
package jogo.ufpa;

public class Jogador 
{
    private String Nome;  //Nick name do jogador.
    private int numero;   //Para orndem das rodadas.
    private int CRG = 20;      //Pontuação total.
    private int Jubilado; //Número de vezes que o CRG chegou em 0. 
    private int Pass; //Número de rodadas sem jogar.
    private int Posicao; //Posição no mapa.
    private boolean Cahorro = false; //Define se o jogador virou cahorro.

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCRG() {
        return CRG;
    }

    public void setCRG(int CRG) {
        this.CRG = CRG;
    }

    public int getJubilado() {
        return Jubilado;
    }

    public void setJubilado(int Jubilado) {
        this.Jubilado = Jubilado;
    }

    public int getPass() {
        return Pass;
    }

    public void setPass(int Pass) {
        this.Pass = Pass;
    }

    public int getPosicao() {
        return Posicao;
    }

    public void setPosicao(int Posicao) {
        this.Posicao = Posicao;
    }
    
    public void addCRG(int ganho) {
        this.setCRG(this.getCRG() + ganho);
    }
    
    public void lessCRG(int perda) {
        this.setCRG(this.getCRG() - perda);
    }

    public boolean isCahorro() {
        return Cahorro;
    }

    public void setCahorro(boolean Cahorro) {
        this.Cahorro = Cahorro;
    }
}
