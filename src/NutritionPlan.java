import java.util.List;
public class NutritionPlan {
    private int dailyCaloricIntake;
    private int carbohydtaresRatio;
    private int protein;
    private int fat;
    private List<String> meals;
    private String fitnessGoal;
    private List<String> restrictions;

    public NutritionPlan(int dailyCaloricIntake,int carbohydtaresRatio, int protein, int fat, List<String> meals, String fitnessGoal,List<String> restrictions){
        this.dailyCaloricIntake = dailyCaloricIntake;
        this.carbohydtaresRatio = carbohydtaresRatio;
        this.protein = protein;
        this.fat = fat;
        this.meals = meals;
        this.fitnessGoal = fitnessGoal;
        this.restrictions = restrictions;
    }

    public static NutritionPlanBuilder builder() {
        return new NutritionPlanBuilder();
    }

    @Override
    public String toString() {
        return "NutritionPlan{" +
                "\n  dailyCaloricIntake=" + dailyCaloricIntake +
                ",\n  carbohydratesRatio=" + carbohydtaresRatio +
                ",\n  protein=" + protein +
                ",\n  fat=" + fat +
                ",\n  meals=" + meals +
                ",\n  fitnessGoal='" + fitnessGoal + '\'' +
                ",\n  restrictions=" + restrictions +
                "\n}";
    }


}
