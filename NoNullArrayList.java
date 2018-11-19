package arraylist;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class NoNullArrayList<E> extends ArrayList<E>{
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }
  public NoNullArrayList(){
    super();
  }
  public boolean add(E e){
    if(e==null){
      throw new IllegalArgumentException();}
    return super.add(e);

  }
  public void add(int index, E element){
    if(element==null){
      throw new IllegalArgumentException();}
    super.add(index,element);
  }
  public E  set(int index, E element){
    if (element==null){
      throw new IllegalArgumentException();}
      return super.set(index,element);
  }
}
