import java.util.Random;

public abstract class NinjaDeTaiJutsu extends Personagem implements Ninja {
    public NinjaDeTaiJutsu(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarJutsu(Ninja inimigo) {
        Jutsu jutsu = jutsus.values().iterator().next();

        if (!temChakra(jutsu.getConsumoDeChakra())) {
            System.out.println(nome + " Está sem chakra para atacar!");
            return;
        }

        gastarChakra(jutsu.getConsumoDeChakra());
        System.out.println(nome + " Usou Taijutsu causando " + jutsu.getDano() + " de dano!");
        inimigo.desviar(jutsu.getDano());
    }

    @Override
    public void desviar(int dano) {
        boolean conseguiuDesviar = new Random().nextInt(100) < 60;
        if (conseguiuDesviar) {
            System.out.println(nome + " Desviou do ataque com sucesso!");
        } else {
            receberDano(dano);
            System.out.println(nome + " Foi atingido e perdeu " + dano + " de vida!");
        }
    }
}
