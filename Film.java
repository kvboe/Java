package Slab1;

import java.lang.*;

public class Film {
    String tittle;
    Main.Gatunki gatunek;
    int filmoscars;
    public int []release = {1998, 2004, 2010, 1990, 2012, 2048};
    public int temp_release;

    Film(){

    }

    int lastYear (){
        int temp = 0;
        for (int i=0; i < this.release.length; i++){
            if (temp < release[i])
                temp = release[i];
        } return temp;
    }

    int nearYear(int year){
        int temp = 100;
        int temp2 = 0;
        for (int i=0; i <release.length; i++){
            if (Math.abs(release[i]-year) < temp) {
                temp = Math.abs(release[i]-year);
                temp2 = release[i];
            }
        } return temp2;
    }

    int getRelease(int temp){
        return release[temp];
    }

}
