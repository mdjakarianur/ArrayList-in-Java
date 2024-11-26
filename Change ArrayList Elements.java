import java.util.ArrayList;

class Main {
  public static void main(String[] args){
    ArrayList<String> languages = new ArrayList<>();
    languages.add("C");
    languages.add("C++");
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("TypeScript");
    languages.add("C#");
    languages.add("PHP");
    System.out.println("ArrayList of Programming Language: "+"\n" + languages);
    languages.set(1,"R");
    System.out.println("Update ArrayList of Programming Language: "+"\n" + languages);
  }
}
