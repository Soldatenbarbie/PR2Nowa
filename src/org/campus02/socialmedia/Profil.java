package org.campus02.socialmedia;

public class Profil {

    private String userName;
    private String photoPath;
    private int alter;
    private String mobileNumber;
    private double weight;
    private Profil bestFriend;

    public Profil(String userName, String photoPath,
                  int alter, String mobileNumber, double weight) {
        this.userName = userName;
        this.photoPath = photoPath;
        this.alter = alter;
        this.mobileNumber = mobileNumber;
        this.weight = weight;
    }

    public void setBestFriend(Profil bestFriend) {
        this.bestFriend = bestFriend;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public int getAlter() {
        return alter;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public double getWeight() {
        return weight;
    }

    public Profil getBestFriend() {
        return bestFriend;
    }

    @Override
    public String toString() {
        return "Profil{" +
                "userName='" + userName + '\'' +
                ", photoPath='" + photoPath + '\'' +
                ", alter=" + alter +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", weight=" + weight +
                ", bestFriend=" + bestFriend.userName +
                '}';
    }
}
