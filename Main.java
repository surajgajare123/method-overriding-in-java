class A {
    public int Meth(){
        return 3;
    }
    public void Meth1(){
        System.out.println("method of class A !");
    }
}
class B extends A{
    @Override
    public void Meth1(){
        System.out.println("method of class B !");
    }
    public int meth3(){
        return 8;
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		A a = new A();
		a.Meth1();
		B b = new B();
		b.Meth1();
	}
}
