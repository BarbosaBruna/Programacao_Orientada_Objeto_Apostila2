
public class Jogo {
    public static void main(String[] args) {
        Personagem cacador = new Personagem("Cacador", 10, 0, 0);
        Personagem soneca = new Personagem("Soneca", 2, 6, 4); 

        while(true){
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            soneca.cacar();
            soneca.comer();
            soneca.dormir();
            System.out.println("\n====================");
            // Thread.sleep(3000);
        }   
    }
    
}
