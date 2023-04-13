package javahm5week;

import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<String>();
        colourList.add("Red");
        colourList.add("Blue");
        colourList.add("Green");
        colourList.add("Yellow");
        colourList.add("Black");
        colourList.add("Purple");
        colourList.add("White");
        colourList.add("Cyan");
        colourList.add("Orange");
        for (String colourlist : colourList){
            System.out.println(colourList + ",");
        }

    }
}
