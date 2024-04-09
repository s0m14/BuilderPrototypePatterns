import java.util.List;

public class NutritionPlanBuilder {
    private int dailyCaloricIntake;
    private int carbohydtaresRatio;
    private int protein;
    private int fat;
    private List<String> meals;
    private String fitnessGoal;
    private List<String> restrictions;

    public NutritionPlanBuilder setCaloricIntake(int dailyCaloricIntake){
        this.dailyCaloricIntake = dailyCaloricIntake;
        return this;
    }

    public NutritionPlanBuilder setMacronutrientRatios(int carbohydtaresRatio,int protein , int fat){
        this.carbohydtaresRatio = carbohydtaresRatio;
        this.protein = protein;
        this.fat = fat;
        return this;
    }

    public NutritionPlanBuilder setMealPlans(List<String> meals){
        this.meals = meals;
        return this;
    }

    public NutritionPlanBuilder setFitnessGoals(String fitnessGoal){
        this.fitnessGoal = fitnessGoal;
        return this;
    }

    public NutritionPlanBuilder setDietaryRestrictions(List<String> dietaryRestrictions){
        this.restrictions = dietaryRestrictions;
        return this;
    }

    public NutritionPlan build(){
        return new NutritionPlan(dailyCaloricIntake,carbohydtaresRatio,protein,fat,meals,fitnessGoal,restrictions);
    }

}
