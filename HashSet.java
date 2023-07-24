/*Разработать программу, имитирующую поведение коллекции HashSet. 
В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества 
*и метод позволяющий читать элементы по индексу.
*Реализовать все методы из семинара.
Формат данных Integer.*/
//import java.util.HashSet;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

  public class HashSet{
    Integer[] elements = new Integer[10];
    public static void main(String[] args) {
      
      HashSet set = new HashSet();
      set.add(10);
      set.add(2);
      set.add(4);
      set.add(6);
      System.out.println(set.toString());
      System.out.println(set.get(0));
    }

  public void add (Integer elements) {
    for (int i = 0; i < elements.length; i ++) {
      if (elements[i] == null) {
          elements[i] = elements;
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
    if (index > 0 && index < elements.length) {
      return elements[index];
    }
    return null;
  }
}


