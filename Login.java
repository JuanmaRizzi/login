 import java.util.Scanner;
public class Login{
	public static void main(String args[]){
		String usuario= "";
		String password = "";

		
		Scanner in = new Scanner(System.in);
		System.out.print("indique su nombre de usuario: ");
		usuario = in.nextLine();
		System.out.print("defina su contraseña: ");
		password = in.nextLine();

		if(usuario.equals("juan") && password.equals("12355")){
			System.out.println("bienvenido " + usuario);
		}else{
			System.out.println("revise su usuario y contraseña");
		}
		
		
		
		
		
		
		
	}
}