char firstNotRepeatingCharacter(String s) {
    //Declarando array com o tamanho máximo possível pela TAREFA 10 elevado a 5 = 100000 + 1 - 100001
    int[] sRepeat = new int[100001];
    //Transformando a String recebida em um array de char
    char[] sArr = s.toCharArray();
    
    for (int i = 0; i < sArr.length; i++) {
        sRepeat[sArr[i]] += 1;
        
        if (sRepeat[sArr[i]] >= 2)
            continue;
    }
    
    for (int i = 0; i < sArr.length; i++){
        if (sRepeat[sArr[i]] <= 1) 
            return sArr[i];
    }
    
    return '_';
}
