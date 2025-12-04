package org.sakousa;

public class Switch {
    public static void main(String[] args) {
        /*
        //Declare a variable
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                    System.out.println("Wednesday");
                    break;
                    case 4:
                    System.out.println("Thursday");
                    break;
                    case 5:
                        System.out.println("Friday");
                    break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                        case 7: System.out.println("Sunday");
                        break;
        }
         */
        /*
        if (20<25){
            System.out.println("20 is bigger than 25");
        }
        if (20<18){
            System.out.println("20 is larger than 18");
        }else {
            System.out.println("20 is smaller than 18");
        }
        if (10>30){
            System.out.println("10 is bigger than 30");
        }else if (10>30){
            System.out.println("20 is bigger than 30");
        }
        else{
            System.out.println("10 is biger than 20 and 10");
        }
        String result = (20 > 18)?((20>19) ? "Good day. " : "Best day"): "Good evening. ";
        System.out.println("Hello\t" + result);

         */

//        int day = 4;
//        switch (day) {
//            case 6:
//                System.out.println("Hello saturday");
//                System.out.println("Hello world");
//                break;
//                case 7:
//                    System.out.println("Good Sunday");
//                    break;
//
//                    default:
//                        System.out.println("invalid day");
//        }

        int day = 60;
        switch (day){
            case 50:
                day = 61;
                System.out.println("Hello 61");
                break;
                case 60:
                    day = 62;
                    System.out.println("Hello 62");
                    break;
                    case 90:
                    day = 63;
                    System.out.println("Hello 63");
                    break;
                    case 100:
                    day = 64;
                    System.out.println("Hello 64");
                    break;
            default:
                day = 60;
                System.out.println("Hello 60");
        }

    }
}

