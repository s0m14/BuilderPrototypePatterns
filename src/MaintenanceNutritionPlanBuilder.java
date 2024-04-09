import java.util.List;

public class MaintenanceNutritionPlanBuilder extends NutritionPlanBuilder {
    private String goal = "Maintenance";

    public MaintenanceNutritionPlanBuilder setValues(){
        super.setCaloricIntake(2000).
        setMacronutrientRatios(45, 30, 25);
        setMealPlans(List.of("Breakfast: Baursaki, Kurt, Tea", "Lunch: Salad", "Dinner: Grilled salmon with vegetables"));
        setFitnessGoals(goal);
        setDietaryRestrictions(List.of("None")).build();
        return this;
    }
}
