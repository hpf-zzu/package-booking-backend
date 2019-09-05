package tws.entity;

public class Purchase {
    private String purchaseNumber;
    private String purchaseState;
    private String recipient;
    private String phoneNumber;
    private String bookTime;

    public Purchase() {
    }

    public Purchase(String purchaseNumber, String purchaseState, String recipient, String phoneNumber, String bookTime) {
        this.purchaseNumber = purchaseNumber;
        this.purchaseState = purchaseState;
        this.recipient = recipient;
        this.phoneNumber = phoneNumber;
        this.bookTime = bookTime;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public String getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(String purchaseState) {
        this.purchaseState = purchaseState;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBookTime() {
        return bookTime;
    }

    public void setBookTime(String bookTime) {
        this.bookTime = bookTime;
    }
}

