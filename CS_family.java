
public class CS_family extends Abstract_factory {
String name;

    CS_family() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    CS_family() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     public staff GetSalary() {
         
        switch (name) {
            case "doctor":
                return new doctors() ;
            case "teaching assistant":
                return new teaching_assistant();
            default:
                return null;
        }
    }
    
  
    public staff getYearsOfWork(){
     
        switch (name) {
            case "doctor":
                return new doctors();
            case "teaching assistant":
                return  new teaching_assistant();
            default:
                return null;
        }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
}