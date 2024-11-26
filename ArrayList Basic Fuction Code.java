import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> degree = new ArrayList<String>();
        degree.add("JSC");
        degree.add("SSC");
        degree.add("HSC");
        degree.add("BSC");
        System.out.println("\n");
        System.out.println(degree+"\n");

        degree.add(0, "PSC");
        System.out.println(degree+"\n");
        System.out.println(degree.get(2)+"\n");

        degree.set(0, "KGS");
        System.out.println(degree+"\n");

        degree.remove(0);
        System.out.println(degree+"\n");

        degree.add(0, "PSC");
        System.out.println(degree+"\n");

        degree.add(0, "KGS");
        System.out.println(degree+"\n");

        degree.clear();
        System.out.println(degree+"\n");

        degree.add("JSC");
        degree.add("SSC");
        degree.add("HSC");
        degree.add("BSC");
        System.out.println(degree+"\n");
        System.out.println(degree.size()+"\n");

        for(int i=0;i<degree.size();i++){
            System.out.println(degree.get(i));
        }
        System.out.println("\n");

        for(String i: degree){
        System.out.println(i);
    }
        System.out.println("\n");
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(40);
        System.out.println(myNumbers+"\n");
        for (int i : myNumbers) {
            System.out.println(i);
        }
        System.out.println("\n");

        Collections.sort(degree);
        for(String i: degree){
            System.out.println(i);
        }
        System.out.println("\n");

        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
