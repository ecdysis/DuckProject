
public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBeHavior = new FlyNoWay(); 
		
	}

	public void display() {
		System.out.println("���� ���� �����Դϴ�.");
	}
}
