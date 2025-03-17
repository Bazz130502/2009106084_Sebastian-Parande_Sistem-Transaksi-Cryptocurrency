public class Transaction {
    private String transactionId;
    private String cryptoId;
    private double amount;
    private String type; // "Buy" or "Sell"

    public Transaction(String transactionId, String cryptoId, double amount, String type) {
        this.transactionId = transactionId;
        this.cryptoId = cryptoId;
        this.amount = amount;
        this.type = type;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCryptoId() {
        return cryptoId;
    }

    public void setCryptoId(String cryptoId) {
        this.cryptoId = cryptoId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", cryptoId='" + cryptoId + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}