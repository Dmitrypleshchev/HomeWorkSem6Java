/*Разработать программу, имитирующую поведение коллекции HashSet. 
В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества 
*и метод позволяющий читать элементы по индексу.
*Реализовать все методы из семинара.
Формат данных Integer.*/

//import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.Set;

public class HashSet{
   private Integer[] elements = new Integer[10];
    public static void main(String[] args) {
      
      HashSet set = new HashSet();
      set.add(5);
      set.add(2);
      set.add(3);
      set.add(1);
      set.add(4);
      set.add(6);
      set.add(6);
      set.add(8);
      set.add(7);
      set.add(9);
      System.out.println(set.toString());
      System.out.println(set.get(0));
    }

  public void add (Integer element) {
    for (int i = 0; i < elements.length; i ++) {
      if (elements[i] == null) {
          elements[i] = element;
        break;
      }
    }
  }

  public String toString(){
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < elements.length; i++) {
      if (elements[i] != null) {
        result.append(elements[i]).append(",");
      }
    } 
      if (result.length() > 0) {
        result.setLength(result.length() - 1);
      }
      return "{" + result.toString() + "}";
  }

  public Integer get(int index) {
    if (index >= 0 && index < elements.length) {
      return elements[index];
    }
    return null;
  
    }
  }


