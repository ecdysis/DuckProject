
public class MallardDuck extends Duck{
	
	public MallardDuck() {
		quackBehavior = new Quack(); 
		flyBeHavior = new FlyWithWings();
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 물 오리 입니다. ");
	}
}
