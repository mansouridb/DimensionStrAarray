package org.example;

public class DimArray {
    public static void main(String[] args) {
        int columns = 2;
        int rows = 2;

        String[][] newArray = new String[columns][rows];
        newArray[0][0] = "France";
        newArray[0][1] = "Paris";
        newArray[1][0] = "Sweden ";
        newArray[1][1] = "Stockholm ";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(newArray[i][j]);
            }
        }
    }
}
