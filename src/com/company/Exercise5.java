package com.company;

public class Exercise5 {
    public static void main(String[] args) {           //1
        boolean flag1 = isHoopy(202);               //2
        boolean flag2 = isFrabjuous(202);           //8
        System.out.println(flag1);                     //14     true
        System.out.println(flag2);                     //15     true
        if (flag1 && flag2) {                          //16
            System.out.println("ping!");               //17     ping!
        }                                              //18
        if (flag1 || flag2) {                          //19
            System.out.println("pong!");               //20     pong!
        }                                              //21
    }                                                  //22 lukker program
    public static boolean isHoopy(int x) {             //3
        boolean hoopyFlag;                             //4
        if (x % 2 == 0) {                              //5
            hoopyFlag = true;                          //6
        } else {                                       //
            hoopyFlag = false;                         //
        }                                              //
        return hoopyFlag;                              //7
    }                                                  //
    public static boolean isFrabjuous(int x) {         //9
        boolean frabjuousFlag;                         //10
        if (x > 0) {                                   //11
            frabjuousFlag = true;                      //12
        } else {                                       //
            frabjuousFlag = false;                     //
        }                                              //
        return frabjuousFlag;                          //13
    }

}

/* output:
14 true
15 true
17 ping!
20 pong!
 */