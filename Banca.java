public class Banca {
    private String IBAN;
    private String nome;
    private int max;
    private Conto[] conti;// si inizializza nel costruttore
    private int attivi;
    private String radiceIban;

    public Banca (String nome, int max){
        this.conti=new Conto[max]
        this.nome=nome;
        this.max=max;
        IBAN="IT0000"+nome+"000";
    }

    public void aggiungiConto (String iban, String cf){
        if (attivi>=max){
            System.out.println("Raggiunto numero max di conti attivabili");
        }

        Conto[attivi]=new Conto(iban,cf);

    }






}
