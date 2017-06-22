/**
 * Created by VADVASX on 6/22/2017.
 */
import java.util.ArrayList;
public class Person {

    private String username;
    private String treatment;
    private String diagnosis;
    private String clinicaltrial;
    private String location;
    private int age;
    private String gender;
    private String hospital;
    private String description;
    private ArrayList favorites = new ArrayList();
    //private ArrayList chats = new ArrayList();

    public Person(String myUsername, String myLocation){

        this.username = myUsername;
        this.location = myLocation;

    }

    public void setTreatment(String myTreatment){
        this.treatment = myTreatment;
    }
    public void setDiagnosis(String myDiagnosis){
        this.diagnosis = myDiagnosis;
    }
    public void setClinicalTrial(String myClinicalTrial){
        this.clinicaltrial = myClinicalTrial;
    }
    public void setAge(int myAge){
        this.age = myAge;
    }
    public void setGender(String myGender){
        this.gender = myGender;
    }
    public void setHospital(String myHospital){
        this.hospital = myHospital;
    }
    public void setDescription (String myDescription) {
        this.description = myDescription;
    }
    public void addFavorites (Person favePerson) {
        this.favorites.add(favePerson);
    }
    /*public void addChats (Chats recentChat) {
        this.chats.add(recentChat);
    }*/

    public String getTreatment(){
        return this.treatment;
    }
    public String getDiagnosis() {
        return this.diagnosis;
    }
    public String getClinicalTrial(){
        return this.clinicaltrial;
    }
    public String getLocation(){
        return this.location;
    }
    public int getAge() {
        return this.age;
    }
    public String getGender () {
        return this.gender;
    }
    public String getHospital () {
        return this.hospital;
    }
    public String getDescription () {
        return this.description;
    }
    public ArrayList getFavorites () {
        return this.favorites;
    }
    //public Chats[] getChats () {
    // return this.chats;}

}
