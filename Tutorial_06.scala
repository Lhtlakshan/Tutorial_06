object scala_tutorial_06{
	
	def main(args: Array[String]): Unit={

		
        //A variable named alpha to declare English alphabet

		val alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		//Create a funtion named Encription for encription to given string 

        val Encryption = (c:Char,shift:Int,a:String)=>a((a.indexOf(c.toUpper)+shift)%a.size);

        //Create a funtion named decription for encription to given string

        val Decription =(c:Char,shift:Int,a:String)=>a((a.indexOf(c.toUpper)-shift)%a.size);

        //Create the higher order function to encription or decription given string

        val cipher=(algo:(Char,Int,String)=>Char,s:String,shift:Int,a:String)=>s.map(algo(_,shift,a));

        val scala=cipher(Encryption,"scala",5,alpha);
        val Java=cipher(Decription,"Java",5,alpha);
    

	}

}