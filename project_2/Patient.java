// I-Hsuan Hu
// I pledge my honor that I have abided by the Stevens Honor System.
public class Patient {
    private String id;
    private int age;
    private BloodData bloodData;
    public Patient() {
        id = "0";
        age = 0;
        bloodData = new BloodData();
    }
    public Patient (String id, int age, String bType, String rhFactor){
        this.id = id;
        this.age = age;
        bloodData = new BloodData(bType, rhFactor);
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public BloodData getBloodData() {
        return bloodData;
    }
    public void setBloodData(BloodData b) {
        bloodData = b;
    }
}
