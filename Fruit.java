class Fruit{
	  String fruitName;
	  int fruitRate;
	  char fruitGrade;
	  String fruitColor;
	  
 void insertFruitIntance(String Name,int Rate,char  Grade, String Color){
	       fruitName=Name;
	       fruitRate=Rate;
	       fruitGrade=Grade;
	       fruitColor=Color;
	 
 }
 void display(){
	  
	  System.out.println(fruitName+"\t"+"\t"+fruitRate+"\t"+"\t"+fruitGrade+"\t"+"\t"+fruitColor);
	 
 }
	public static void main(String A[]){
		Fruit F1= new Fruit();
		Fruit F2=new Fruit();
		F1.insertFruitIntance("Orange",80,'A',"Orange");
		F2.insertFruitIntance("Apple",120,'B',"Red");
		System.out.println("fruitName"+"  "+"fruitRate"+"  "+"fruitGrade"+"  "+"fruitColor");
		F1.display();
		F2.display();
		
		
		
	}
   

	 
	
}