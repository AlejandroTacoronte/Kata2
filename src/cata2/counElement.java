package cata2;

import java.util.HashMap;

public class counElement {
    private int[] element;
    HashMap<Integer,Integer> histogram;
    
    public counElement(int[] element)
    {
        this.element=element;
        histogram= new HashMap<>();
        completeHistogram();
    }

    public int[] getNumber() {
        return element;
    }
    
    public int getFrecuency(int number)
    {
        if(!histogram.containsKey(number))
                return 0;
        else
                return histogram.get(number);
    }

    public HashMap<Integer, Integer> getHistogram() {
        return histogram;
    }

    public void setElement(int[] element) {
        this.element = element;
        histogram=new HashMap<>();
        completeHistogram();
    }
    
    public void completeHistogram()
    {
        for (int i : element) {
            histogram.put(i,getFrecuency(i)+1);
        }
    }
    
    public void count()
    {
        int counted=0;
        int max=0;
        
        for (int i : histogram.keySet()) {
            if(histogram.get(i)>counted)
            {
                counted=histogram.get(i);
                max=i;
            }
        }
        System.out.print("El número que más veces aparece es: " + max);
        System.out.println(" y aparece " + counted + " veces");
    }
}
