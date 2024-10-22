public class Customer {
    private String nama;
    private BankAccount akun;

    public Customer(String nama, double saldoAwal){
        this.nama = nama;
        this.akun = new BankAccount(saldoAwal);
    }

    public String getNama(){
        return nama;
    }

    public double getSaldoAkun(){
        return akun.getSaldo();
    }

    public void setorKeAkun(double jumlah){
        akun.setor(jumlah);
        System.out.println("Setoran berhasil. Saldo baru: " + akun.getSaldo());
    }

    public void tarikDariAkun(double jumlah){
        akun.tarik(jumlah);
        System.out.println("Penarikan berhasil. Saldo baru: " + akun.getSaldo());
    }

    // Entry point dari program
    public static void main(String[] args){
        Customer customer = new Customer("John Doe", 1000.0);

        System.out.println("Saldo Awal: " + customer.getSaldoAkun());

        customer.setorKeAkun(500.0);
        customer.tarikDariAkun(200.0);
    }
}
