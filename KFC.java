public class KFC
{
	public static void main(String args[])
	{
	    MealBuilder mb=(MealBuilder)XMLUtil.getBean();
	    KFCWaiter waiter=new KFCWaiter();
	    waiter.setMealBuilder(mb);
	    Meal meal=waiter.construct();
        
	}
}

public class KFCWaiter
{
	private MealBuilder mb;
	public void setMealBuilder(MealBuilder mb)
	{
		this.mb=mb;
	}
	public Meal construct()
	{
		mb.buildFood();
		mb.buildDrink();
		return mb.getMeal();
	}
}

public class Meal
{
	private String food;
	private String drink;
	
	public void setFood(String food) {
		this.food = food; 
	}

	public void setDrink(String drink) {
		this.drink = drink; 
	}

	public String getFood() {
		return (this.food); 
	}

	public String getDrink() {
		return (this.drink); 
	}
}

public abstract class MealBuilder
{
	protected Meal meal=new Meal();
	public abstract void buildFood();
	public abstract void buildDrink();
	public Meal getMeal()
	{
		return meal;
	}
}

public class SubMealBuilderA extends MealBuilder
{
	public void buildFood()
	{
		meal.setFood();
	}
	public void buildDrink()
	{
	    meal.setDrink();
	}
}

public class SubMealBuilderB extends MealBuilder
{
	public void buildFood()
	{
		meal.setFood();
	}
	public void buildDrink()
	{
	    meal.setDrink();
	}
}
