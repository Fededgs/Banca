public class Conto{
    public Conto(String iban,String cf){
        this.cf=cf;
        this.iban=iban;
    }
    private String iban;
    private double  saldo;
    private String cf;

    public boolean preleva(double qta ) {
        double diff=this.saldo-qta;
        if (diff>=0){
            this.saldo=diff;
            return true;
        }
        else return false;
    }

    public boolean deposita(double qta){
        if (qta>=0){
            this.saldo+=qta;
            return true;
        }
        else return false;

    }

}
