
public abstract class Duck {
	/*
	 * 행동 인터페이스형식의 레퍼런스 변수 두개를 선언한다. 모든 서브 클래스에서 이 변수를 상속 받는다.  
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
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBeHavior = fb; 
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb; 
	}
}
