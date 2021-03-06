import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {

    for(int out = 0; out< list.length -1 ; out++){
      for(int in = 0; in < list.length - out - 1; in++ ){
        if(list[in] > list[in + 1]){
          int something = list[in]; 
          list[in] = list[in + 1];
          list[in + 1] = something; 

        }
      }
    }
     
  }

  public void selectionSort(int[] list)
  {   int flag, something; 
    for(int out = 0; out < list.length - 1; out++){
      flag = out; 
      for(int in = out + 1; in < list.length; in++){
        if(list[flag] > list[in]){
          flag = in; 
        }
        
      }
        something = list[out]; 
        list[out] = list[flag];
        flag = something; 
    }
    
  }

  public void insertionSort(int[] list)
  {   
    for(int out = 1; out < list.length; out++){
      int position = out; 
      int important = list[position];
      while(position > 0 && list[position -1] > important){
        list[position] = list[position -1]; 
        position--; 
      }
      list[position] = important; 
    }
    
  }

  private void merge(int[] a, int first, int mid, int last)
  { int something = a.length;
    int [] special = new int[something];
    int onepos = first; 
    int twopos = mid + 1;
    
    for(int i = first; i <= last; i++){
      if(onepos > mid){
        special[i] = a[twopos];
        twopos++;
      }
      else if(twopos > last){
        special[i] = a[onepos];
        onepos++;
      }
      else if(a[onepos] < a[twopos]){
        special[i] = a[onepos];
        onepos++;
      }
      else if(a[onepos] > a[twopos]){
        special[i] = a[twopos]; 
        twopos++; 
      }
      
    }
    for(int j = first; j <=last; j++){
        a[j] = special[j];
    }
    
  }

  public void mergeSort(int[] a, int first, int last)
  {   
     int mid = (first + last)/2;
     if(first < last){
      mergeSort(a, first, mid);
      mergeSort(a, mid + 1, last);
     }
    merge(a, first, mid, last);
  }
}

