public class KadanesAlgorithm_MAx_Subarray_Sun {
     public static void kadanes_Algo(int num[]){ 
        int csum=0; 
        int msum=Integer.MIN_VALUE; 
        for(int i=0;i<num.length;i++){
            csum+=num[i]; 
            if(csum<0) {
                csum=0;
            } 
            msum=Math.max(csum,msum);
        }  
        System.out.println("Maximum sum is :  "+msum);

     } 
     public static boolean allNegative(int num[]){ 
        
            if(num==null) return false;  
            for(int i=0;i<num.length;i++){
                if(num[i]>0) 
                 return false; 
            } 
            return true;
     } 
     public static void MAxNegative(int num[]){ 
        int ma=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            ma=Math.max(ma,num[i]);
        } 
        System.out.println("Max Value is : "+ma);

     }
    public static void main(String[] args){
        int num[]={-2,-3,4,-1,-2,1,5,-3};  
        boolean b=allNegative(num);
        if(b==false)
                { kadanes_Algo(num);  }
        else 
              {MAxNegative(num);}
       int arr[]={-10,-2,-6,-11,-3} ;
       boolean c=allNegative(arr);
       if(c==false)
               { kadanes_Algo(arr);  }
       else 
             {MAxNegative(arr);}
    }
}
