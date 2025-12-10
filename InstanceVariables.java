public class InstanceVariables {
    /**
     *  Product -data
     */

    String productName = "apple";
    int productPrice = 100;
    double discount = 50;

    public static void main(String[] args) {

        InstanceVariables obj = new InstanceVariables();

        System.out.println("productName ===>" +obj.productName);
        System.out.println("productPrice ===>" + obj.productPrice);
        System.out.println("discount=====>" + obj.discount);

        System.out.println("-------------- After Reassign---------------------");


        /** RE- assign  - mutable */

        obj.productName = "kiwi";
        obj.productPrice = 200;
        obj.discount = 1;


        System.out.println("productName ===>" +obj.productName);
        System.out.println("productPrice ===>" + obj.productPrice);
        System.out.println("discount=====>" + obj.discount);


        System.out.println("-------------- Taking second Refernce---------------------");


        InstanceVariables obj2 = new InstanceVariables();

        System.out.println("productName ===>" +obj2.productName);
        System.out.println("productPrice ===>" + obj2.productPrice);
        System.out.println("discount=====>" + obj2.discount);
    }
}
