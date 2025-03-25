//befor constructor
package org.tnsif.accenture.c2tc.constructor;

class Myclass
{
	String color;
	int age;
	String Brand;
}
public class BeforeConstructor {

	public static void main(String[] args) {
		Myclass obj=new Myclass();
		obj.age=12;
		obj.color="pink";
		obj.Brand="Maruthi";
		System.out.println(obj.color + " "+obj.age+ " "+obj.Brand);

	}

}


//Default Constructor
package org.tnsif.accenture.c2tc.constructor;

class Myclass1
{
	String color;
	int age;
	String Brand;
	
	Myclass1()
	{
		color="Green";
		age=23;
		Brand="Maruthi";
	}

}

public class DefaultConstructor {

	public static void main(String[] args) {
		Myclass1 obj=new Myclass1();
		Myclass1 obj1=new Myclass1();
		System.out.println(obj.color + " "+obj.age+ " "+obj.Brand);
		System.out.println(obj1.color + " "+obj1.age+ " "+obj1.Brand);
	}



//Parameterized constructor
package org.tnsif.accenture.c2tc.constructor;

class Myclass2
{
	String color;
	int age;
	String Brand;
	//Parameterized constuctor
	Myclass2(String color,int age,String Brand)
	{
		this.color=color;
		this.age=age;
		this.Brand=Brand;
	}	
}
public class ParameterizedConstructor {
	public static void main(String[] args) {
		Myclass2 obj=new Myclass2("White",2000,"BMW");
		Myclass2 obj1=new Myclass2("Black",3000,"Audi");
		
		System.out.println(obj.color + " "+obj.age +" "+obj.Brand);
		System.out.println(obj1.color + " "+obj1.age +" "+obj1.Brand);

	}

}
}
