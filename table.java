package HashTable;

import java.util.Random;

public class table
{
  private int[] table;
  private int n ;
  public table(int size)
  {
    Random gen = new Random();
    table = new int[size];
    n=-1;
  }

  public boolean search(int toFind)
  {
    for(int i=0;i<table.length;++i)
      if(table[i] == toFind)
        return true;
    return false;
  }

  public void insert(int value)
  {
    n++;
   table[n]=value ;
  }

  public void remove(int value)
  {int i =0 ;
      while (value != table[i] && i<n)
          i++;
        
    for (int j=i;j<n;i++)
        table[j]=table[j+1];
    n--;
  }
}
