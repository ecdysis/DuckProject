
public abstract class Duck {
	/*
	 * �ൿ �������̽������� ���۷��� ���� �ΰ��� �����Ѵ�. ��� ���� Ŭ�������� �� ������ ��� �޴´�.  
	 */
	FlyBehavior flyBeHavior; 
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performFly() {
		flyBeHavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����.");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBeHavior = fb; 
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb; 
	}
}
