//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    // 苹果的单价
    private static final double APPLE_PRICE = 8.0;
    // 草莓的单价
    private static final double STRAWBERRY_PRICE = 13.0;
    // 芒果的单价
    private static final double MANGO_PRICE = 20.0;

    /**
     * 计算顾客A购买水果的总价
     *
     * @param appleWeight 苹果的重量（斤）
     * @param strawberryWeight 草莓的重量（斤）
     * @return 购买水果的总价
     */
    public static double calculateTotalPriceA(double appleWeight, double strawberryWeight) {
        return appleWeight * APPLE_PRICE + strawberryWeight * STRAWBERRY_PRICE;
    }

    /**
     * 计算顾客B购买水果的总价
     *
     * @param appleWeight 苹果的重量（斤）
     * @param strawberryWeight 草莓的重量（斤）
     * @param mangoWeight 芒果的重量（斤）
     * @return 购买水果的总价
     */
    public static double calculateTotalPriceB(double appleWeight, double strawberryWeight, double mangoWeight) {
        return appleWeight * APPLE_PRICE + strawberryWeight * STRAWBERRY_PRICE + mangoWeight * MANGO_PRICE;
    }

    /**
     * 计算顾客C购买水果的总价
     *
     * @param appleWeight 苹果的重量（斤）
     * @param strawberryWeight 草莓的重量（斤）
     * @param mangoWeight 芒果的重量（斤）
     * @return 购买水果的总价
     */
    public static double calculateTotalPriceC(double appleWeight, double strawberryWeight, double mangoWeight) {
        // 草莓打8折
        double discountedStrawberryPrice = STRAWBERRY_PRICE * 0.8;
        return appleWeight * APPLE_PRICE + strawberryWeight * discountedStrawberryPrice + mangoWeight * MANGO_PRICE;
    }

    /**
     * 计算顾客D购买水果的总价
     *
     * @param appleWeight 苹果的重量（斤）
     * @param strawberryWeight 草莓的重量（斤）
     * @param mangoWeight 芒果的重量（斤）
     * @return 购买水果的总价
     */
    public static double calculateTotalPriceD(double appleWeight, double strawberryWeight, double mangoWeight) {
        double totalPrice = calculateTotalPriceC(appleWeight, strawberryWeight, mangoWeight);
        // 满100减10
        if (totalPrice >= 100) {
            totalPrice -= 10;
        }
        return totalPrice;
    }
    public static void main(String[] args) {
        // 示例：顾客A购买2斤苹果和3斤草莓
        System.out.println("顾客A购买水果的总价：" + calculateTotalPriceA(2, 3));

        // 示例：顾客B购买1斤苹果、2斤草莓和1斤芒果
        System.out.println("顾客B购买水果的总价：" + calculateTotalPriceB(1, 2, 1));

        // 示例：顾客C购买2斤苹果、3斤草莓和1斤芒果
        System.out.println("顾客C购买水果的总价：" + calculateTotalPriceC(2, 3, 1));

        // 示例：顾客D购买3斤苹果、4斤草莓和2斤芒果
        System.out.println("顾客D购买水果的总价：" + calculateTotalPriceD(3, 4, 2));
    }
}