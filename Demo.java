public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size(); i++) {
      if (i != s.indexOf(s.get(i))) {
        s.remove(i);
        i--;
      }
    }
  }

  public static SuperArray findOverlap (SuperArray a, SuperArray b) {
    SuperArray new_array = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) {
        new_array.add(a.get(i));
      }
    }
    removeDuplicates(new_array);
    return new_array;
  }

  public static SuperArray zip (SuperArray a, SuperArray b) {
    int maximum = Math.max(a.size(), b.size());
    int minimum = Math.min(a.size(), b.size());
    SuperArray new_array = new SuperArray();
    for (int i = 0; i < minimum; i++) {
      new_array.add(a.get(i));
      new_array.add(b.get(i));
    }
    if (a.size() != b.size()) {
      for (int i = minimum; i < maximum; i++) {
        if (a.size() > b.size()) {
          new_array.add(a.get(i));
        }
        else {
          new_array.add(b.get(i));
        }
      }
    }
    return new_array;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    SuperArray a = new SuperArray();
    // SuperArray b = new SuperArray();
    a.add("9");   a.add("1");     a.add("2");     a.add("2");
    // a.add("3");   a.add("4");
    // b.add("0");   b.add("4");     b.add("2");     b.add("2");
    // b.add("9");   b.add("0");     b.add("4");

    // System.out.println(words);
    // System.out.println(words);
    // System.out.println(a);
    // //System.out.println(b);
    // //System.out.println(findOverlap(a, b));
    // System.out.println(words.lastIndexOf("una"));

    SuperArray b = new SuperArray();
    b.add("2");   b.add("4");     b.add("2");     b.add("0");
    SuperArray c = new SuperArray();
    c.add("2");   c.add("4");     c.add("2");     c.add("0");
    System.out.println(c);
    System.out.println(b);
    System.out.println(c.equals(b));
    System.out.println(a);
    System.out.println(zip(a, b));
  }
}
