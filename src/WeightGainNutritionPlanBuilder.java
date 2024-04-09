import java.util.List;

public class WeightGainNutritionPlanBuilder extends NutritionPlanBuilder {
    private String goal = "Weight gain";

    public WeightGainNutritionPlanBuilder setValues() {
        super.setCaloricIntake(3000);
        setMacronutrientRatios(50, 25, 25);
        setMealPlans(List.of("Breakfast: Kazy,Kurt, Ayran", "Lunch: Beshbarmak", "Dinner: Kuyrdak"));
        setFitnessGoals(goal);
        setDietaryRestrictions(List.of("No sugar","More sleep")).build();
        return this;
    }
}
