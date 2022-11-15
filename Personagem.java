public class Personagem {
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    void cacar() {
        listar();
        if (energia >= 2) {
            System.out.println("\ncacando...");
            energia -= 2;
        } else {
            System.out.println("\nsem energia para cacar");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    } 

    void comer() {
        listar();
        if (fome >= 1) {
            System.out.println("\ncomendo...");
            energia = Math.min(energia + 1, 10);
            fome -= 1;
        } else {
            System.out.println("\nsem fome!");
        }
        
    }

    void dormir() {
        listar();
        if (sono >= 1) {
            System.out.println("\ndormindo...");
            sono -= 1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        } else {
            System.out.println("\nsem sono!");
        } 

    }

    public Personagem(int energia, int fome, int sono) {
        if (energia >= 0 && energia <= 10)
            this.energia = energia;
        if (fome >= 0 && fome <= 10)
            this.fome = fome;
        if (sono >= 0 && sono <= 10)
            this.sono = sono;
    }

    public Personagem(String nome, int energia, int fome, int sono) {
        this(energia, fome, sono);
        this.nome = nome;
    }

    void listar(){ 
        System.out.printf("Nome: " + nome + "\nEnergia: "+  energia + "\nFome: " + fome + "\nSono: "+  sono);
    }


}