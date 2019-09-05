package tws.entity;

public class Package {
    private String purchaseNumber;
    private String recipient;
    private String phoneNumber;
    private String weight;

    public Package() {
    }

    public Package(String purchaseNumber, String recipient, String phoneNumber, String weight) {
        this.purchaseNumber = purchaseNumber;
        this.recipient = recipient;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}




