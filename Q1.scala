object Q1{
    
	def main(args:Array[String]){
	
	     wage(40);
		 ot(20);
		 income(40,20);
		 tax(40);
		 println("Salart : "+takeHome(40,20));
		 
	}
	
	def wage(hours:Int):Int=hours*150;
	def ot(hour:Int):Int=hour*75;
	def income(h1:Int,h2:Int):Int=wage(h1) + ot(h2);
	def tax(income:Int):Double =income*0.1;
	def takeHome(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2));
}
