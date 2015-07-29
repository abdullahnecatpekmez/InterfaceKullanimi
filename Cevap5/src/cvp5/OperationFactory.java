package cvp5;

public class OperationFactory implements Operation  {
	private static State state;
	private  static ParameterDTO pdto;
	//private PersistenceImpl persist;
	 
	private  PersistenceImpl persist=new PersistenceImpl();
	
	public static Operation getInstance(ParameterDTO dto){ 
		state=dto.getState();
         pdto=dto;
         
		
		
	 return new OperationFactory();	 
	}
	
		 
  public   void  makeOperation()
	  {
	  Logger.log(persist);
	  
	  }
   public  void doControl(){
	   
	   switch (state) {
	      case INSERT:
	      {  
	    	  persist.insert(pdto);
	             
	              break;
	         }
	      case DELETE:
	      {persist.delete(pdto);
	              break;
	      }
	      case UPDATE:
	      {
	              persist.findById(persist.key);
	              break;
	             
	      }                

		 
	 }
   }
}


