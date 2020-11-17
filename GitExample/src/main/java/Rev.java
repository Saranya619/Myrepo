class Rev{
	public static void main(String args[]){
		int num=0,rev=0,i,rem=0;
		num=Integer.parseInt(args[0]);
		for(i=0;num!=0;i++){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
				}
		System.out.println("The reversed number is "+rev);
		
	}
}