public class Tester {
  public static void main (String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i));
    }
    for (int i = 0; i < 10; i++) {
      words.add("again");
    }
    for (int i = 0; i < words.size(); i++) {
      if (!words.get(i).equals("again")) {
        System.out.println("hm");
      }
      System.out.println(words.get(i));
    }
  }
}
