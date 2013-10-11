package cata2;

import java.util.HashMap;

public class counElement {
    private String[] element;
    HashMap<String,Integer> histogram;
    
    public counElement(String[] element)
    {
        this.element=element;
        histogram= new HashMap<>();
        completeHistogram();
    }

    public String[] getString() {
        return element;
    }
    
    public int getFrecuency(String compare)
    {
        if(!histogram.containsKey(compare))
                return 0;
        else
                return histogram.get(compare);
    }

    public HashMap<String, Integer> getHistogram() {
        return histogram;
    }

    public void setElement(String[] element) {
        this.element = element;
        histogram=new HashMap<>();
        completeHistogram();
    }
    
    public void completeHistogram()
    {
        for (String i : element) {
            histogram.put(i,getFrecuency(i)+1);
        }
    }
    
    public void count()
    {
        int counted=0;
        String max=null;
        
        for (String i : histogram.keySet()) {
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
