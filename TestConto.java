public class TestConto {
    public static void main(String[] args) {

        Conto conto1=null;
        conto1= new Conto("00990","DGSFRC");

        System.out.println("Saldo "+ conto1.deposita(100));
        System.out.println(" "+conto1.preleva(101));
        System.out.println();


    }
}
