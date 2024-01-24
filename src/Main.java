public class Main {
    public static void main(String[] args) {

        System.out.println("hello World!!");
        int lowTemperature = 32;
        System.out.println(true || (lowTemperature+=5)>0);
        System.out.println(lowTemperature);
        System.out.println(lowTemperature);
        int currenttemperature = 3;
        int warmthreshold = 60;
        if (currenttemperature>warmthreshold)
            System.out.println("It's warm outside");
        else
            System.out.println("it's cold");

        String windDirection = "west";
        switch (windDirection){
            case "north":
                System.out.println("the wind is blowing form the north");
                break;
            case "south":
                System.out.println("the wind is blowing form the south");
                break;
            case "east":
                System.out.println("the wind is blowing form the east");
                break;
            case "west":
                System.out.println("the wind is blowing form the west");
                break;
            default:
                System.out.println("no wind lol");
        }
        String[] words = {"Hello","How","Are","You","GGGGGGGGGGGGGGGGGooooooooooooooDDDDDDDDDDDDDDDDDDDDDDD!!!!!!!!!!!!!!"};
        System.out.println(words[0]);
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
        //fori then tab is the shortcut to make a for loop. make sure to use this to save as much time as possible.
        for(String eachWord:words){
            System.out.println(eachWord);
        }
        int j = 0;
        while(j<=10){
            System.out.println(j);
            j++;
        }
        int k = 0;
        do{
            System.out.println(k);
            k+=2;
        }while(k<10);

        int[] integers = {1,2,3,4,-1,-2,10,0};
        for (int i = 0; i < integers.length; i++) {
            if (integers[i]<0){
                System.out.println(integers[i]+ " This is negative");
            }
            if (integers[i]==0){
                System.out.println(integers[i]+" is nether negative or positive its nothing. Its the symbol of the void forever empty and alone never real or fake.");
            }
            else{
                System.out.println(integers[i]+ " This is positive");
            }
            String name ="PFC Olinger";
            System.out.println(name);
            System.out.println(name.substring(1,name.length()-1));
            // make sure to add -1 to the end so the substring goes backwards one

            


        }
    }
}