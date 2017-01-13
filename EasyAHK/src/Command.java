
public class Command {
	public String input;
	public String output;
	public Boolean active;	//if window active is selected
	public String window;
	
	public Command(){
		
	}
	
	public Command(String input, String output){
		this.input=input;
		this.output=output;
		this.active=false;
	}
	
	public String toString(){
		if(active){
			return(this.input+"::"+this.output+"\n");	//not finished, need to add ifwinactive
		}else{
			return(this.input+"::"+this.output+"\n");
		}
	}
	public String toStringvis(){
		return(this.input+" -> "+this.output);
	}
	
}

