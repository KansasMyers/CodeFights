int[][] rotateImage(int[][] a) {
   int n = a.length;
   
   for(int i=0; i  n  2; ++i) {
      int offset_min = i;
      int offset_max = n-1-i;
      for(int k = offset_min; k  offset_max; ++k) {
         int top = a[offset_min][k];
         int left = a[offset_max - k + offset_min][offset_min];
         int right = a[k][offset_max];
         int bottom = a[offset_max][offset_max - k + offset_min];

         a[offset_min][k] = left;
         a[k][offset_max] = top;
         a[offset_max][offset_max - k + offset_min] = right;
         a[offset_max - k + offset_min][offset_min] = bottom; 
      }
   }
   
   return a;
}
