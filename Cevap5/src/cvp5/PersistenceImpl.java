package cvp5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersistenceImpl {
	Long key;
	 Map<Long,ParameterDTO> parameters = new HashMap<Long,ParameterDTO>();
	    public void insert(ParameterDTO obj ){	    	
   		   parameters.put(key,obj);
	    }
	    
	    
	    
	    public void update(ParameterDTO obj){	    		
	    			 insert(obj);   		 
	  }
    	
	    
	    public void delete(ParameterDTO obj){ 
	    	 
	    	 
			 for (Map.Entry<Long, ParameterDTO> entry : parameters.entrySet())
		            	parameters.remove(obj);  		
		   
	    }
	    
	     public ParameterDTO findById(long id){        
	    	
	         for (Long key : parameters.keySet()) {
	             if(key.equals(id)){
	                return parameters.get(key);
	             }   
	         }
	         return null;
	     } 
}
	    
