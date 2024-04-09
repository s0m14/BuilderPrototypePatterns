public class NutritionPlanDirector {

    private NutritionPlanBuilder nutritionPlanBuilder;

    public void setBuilder(NutritionPlanBuilder nutritionPlanBuilder) {
        this.nutritionPlanBuilder = nutritionPlanBuilder;
    }

    public NutritionPlan createNutritionPlan(){
        return nutritionPlanBuilder.build();
    }
}
