public class WaterTreeTest {
    public static void main(String[] args)
    {
        System.out.println(getRequiredLiters(5));
        System.out.println(getRequiredLiters(2));
    }

    public static int getRequiredLiters(int floor){
        int result = 0;
        for(int i =1;i<=floor;i++){
            result+=2*i;
        }
        return result +1;
    }
}
