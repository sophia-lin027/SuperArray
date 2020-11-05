public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    size = 0;
    data = new String[10];
  }

  public int size() {
    return size;
  }

  public boolean add (String element) {
    if (size == data.length) {
      resize();
    }
    data [size] = element;
    size++;
    return true;
  }

  public String get (int index) {
    return data[index];
  }

  public String set (int index, String element) {
    String x = data[index];
    data [index] = element;
    return x;
  }

  private void resize() {
    String[] words = new String[data.length + 10];
    for (int i = 0; i < data.length; i++) {
      words[i] = data[i];
    }
    data = words;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    size = 0;
    data = new String[10];
  }

  public String toString() {
    String result = "[" + data[0];
    for (int i = 1; i < data.length; i++) {
      if (data[i] != null) {
        result = result + ", " + data[i];
      }
    }
    return result + "]";
  }

  public boolean contains(String s){
    for (int i = 0; i < data.length; i++) {
      if (data[i].equals(s)) {
        return true;
      }
      else {
        return false;
      }
    }
    return false;
  }

  public SuperArray (int initalCapacity) {
    size = 0;
    data = new String[initalCapacity];
  }

  public void add (int index, String element) {
    for (int i = size; i > index; i--) {
      data[i] = data[i - 1];
    }
    data[index] = element;
    size++;
  }

  public String remove (int index) {
    String x = data[index];
    for (int i = index; i < data.length - 1; i++) {
      data[i] = data[i + 1];
    }
    size++;
    return x;
  }

  public int indexOf (String s) {
    int result = 0;
    for (int i = 0; i < size; i++) {
      if (data[i] == s) {
        return i;
      }
    }
    return -1;
  }
}
