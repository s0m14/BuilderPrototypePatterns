import java.util.List;

public class WeightLossNutritionPlanBuilder extends NutritionPlanBuilder{
   private String goal = "Weight loss";

    public WeightLossNutritionPlanBuilder setWeightLossDefaults() {
        super.setCaloricIntake(1500).
        setMacronutrientRatios(40,30,30).
        setMealPlans(List.of("Breakfast: Baursaki, Ayran", "Lunch: Kurt", "Dinner: Sirne"));
        setFitnessGoals(goal);
        setDietaryRestrictions(List.of("No processed sugars", "Low sodium")).build();
        return this;
    }







}
