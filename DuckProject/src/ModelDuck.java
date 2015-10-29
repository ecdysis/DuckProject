
public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBeHavior = new FlyNoWay(); 
		
	}

	public void display() {
		System.out.println("저는 모형 오리입니다.");
	}
}
