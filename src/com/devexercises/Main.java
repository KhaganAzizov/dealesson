package com.devexercises;


import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner milioner = new Scanner (System.in);
            int a;
            int score=0;

            System.out.print("Welcome to Milionaire game.");

            System.out.print("1) What year corona has been created?");
            a=milioner.nextInt();
            if(a==2019){
                score=score+50;
                System.out.print("Good. You have "+score+" points.");
            }
            else{
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }
            System.out.println("2) When was composer Bach born?");
            a=milioner.nextInt();
            if(a==1685){
                score=score+50;
                System.out.print("Good. You have "+score+" points.");
            }
            else{
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }

            System.out.println("3) How many months are in a year?");
            a=milioner.nextInt();
            if(a==12){
                score=score+50;
                System.out.print("Good. You have "+score+" points.");
            }
            else{
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }

            System.out.println("4) How many meters is mount Everest?");
            a=milioner.nextInt();
            if(a==8850){
                score=score+50;
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }
            else{
                System.out.print("Incorrect, loser. You still have 150 points haha.");
            }

            System.out.println("5) How many square kilometer is the total area of Azerbaijan?");
            a=milioner.nextInt();
            if(a==86600){
                score=score+50;
                System.out.print("Good. You have "+score+" points.");
            }
            else{
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }

            System.out.println("6) How many days are in a week?");
            a=milioner.nextInt();
            if(a==7){
                score=score+50;
                System.out.print("Good. You have "+score+" points.");
            }
            else{
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }

            System.out.println("7) How many kilometer is the length of Nile?");
            a=milioner.nextInt();
            if(a==6650){
                score=score+50;
                System.out.print("Good. You have "+score+" points.");
            }
            else{
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }

            System.out.println("8) Find the answer : 25 * 80");
            a=milioner.nextInt();
            if(a==2000){
                score=score+50;
                System.out.print("Good. You have "+score+" points.");
            }
            else{
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }

            System.out.println("9) How many colors are there on Azerbaijan's flag?");
            a=milioner.nextInt();
            if(a==3){
                score=score+50;
                System.out.print("Good. You have "+score+" points.");
            }
            else{
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }

            System.out.println("3) How many states are therein Germany?(Hey! Want a secret? I was living in Germany 1 year :) )");
            a=milioner.nextInt();
            if(a==16){
                score=score+50;
                System.out.print("Good. You have "+score+" points.");
            }
            else{
                System.out.print("Incorrect, loser. You still have "+score+" point haha.");
            }
            System.out.println("Heeey your score is:"+score);
        }
}

