class xpattern{
    
    public static void main(String[] args)
    {
        int n =9;
        int d=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || j == n-i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}