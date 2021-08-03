/**
*	@author:Athila Wender de Salles
*	@version: 1.0
*	@param cpf String - entrada dos numeros do cpf
*
*	Metodo para verificar a validade de um cpf brasileiro pelo cauculo apresentado
*	cpf = [0,1,2,3,4,5,6,7,8,9,10]
*	onde soma1 = ((cpf[0]*10)+(cpf[1]*9)+(cpf[2]*8)...+(cpf[7]*3)+(cpf[8]*2))
*		 soma2 = ((cpf[0]*11)+(cpf[1]*10)+(cpf[2]*9)...+(cpf[8]*3)+(cpf[9]*2))
*		 d1 = resto de soma1/11
*		 d2 = resto de soma2/11
*	e se d1 ou d2 for maior que 9 se adota o valor 0
*/
		 
public class Valida{
	public static void teste(String cpf){
		char[] digitos = null;
		int d0 =0, d1=0, d2=0, j=10;
		digitos = cpf.toCharArray();
		for(int i =0; i<9; i++){
			d0 = (Integer.parseInt(String.valueOf(digitos[i])));
			d1 = d0*j+d1;
			j--;
		}
		d0 = d1%11;
		d1= 11-d0;
		if(d1>9) d1 =0;
		j =11;
		for(int i =0; i<10; i++){
			d0 = (Integer.parseInt(String.valueOf(digitos[i])));
			d2 = d0*j+d2;
			j--;
		}
		d0 = d2%11;
		d2= 11-d0;
		if(d2>9) d2 =0;
		System.out.print(d1);
		System.out.println(d2);
		if(d1 == (Integer.parseInt(String.valueOf(digitos[9]))) && d2==(Integer.parseInt(String.valueOf(digitos[10])))) System.out.println("CPF valido!!");
		else System.out.println("CPF Invalido");
	}
}