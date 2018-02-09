int firstDuplicate(int[] a) {
    
    //Setando o tamanho na nossa array auxilar para o máximo possível pela tarefa que é igual a 10 elevado a quinta potencia = 100000 + 1 = 100001
    int[] c = new int[100001];
    
    for(int i = 0; i < a.length; i++){
        c[a[i]] += 1;
        
        if (c[a[i]] == 2)
            return a[i];
    }
        
    return -1;
}
