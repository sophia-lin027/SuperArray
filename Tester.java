public class Tester {
  public static void main (String[] args) {
    SuperArray words = new SuperArray();
    SuperArray test = new SuperArray();
    SuperArray test1 = new SuperArray(5);
    //SuperArray test2 = new SuperArray(-2);

    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println(words.get(i));
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

    System.out.println(test.isEmpty());
    System.out.println(words.toString());
    System.out.println(words.contains("kani"));
    System.out.println(words.contains("hello"));

    test1.add("kani");
    test1.add("uni");
    test1.add("hi");
    for (int i = 0; i < test1.size(); i++) {
      System.out.println(test1.get(i));
    }

    System.out.println(words);
    words.add(1, "hi");
    //words.add(-1, "test");
    //words.add(20, "test");
    System.out.println(words);
    System.out.println(words.remove(0));
    System.out.println(words);
    System.out.println(words.indexOf("hey"));

    SuperArray work = new SuperArray();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= 4; j++) {
        work.add(Integer.toString(j));
      }
    }
    System.out.println(work.remove(19));
    System.out.println(work);

    System.out.println(words.lastIndexOf("uni"));
    System.out.println(test1);
    System.out.println(test1.get(2));
    //System.out.println(test1.get(-1));
    //System.out.println(test1.get(3));
  }
}
