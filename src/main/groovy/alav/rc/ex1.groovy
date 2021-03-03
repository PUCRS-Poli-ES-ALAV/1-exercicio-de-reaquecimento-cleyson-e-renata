
class ex1{

    // 1. Multiplicação de dois números naturais,
    // através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public static int multDois(int a, int b){
		return multDoisAux(a, b, 0)
    }

    public static int multDoisAux(int a, int b, int total) {
    	if(a < 1)
    		return total

    	total += b
    	a--
    	return multDoisAux(a, b, total);
    }

}