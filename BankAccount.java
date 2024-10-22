public class BankAccount {
    private double saldo;

    public BankAccount(double saldoAwal){
        this.saldo = saldoAwal;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setor(double jumlah){
        if (jumlah > 0){
            saldo += jumlah;
        } else {
            System.out.println("Jumlah setor harus positif.");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo){
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak cukup atau jumlah tidak valid.");
        }
    }
}
