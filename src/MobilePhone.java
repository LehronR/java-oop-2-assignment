public class MobilePhone {
    // VARIABLES
    private String brand;
    private String model;
    private String operatingSystem;
    private String phoneNumber;
    private int storageCapacity;

    // CONSTRUCTOR
    public MobilePhone(String brand, String model, String phoneNumber, int storageCapacity) {
        setBrand(brand);
        setModel(model);
        setPhoneNumber(phoneNumber);
        setStorageCapacity(storageCapacity);
    }

    // SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // GETTERS
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    // METHODS
    public void makeCall(String phoneNumber) {
        System.out.println("We are calling " + phoneNumber + " from our " + brand + " " + model + " phone!");
    }
    public void installApp(String appName) {
        System.out.println("Installing " + appName + " on our " + brand + " " + model + " phone!");
    }
    public void displayInfo() {
        System.out.println(
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Storage Capacity: " + storageCapacity + "GB" + "\n"
        );

    }

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("Samsung", "Galaxy S21", "5005559823", 64);
        myPhone.makeCall("9997854217");
        myPhone.installApp("Udemy");
        myPhone.displayInfo();
    }
}
