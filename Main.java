package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter a");
        double a=scanner.nextDouble();

        System.out.println("enter b");
        double b=scanner.nextDouble();

        System.out.println("enter c");
        double c=scanner.nextDouble();

        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);

        System.out.println("delta la :" + quadraticEquation.getDiscriminant() );



        double delta=quadraticEquation.getDiscriminant();

        if(delta>0){

            System.out.println("phuong trinh co 2 nghiem phan biet: "+quadraticEquation.getRoot1()+" va "+quadraticEquation.getRoot2());

        }else if (delta==0){
            System.out.println("phuong trinh co 1 nghiem : "+ quadraticEquation.multiplieRoot());

        }else {

            System.out.println("phuong trinh vo nghiem");
        }


    }
}
