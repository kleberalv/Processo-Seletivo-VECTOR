package animais;

import java.util.Scanner;

/**
 *
 * @author Kleber Alves
 * Projeto de jogos de animais
 */
public class Animais {
    
    
    /**
    private Integer id;
    private String caracteristica;
    private String respostaSim;
    private String respostaNao;
    private Integer idPai;
    private Integer filhoDaResposta;
     * @return 
     */
   Scanner sc = new Scanner(System.in);
   
   private String nome;
   private String caracteristica;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Animais() {}

    public Animais(String nome, String caracteristica) {
        this.nome = nome;
        this.caracteristica = caracteristica;
    }

    public String NovoNome(){
    
        
    return this.nome;
    }
    
    
    @Override
    public String toString() {
        return "Animais{" + "nome=" + nome + ", caracteristica=" + caracteristica + '}';
    }
   
    
    
}
