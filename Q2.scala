object Q2 {
   
   def main(args:Array[String]){
	  
	    attendees(10);
		revenue(15);
		cost(3);
	    println("Profit price 5: "+profit(5));
		println("Profit price 10: "+profit(10));
		println("Profit price 15: "+profit(15));
		println("Profit price 20: "+profit(20));
		println("Profit price 25: "+profit(25));
		println("Profit price 30: "+profit(30));
	  
	  }
  def attendees(Price:Int):Int=120+(15-Price)/5*20;
  def revenue (Price:Int):Int=attendees(Price)*Price;
  def cost(Price:Int):Int=500+attendees(Price);
  def profit(Price:Int):Int=revenue(Price)-cost(Price);

}

