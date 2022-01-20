import java.util.*;

interface IClass
{
	void Method();
}

class SubClass1 implements IClass
{
	public void Method()
	{
		System.out.println("SubClass1 Method Called");
	}
}

class SubClass2 implements IClass
{
	public void Method()
	{
		System.out.println("SubClass2 Method Called");
	}
}

class SubClass3 implements IClass
{
	public void Method()
	{
		System.out.println("SubClass3 Method Called");
	}
}

class SubClass4 implements IClass
{
	public void Method()
	{
		System.out.println("SubClass4 Method Called");
	}
}

class Interfaces
{
	public static void main(String args[])
	{
		ArrayList<IClass> list = new ArrayList<IClass>();

		list.add(new SubClass1());
		list.add(new SubClass2());
		list.add(new SubClass3());
		list.add(new SubClass4());

		for(IClass x : list)
		{
			x.Method();
		}
	}
}