public class test {
    public class starPattern3 {
        public static void main(String[] args) {
            for(int row=1;row<=4;row++){
                for(int column=1;column<=row;column++){
                    System.out.print("*");
                }
                System.out.println();
    
            }
            for(int row=1;row<=4;row++){
    
                for(int column=4;column>=row;column--){
    
                    System.out.print("*");
                }
                System.out.println();
    
            }
        }
    }
    
    
}
