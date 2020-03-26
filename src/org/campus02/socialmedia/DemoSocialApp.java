package org.campus02.socialmedia;

public class DemoSocialApp {
    public static void main(String[] args) {

        Profil susi = new Profil("susi@test.com",
                "test.com/susi.png", 38, "004366412345678"
                ,62.8 );

        Profil max = new Profil("max@gmx.net", "max.com/max.jpg",
                42, "00436768822111", 70.5);

        Profil john = new Profil("john@john.net", "john.net/photo.png",
                    48, "0015511773311", 88.7);

        susi.setBestFriend(max);
        max.setBestFriend(susi);
        john.setBestFriend(susi);

        System.out.println("susi.toString() = " + susi.toString());
        System.out.println("max.toString() = " + max.toString());
        System.out.println("john.toString() = " + john.toString());

    }
}
