import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose  your plan");
        System.out.println("1. Weight loss");
        System.out.println("2. Weight gain");
        System.out.println("3. Maintenance");

        Scanner in = new Scanner(System.in);
        System.out.print("Your choose:");
        int a = in.nextInt();
        NutritionPlanDirector director = new NutritionPlanDirector();

        if(a == 1) {

            NutritionPlanBuilder weightLossBuilder = new WeightLossNutritionPlanBuilder().setWeightLossDefaults();

            director.setBuilder(weightLossBuilder);
            NutritionPlan weightLossPlan = director.createNutritionPlan();

            System.out.println("Weight Loss Plan:");
            System.out.println(weightLossPlan.toString());
            System.out.println();
            }
            else if(a == 2) {
            NutritionPlanBuilder weightGainBuilder = new WeightGainNutritionPlanBuilder().setValues();
            director.setBuilder(weightGainBuilder);
            NutritionPlan weightGainPlan = director.createNutritionPlan();

            System.out.println("Weight Gain Plan:");
            System.out.println(weightGainPlan);
            System.out.println();
        }else if(a == 3) {

            NutritionPlanBuilder maintenanceBuilder = new MaintenanceNutritionPlanBuilder().setValues();
            director.setBuilder(maintenanceBuilder);
            NutritionPlan maintenancePlan = director.createNutritionPlan();

            System.out.println("Maintenance Plan:");
            System.out.println(maintenancePlan);
        }
    }
}