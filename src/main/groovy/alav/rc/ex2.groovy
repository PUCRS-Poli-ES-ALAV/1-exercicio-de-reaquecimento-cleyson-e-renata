class ex2 {

	// 2. Soma de dois números naturais,
	// através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
	public static int somaDois(int a, int b){
		return somaDoisAux(a, somaDoisAux(b, 0))
	}

    public static int somaDoisAux(int a, int b) {
    	if(a < 1)
    		return b

    	return somaDoisAux(a--, b++);
    }


}