class one
    {
       int i,j,lines=5;
         one() 
           {
               for(i=1;i<=lines;i++)
                     {
                         for(j=lines;j>=1;j--)
                             {
                                 if(j!=i)
                                    {
                                         System.out.print(j);  
                                    }
                                 else
                                    {
                                         System.out.print("*");
                                    }   
                             }System.out.println("");
                     }
 
           }
    }


class first
    {
         public static void main(String[] args)
             {
                 one obj1 = new one();
             }
    }

//5432*
//543*1
//54*21
//5*321
//*4321