public class Main {

    public static void main(String[] args) {

        Naruto naruto = new Naruto("Naruto", 100);
        RockLee lee = new RockLee("Rock Lee", 100);

        naruto.adicionarJutsu("Rasengan", new Jutsu(30, 20));
        lee.adicionarJutsu("Chute Giratório", new Jutsu(25, 15));

        while (naruto.estaVivo() && lee.estaVivo()) {

            naruto.usarJutsu(lee);

            if (!lee.estaVivo()) {
                System.out.println("Rock Lee foi derrotado!");
                break;
            }

            lee.usarJutsu(naruto);

            if (!naruto.estaVivo()) {
                System.out.println("Naruto foi derrotado!");
                break;
            }

            System.out.println("------------------------");
        }
    }
}
