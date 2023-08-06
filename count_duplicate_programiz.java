import java.util.ArrayList;
import java.util.*;  

class MyList {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
         ArrayList<Integer> arr = new ArrayList<Integer>(4);
 
     //   ArrayList<String> arr = new ArrayList<String>(4);
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(3);
        arr.add(1);
        
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(3);
        arr.add(3);
        System.out.println(arr);
        
        HashSet<Integer> uniquenumbers = new HashSet<Integer>(arr);
         System.out.println(uniquenumbers);
        
        HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>(); 
        
        // Iterator value = uniquenumbers.iterator();
        // while (value.hasNext()) {
        //   hm.put((Integer)value.next(), 0);
        // }
        
        for (int value : uniquenumbers)
            hm.put(value, 0);
        
         System.out.println(hm);
        
        for(int i=0;i<=arr.size()-1; i++){
            
             hm.put(arr.get(i), hm.get(arr.get(i))+1);
            
        }
       
        System.out.println(hm);
        
        
        //     for (Map.Entry<String, String> set :
        //      foodTable.entrySet()) {
 
        //     // Printing all elements of a Map
        //     System.out.println(set.getKey() + " = "
        //                       + set.getValue());
        // }
        
        // HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>(); 

        // int count =0 ;
        
        // for(Map.Entry<Integer, Integer> set: hm.entrySet())
        // {   
            
        //     System.out.println(set.getKey() + " = "  + set.getValue());
        //     if(set.getValue() > count)
        //     {   
        //         hm2.put(set.getKey() , set.getValue());
        //     //System.out.println(set.getKey() + " = " + set.getValue());
        //     }
        // }
        // System.out.println("I am last map" + hm2);
        
        int saved_key=0, saved_value=0;
        //boolean flag = true;
        for(Map.Entry<Integer, Integer> set: hm.entrySet())
        {
            
            // System.out.println(set.getKey() + " = "  + set.getValue());
            
            // if(flag){
            //     saved_value =  set.getValue();
            //     saved_key = set.getKey(); 
            //     flag = false;
            // }
            if(set.getValue() > saved_value){
                saved_value =  set.getValue();
                saved_key = set.getKey(); 
            }
            
        }
        
        System.out.println("Mode is " + saved_key);
        
                System.out.println("Mode is " + saved_key); 
        
        ArrayList<Integer> arr_keys = new ArrayList<Integer>();
        
        for(Map.Entry<Integer, Integer> set: hm.entrySet())
        {
            if(set.getValue() == saved_value) {
                arr_keys.add(set.getKey());
            }
            
        }
        
        System.out.println( arr_keys); 
        
        for(int i =0;i<=arr.size()-1;i++){
            if(arr_keys.contains(arr.get(i))){
                System.out.println(arr.get(i)); 
                break;
            }
        }
        
        
    }
}