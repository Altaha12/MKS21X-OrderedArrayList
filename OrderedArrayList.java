package arraylist;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class OrderedArrayList<E> extends NoNullArrayList<E>{
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }
  public OrderedArrayList(){
    super();
  }
  private int trueindex(String str){
    if(this.size()==0){
      return 0;
    }
    for(int i=0;i<this.size();i++){
      if(str.compareTo(this.get(i))>0){
        return i;
      }
    }
    return this.size();
  }
  public Boolean add(E e){
    super.add(this.trueindex(e),e);
    return true;
  }
  public void add(int index,E e){
    this.add(e);
  }
  public E set(int index, E e){
    E x = this.remove(index);
    this.add(e);
    return x;
  }
}
