// Write a java program to find the maxiumum element in a array . 
    public class Myclass{
    public static void main(String[]args){
        int []arr ={1,2,3,45,5,5,34,67};
        int Max = 0;
        for (int e:arr){
            if (e>Max){
                Max=e;
            }
        }
        System.out.println("the value of the Maximum element in this array is :"+Max);
    }
    }
