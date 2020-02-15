import javax.swing.*;
import java.util.Scanner;
import java.text.*;

public class MetodosNumericos {
        
    
    public MetodosNumericos() {
    }
    
    
    public static void main(String[] args) {
        Scanner tcl=new Scanner(System.in);
        double valverd,valaprox;
        double  relativo,absoluto;
        
        //DecimalFormat f1=new DecimalFormat("#.##");
        
        valverd=Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor verdadero"));
        valaprox=Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor aproximado"));
        //ceros=JOptionPane.showInputDialog("introduzca el numero de ceros");
        
        JOptionPane.showMessageDialog(null,"el error absoluto es: "+Math.abs((valverd-valaprox))+"\n"+
								        "el error relativo es: "+Math.abs((valverd-valaprox)/valverd));
		relativo=Math.abs((valverd-valaprox)/valverd);	
		absoluto=Math.abs(valverd-valaprox);
							        
		
        
        
       
        
        
    }
}
