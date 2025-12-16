import java.util.HashMap;
import java.util.Map;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int chakra = 100;

    protected Map<String, Jutsu> jutsus = new HashMap<>();

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void adicionarJutsu(String nomeDoJutsu, Jutsu jutsu) {
        jutsus.put(nomeDoJutsu, jutsu);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public boolean temChakra(int custo) {
        return chakra >= custo;
    }

    protected void gastarChakra(int valor) {
        chakra -= valor;
    }

    protected void receberDano(int dano) {
        vida -= dano;
    }
}