public static int mode(ArrayList<Integer> arr)
{   
    
        HashSet<Integer> uniquenumbers = new HashSet<Integer>(arr);
        // System.out.println(uniquenumbers);
        
        HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>(); 
        
        
         for (int value : uniquenumbers)
            hm.put(value, 0);
        
        //  System.out.println(hm);
        
        for(int i=0;i<=arr.size()-1; i++){
             hm.put(arr.get(i), hm.get(arr.get(i))+1);
        }
       
        //System.out.println(hm);
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
        
        //System.out.println("Mode is " + saved_key); 
        
        ArrayList<Integer> arr_keys = new ArrayList<Integer>();
        
        for(Map.Entry<Integer, Integer> set: hm.entrySet())
        {
            if(set.getValue() == saved_value) {
                arr_keys.add(set.getKey());
            }
            
        }
        
        //System.out.println("Mode is " + saved_key); 
        
        int first_occurance=0;
        
        for(int i =0;i<=arr.size()-1;i++){           
            if(arr_keys.contains(arr.get(i))){
                first_occurance = arr.get(i); 
                break;
            }
        }
        
        
    return first_occurance;
}
