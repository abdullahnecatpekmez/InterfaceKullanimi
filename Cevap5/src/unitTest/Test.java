package unitTest;

import cvp5.*;

public class Test {

	 public static void main(String[] args) throws Exception  { 
		 ParameterDTO dto = new ParameterDTO();  
		 dto.setState(State.INSERT);  
		 dto.setParameterKey("Key");
		  dto.setParameterValue("Value");
		 dto.setId(1L);
		 
		 System.out.println(dto.getId());
		 System.out.println(dto.getParameterKey());
		System.out.println(dto.getParameterValue()); 
		System.out.println(dto.getState());
		
		 Operation insert = OperationFactory.getInstance(dto); 
		 insert.makeOperation(); 
		 dto.setState(State.UPDATE);
		 dto.setParameterValue("Value2");
		 Operation update = OperationFactory.getInstance(dto);
		 update.makeOperation(); 
		 
		 System.out.println(dto.getId());
		 System.out.println(dto.getParameterKey());
		System.out.println(dto.getParameterValue()); 
		System.out.println(dto.getState());
		
       dto.setState(State.DELETE); 
       Operation delete = OperationFactory.getInstance(dto);
       delete.makeOperation();
       
       System.out.println(dto.getId());
		 System.out.println(dto.getParameterKey());
		System.out.println(dto.getParameterValue()); 
		System.out.println(dto.getState());
	 }


}
