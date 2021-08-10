/**
*	Verifica se tem apenas numeros na string
*
*	@param String cpf
*	@return true or false.
*/

class Numero{
	public static boolean teste (String cpf){
		if(cpf == null)	return false;
		for(char letra : cpf.toCharArray())
			if(letra <'0' || letra >'9')	return false;
		return true;
	}
}