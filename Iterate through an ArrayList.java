import java.util.ArrayList;

class Main {
  public static void main(String[] args){
    ArrayList<String> languages = new ArrayList<>();
    languages.add("C");
    languages.add("C++");
    languages.add("C#");
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("TypeScript");
    languages.add("PHP");
    languages.add("Python");
    System.out.println("ArrayList of Programming Language: "+"\n" + languages);
    
    System.out.println("Iterate through an ArrayList: "+"\n");
    for(String i: languages){
        System.out.println(i);
    }
  }
}
