public class FindMinElement {
    public static int findMaxElement(int[]array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min)min=array[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[]array = {5,7,5,4,3,8};
        int min = findMaxElement(array);
        System.out.println("Element min of array is :"+min);
    }
}
