import java.util.*;

public class ListofCommands {
	List<HashMap<String,String>> C= new ArrayList<HashMap<String,String>>();
	HashMap<String,String> Letters = new HashMap<String,String>();
	HashMap<String,String> NumPad = new HashMap<String,String>();
	HashMap<String,String> FKeys = new HashMap<String,String>();
	HashMap<String,String> SpecialKeys = new HashMap<String,String>();
	HashMap<String,String> Media = new HashMap<String,String>();
	HashMap<String,String> Mouse = new HashMap<String,String>();
	
	
	
	
	
	ListofCommands(){
		Initialize();
	}
	
	public void Initialize(){
		Letters.put("A","a");
		Letters.put("B","b");
		Letters.put("C","c");
		Letters.put("D","d");
		Letters.put("E","e");
		Letters.put("F","f");
		Letters.put("G","g");
		Letters.put("H","h");
		Letters.put("I","i");
		Letters.put("J","j");
		Letters.put("K","k");
		Letters.put("L","l");
		Letters.put("M","m");
		Letters.put("N","n");
		Letters.put("O","o");
		Letters.put("P","p");
		Letters.put("Q","q");
		Letters.put("R","r");
		Letters.put("S","s");
		Letters.put("T","t");
		Letters.put("U","u");
		Letters.put("V","v");
		Letters.put("W","w");
		Letters.put("X","x");
		Letters.put("Y","y");
		Letters.put("Z","z");
		
		NumPad.put("Numlock On: 0","Numpad0");
		NumPad.put("Numlock On: 1","Numpad1");
		NumPad.put("Numlock On: 2","Numpad2");
		NumPad.put("Numlock On: 3","Numpad3");
		NumPad.put("Numlock On: 4","Numpad4");
		NumPad.put("Numlock On: 5","Numpad5");
		NumPad.put("Numlock On: 6","Numpad6");
		NumPad.put("Numlock On: 7","Numpad7");
		NumPad.put("Numlock On: 8","Numpad8");
		NumPad.put("Numlock On: 9","Numpad9");
		NumPad.put("Numlock On: .","NumpadDot");
		
		NumPad.put("Numlock Off: 0","NumbpadIns");
		NumPad.put("Numlock Off: 1","NumbpadEnd");
		NumPad.put("Numlock Off: 2","NumbpadDown");
		NumPad.put("Numlock Off: 3","NumbpadPgDn");
		NumPad.put("Numlock Off: 4","NumbpadLeft");
		NumPad.put("Numlock Off: 5","NumbpadClear");
		NumPad.put("Numlock Off: 6","NumbpadRight");
		NumPad.put("Numlock Off: 7","NumbpadHome");
		NumPad.put("Numlock Off: 8","NumbpadUp");
		NumPad.put("Numlock Off: 9","NumbpadPgUp");
		NumPad.put("Numlock Off: .","NumbpadDel");
		
		
		
		NumPad.put("Numlock On and Off: /","NumpadDiv");
		NumPad.put("Numlock On and Off: *","NumpadMult");
		NumPad.put("Numlock On and Off: +","NumpadAdd");
		NumPad.put("Numlock On and Off: -","NumpadSub");
		NumPad.put("Numlock On and Off: Enter","NumpadEnter");
		
		FKeys.put("F1","F1");
		FKeys.put("F2","F2");
		FKeys.put("F3","F3");
		FKeys.put("F4","F4");
		FKeys.put("F5","F5");
		FKeys.put("F6","F6");
		FKeys.put("F7","F7");
		FKeys.put("F8","F8");
		FKeys.put("F9","F9");
		FKeys.put("F10","F10");
		FKeys.put("F11","F11");
		FKeys.put("F12","F12");
		FKeys.put("F13","F13");
		FKeys.put("F14","F14");
		FKeys.put("F15","F15");
		FKeys.put("F16","F16");
		FKeys.put("F17","F17");
		FKeys.put("F18","F18");
		FKeys.put("F19","F19");
		FKeys.put("F20","F20");
		FKeys.put("F21","F21");
		FKeys.put("F22","F22");
		FKeys.put("F23","F23");
		FKeys.put("F24","F24");
		
		SpecialKeys.put("Spacebar","Space");
		SpecialKeys.put("Tab","Tab");
		SpecialKeys.put("Enter(or return)","Enter");
		SpecialKeys.put("Escape","Escape");
		SpecialKeys.put("BackSpace","BackSpace");
		
		SpecialKeys.put("Help(might not work)","Help");
		SpecialKeys.put("Sleep(Might not work)","Sleep");
		SpecialKeys.put("Print Screen","PrintScreen");
		SpecialKeys.put("Pause","Pause");
		SpecialKeys.put("Delete","Delete");
		SpecialKeys.put("Insert","Insert");
		SpecialKeys.put("Home","Home");
		SpecialKeys.put("End","End");
		SpecialKeys.put("PgUp","PgUp");
		SpecialKeys.put("PgDn","PgDn");
		
		SpecialKeys.put("Arrowkey Up","Up");
		SpecialKeys.put("Arrowkey Down","Down");
		SpecialKeys.put("Arrowkey Left","Left");
		SpecialKeys.put("Arrowkey Right","Right");
		
		SpecialKeys.put("Scroll Lock","ScrollLock");
		SpecialKeys.put("Caps Lock","CapsLock");
		SpecialKeys.put("Number Lock","NumLock");
		SpecialKeys.put("Left Windows Key","LWin");
		SpecialKeys.put("Right Windows Key","RWin");
		SpecialKeys.put("Neutral Control","Control");
		SpecialKeys.put("Left Control","LControl");
		SpecialKeys.put("Right Control","RControl");
		SpecialKeys.put("Neutral Shift","Shift");
		SpecialKeys.put("Left Shift","LShift");
		SpecialKeys.put("Right Shift","RShift");
		SpecialKeys.put("Neutral Alt","Alt");
		SpecialKeys.put("Left Alt","LAlt");
		SpecialKeys.put("Right Alt","RAlt");
		
		
		Media.put("Browser Back","Browser_Back");
		Media.put("Browser Foward","Browser_Foward");
		Media.put("Browser Refresh","Browser_Refresh");
		Media.put("Browser Stop","Browser_Stop");
		Media.put("Browser Search","Browser_Search");
		Media.put("Browser Favorites","Browser_Favorites");
		Media.put("Browser Home","Browser_Home");
		Media.put("Volume Mute","Volume_Mute");
		Media.put("Volume Down","Volume_Down");
		Media.put("Volume Up","Volume_Up");
		Media.put("Media Next","Media_Next");
		Media.put("Media Previous","Media_Prev");
		Media.put("Media Stop","Media_Stop");
		Media.put("Media Play/Pause","Media_Play_Pause");
		Media.put("Launch Mail","Launch_Mail");
		Media.put("Launch Media","Launch_Media");
		Media.put("Launch App1","Launch_App1");
		Media.put("Launch App2","Launch_App2");
		
		Mouse.put("Left Mouse Click","LButton");
		Mouse.put("Right Mouse Click","RButton");
		Mouse.put("Middle Mouse Click","MButton");
		Mouse.put("Scroll Wheel down","WheelDown");
		Mouse.put("Scroll Wheel up","WheelDown");
		Mouse.put("Scroll Wheel left","WheelLeft");
		Mouse.put("Scroll Wheel right","WheelRight");
		Mouse.put("XButton1","XButton1");
		Mouse.put("XButton2","XButton2");
		
		C.add(0,Letters);
		C.add(1,SpecialKeys);
		C.add(2,NumPad);
		C.add(3,Media);
		C.add(4,FKeys);
		C.add(5,Mouse);
		
	}
	
	public String getCode(String map,String key){
		return (C.get(C.indexOf(map))).get(key);
	}
	public Set<String> getKeys(String x){
		int mapnumber=0;
		switch (x.toLowerCase()){
			case "letters":
				mapnumber=0;
				break;
			case "specialkeys":
				mapnumber=1;
				break;
			case "numpad":
				mapnumber=2;
				break;
			case "media":
				mapnumber=3;
				break;
			case"fkeys":
				mapnumber=4;
				break;
			case"mouse":
				mapnumber=5;
				break;
		}
		HashMap<String,String> temp=C.get(mapnumber);
		return(temp.keySet());
	}
	//public static void main(String[] args) {
		//Initalize();
		//Set<String> temp=getKeys("letters");
		//for(String x:temp){
			//System.out.println(x);
		//}
	//}
	
	
	
	
	
	
	
	
}
