
import java.util.*;




public class Main {
  
   public static void main(String args[]){

	     int num;
	   String name,pt,em;
      Scanner sc=new Scanner(System.in);
       
        List<Project> den=new ArrayList<Project>();
        Iterator<Project> zen=den.iterator();
     
      char f='F';
      
      do{
      
       
       System.out.println("F.For Add");
              System.out.println("E.For View");
                System.out.println("D.For Edit");
                  System.out.println("C.For Delete");
                    System.out.println("B.For Report");
                    System.out.println("A. For Exit");
                   
      System.out.print("Please Enter :");
      f=sc.next().charAt(0);
      
      switch(Character.toUpperCase(f)){
         
      
      case 'A':
    	  System.out.println("Thank You This Program Is Exiting!!!!!!!!!!!!");
    	
    	  break;
          
      
          case 'D':
       System.out.println("------------------------------------------");
              zen=den.iterator();
              
              boolean code=false;
              
           
              ListIterator<Project> de=den.listIterator();
		    	
              System.out.print("Please Enter The Name of the Device To Update :");
              name=sc.next();
		    	
		    	while(de.hasNext()) {
		    		Project k=de.next();
		    		if(k.Names().equalsIgnoreCase(name)) {
		    			
		    			System.out.print("Enter Barcode :");
            	        num =sc.nextInt();
            	        System.out.println();
            	        System.out.print("Enter New Name Application :");
            	        name=sc.next();
            	        System.out.println();
            	        System.out.print("Enter New Peripheral Type : ");
            	       	pt=sc.next();
          	        	System.out.println();
           // 	      sc.nextLine();
            	       System.out.print("Enter New Employee Name : ");
            	        em=sc.next();			
	        			  
	        			de.set(new Project(num,name,pt,em));
	        			  code=true;
	        			  
		    		}
		    		
		    		
		    	}
		    			 
		    	System.out.println("================================================");	
		    			 
		    			  if(!code) {
		   				   System.out.println("Please Try Again!!1");
		   			   }else {
		   				   System.out.println("Update Successfuly!!!!!!");	
		   				System.out.println("================================================");	
					 
		 }
				 
				   
   
            
              break;
              
          case 'F':
      System.out.print("Enter Barcode :");
        num =sc.nextInt();
        System.out.print("Enter Name Application :");
        name=sc.next();
       System.out.print("Enter Peripheral Type  :");
      pt=sc.nextLine();
      sc.nextLine();
       System.out.print("Enter Employee Name :");
        em=sc.nextLine();
      
        den.add(new Project(num,name,pt,em));
        
       
              break;
          case 'E':
        	   
        	  
        	  
                     System.out.println("======================================================");       
            	zen=den.iterator();	 
                	  while(zen.hasNext()) {
                		  System.out.println("-----------------------------------------------------");
                		  System.out.println(zen.next().Present());
                		  System.out.println("-----------------------------------------------------");
                		  System.out.println("======================================================");    
                	  }
                	  
                	 
              break;
          case 'C':
         
        	  System.out.print("Enter Barcode :  ");
	    	   num=sc.nextInt();
	    	    code=false;
	    	   zen=den.iterator();
	    	   
	    	   while(zen.hasNext()) {
	    		   Project e=zen.next();
	    		  
	    		   if(e.Number()==num) {
	    			   zen.remove();
	    			   code = true;   
	    		   }
	    	   }
	    	   System.out.println("------------------------------------------------");	
	    	   if(!code)System.out.println("Try Again");
	              else System.out.println(" Deleted Successfully..!");
	    	   System.out.println("-------------------------------------------------");	
        	  
        	  
               
              break;
              
          case 'B':
              System.out.println("---------------------------------------------------------");
        while(zen.hasNext()) {
        	System.out.println(zen.next().Present());
        }
                        
              
    
              
        
              System.out.println("---------------------------------------------------------");
              break;
              
         
          default:
              System.out.println("---------------------------------------------------------");
              System.out.println("Maybe You Enter a Wrong choice.!!!");
              System.out.println("---------------------------------------------------------");
              break;
              
         
                      
          
      }
          
          }while(Character.toUpperCase(f)!='A');
                      
              }
      }

class Project{
	private int num;
	private String name,perip,empl;
	
	
	
	Project(int num,String name,String perip,String empl){
		this.num=num;
		this.name=name;
		this.perip=perip;
		this.empl=empl;
	}
	
	public String Present(){
		return "Code : "+num+" Device Name : "+name+" Peripheral Name :"+perip+" Name Employee : "+empl;
	}
	public String Empl() {
		return empl;
	}
	public String Names() {
		return name;
	}
	public int Number() {
		return num;
	}
	
	
	
}