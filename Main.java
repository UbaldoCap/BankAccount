public class Main {
    public static void main(String[] args) {
        //ContoBancario conto1 = new ContoBancario("IT19388", 2000);
        //ContoBancario conto2 = new ContoBancario("IT19879", 200);
        //ContoBancario conto3 = new ContoBancario("IT14823", 1500);
        //ContoBancario conto4 = new ContoBancario("IT98754", 75);
        Banca banca = new Banca("BNP", new ContoBancario[] {}, 3);
        banca.aggiungiConto(new ContoBancario("IT19388", 2000));
        banca.aggiungiConto(new ContoBancario("IT19879", 200));
        banca.aggiungiConto(new ContoBancario("IT14823", 1500));
        banca.aggiungiConto(new ContoBancario("IT98754", 75));
        banca.visualizzaInformazioneConti();
        banca.saldoTotale();
    }
}
