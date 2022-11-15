
public class Jogo {
    public static void main(String[] args) {
        Personagem cacador = new Personagem("Cacador", 10, 0, 0);
        Personagem soneca = new Personagem("Soneca", 2, 6, 4); 
        Personagem hunter = new Personagem("Jose", 9, 2, 1);

        while(true){
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            System.out.println("\n====================");
            soneca.cacar();
            soneca.comer();
            soneca.dormir();
            System.out.println("\n====================");
            hunter.cacar();
            hunter.comer();
            hunter.dormir();
            System.out.println("\n====================");
           // Thread.sleep(3000);
        }   
    }
    
}
