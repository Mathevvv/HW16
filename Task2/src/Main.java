import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String word = "Apollo 12 (November 14–24, 1969) was the second crewed landing on the Moon. The sixth crewed mission in the U.S. Apollo program, it was launched by NASA from the Kennedy Space Center, Florida. Commander Charles \"Pete\" Conrad and Lunar Module Pilot Alan L. Bean walked on the Moon while Command Module Pilot Richard Gordon remained in orbit. Launched on a rainy day, Apollo 12 was twice struck by lightning; the outward journey otherwise saw few problems. On November 19, Conrad and Bean landed close to the Surveyor 3 probe. This meant NASA could plan future missions expecting a landing close to target. Conrad and Bean carried a group of nuclear-powered instruments, and the first color television camera taken by an Apollo mission to the surface, but the picture was lost after Bean accidentally pointed the camera at the Sun and its sensor burned out. They visited Surveyor 3 and removed parts for return to Earth. The Apollo 12 mission safely returned to Earth on November 24. ";
        inpuringOfWord(word);

    }

    static void inpuringOfWord(String word){
        word=(word.replaceAll("[.,]", "")).trim();


        String[] wordArr = word.split("\\s");

        for (int i = 0; i < wordArr.length; i++) {
            if (wordArr[i].equals(" ")) continue;
            System.out.println(wordArr[i]);
        }








//        int j=0;
//        for (int i = 0 ; i < word.length() ; i++) {
//            if (word.charAt(i)==' ') {
//                System.out.println(word.substring(j, i).trim());
//                j=i;
//            }
//
//        }


    }

}