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
    String result = "[";
    for (int i = 0; i < size; i++) {
      if (data[i] != null) {
        if (i != size - 1) {
          result = result + data[i] + ", ";
        }
        else {
          result = result + data[i];
        }
      }
    }
    return result + "]";
  }

  public boolean contains(String s){
    for (int i = 0; i < size; i++) {
      if (s.equals(data[i])) {
        return true;
      }
    }
    return false;
  }

  public SuperArray (int initialCapacity) {
    if (initialCapacity < 0.0) {
      throw new IllegalArgumentException("The initial capacity " + initialCapacity + " cannot be negative");
    }
    size = 0;
    data = new String[initialCapacity];
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

    for (int i = index; i < size() - 1; i++) {
      data[i] = data[i + 1];
    }
    //data[size() - 1] = null;
    size--;
    return x;
  }

  public int indexOf (String s) {
    for (int i = 0; i < size; i++) {
      if (s.equals(data[i])) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] safe = new String[size];
    for (int i = 0; i < size; i++) {
      safe[i] = data[i];
    }
    return safe;
  }

  public int lastIndexOf(String value) {
    for (int i = size - 1; i >= 0; i--) {
      if (value.equals(data[i])) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other){
    if (other.size() != size) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (!other.get(i).equals(data[i])) {
        return false;
      }
    }
    return true;
  }
}
