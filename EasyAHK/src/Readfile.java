import java.util.*;
import java.io.*;

public class Readfile {
	
	List<Command> commands = new LinkedList<Command>();
	FileReader fr;
	char[] buffer =new char[500];
	
	Readfile(){}
	
	Readfile(String input){
		try{
			System.out.println("1");
			FileReader fr= new FileReader(input);
			System.out.println("2");
			fr.read(buffer);
			System.out.println(buffer[1]);
			List<String> strings = parsetoLine(buffer);
			for(String x:strings){
				System.out.println(x);
			}
			fr.close();
		}catch(Exception e2){
			System.out.println("Well something messed up");
		}
		
	}
	
	public static List<String> parsetoLine(char[] a){
		
		List<String> lt = new LinkedList<String>();
		StringBuilder str = new StringBuilder();
		for(char x:a){
			
			str.append(x);
			System.out.println(x);
			//System.out.println(str.charAt((str.length()-1)));
			if(x == ' ' && str.charAt((str.length()-2))== ' ' && str.charAt((str.length()-3))== ' ' && str.charAt((str.length()-4))== ' '){
				System.out.println("2");
				str.delete(str.length()-2,str.length());
				lt.add(str.toString());
				str.delete(0, str.length());
			}
		}
		return lt;
		
	}
	public int getLength(){
		return(commands.size());
	}
	
	public void delete(int index){
		commands.remove(index);
	}
	
	public Command get(int index){
		return (commands.get(index));
	}
	
	public void add(Command e){
		commands.add(e);
	}
	
	public void add(int index, Command element){
		commands.add(index, element);
	}
	
	public static void main(String[] args) {
		/*String temp = "aplpe\\nbannna\\nendofthis line to do\\n testing#@$^%^@#%@^&&%$&\\n";
		char[] temp2= temp.toCharArray();
		List<String> temp1= parsetoLine(temp2);
		for(String x:temp1){
			System.out.println(x);
		}*/
		Readfile tmp= new Readfile();
		tmp.add(new Command());
		System.out.println(tmp.getLength());
		
	}
	
	

}
