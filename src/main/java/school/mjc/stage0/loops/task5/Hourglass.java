package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
               if(i < height / 2 ){
                   if(i > j || i + j  + 1 > height){
                       System.out.print(" ");
                   }else{
                       System.out.print("8");
                   }
               }else{
                   if(i + j + 1 < height || j > i){
                       System.out.print(" ");
                   }else{
                       System.out.print("8");
                   }
               }
            }
            System.out.println();
        }
    }
}
