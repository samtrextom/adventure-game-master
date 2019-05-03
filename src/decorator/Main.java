package decorator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean inGame = true;
        Scanner k = new Scanner(System.in);
        String spot = "main";

        System.out.println("Choose your character's name:");
        Character basicCharacter = new BasicCharacter(k.nextLine());
        System.out.println("Name: " + basicCharacter.getName());




        do{
            getMenu(spot);
            String choice = k.nextLine();
            switch(choice)
            {
                case"1":
                {
                    switch(spot)
                    {
                        case"main":
                        {
                            System.out.println("\nYour might is "+basicCharacter.getMight());
                            if(basicCharacter.getMight()>8999)
                            {
                                System.out.println(basicCharacter.getName()+" got the sword you win!");
                                inGame = false;
                            }
                            else
                            {
                                System.out.println("Not strong enough yet");
                            }
                            break;
                        }
                        case"left":
                        {
                            System.out.println("\n"+basicCharacter.getName()+"'s intellect is "+basicCharacter.getIntellect());
                            if(basicCharacter.getIntellect()>8999)
                            {
                                System.out.println("Stacy gives you an amulet because you're smart!");
                                basicCharacter = new Amulet(basicCharacter);
                            }
                            else
                            {
                                System.out.println("Not smart enough yet");
                            }
                            break;
                        }
                        case"right":
                        {
                            if(basicCharacter.getIntellect()<100) {
                                System.out.println("\n"+basicCharacter.getName()+" get the staff!");
                                basicCharacter = new Staff(basicCharacter);
                            }
                            else
                            {
                                System.out.println("\nThere is no staff");
                            }
                            break;
                        }
                        case"middle":
                        {
                            if(basicCharacter.getToughness()<1)
                            {
                                System.out.println("\n"+basicCharacter.getName()+" got a shield");
                                basicCharacter = new Shield(basicCharacter);
                            }
                            else
                            {
                                System.out.println("\n"+basicCharacter.getName()+" already have the shield but I didnt want to make this program anymore complicated");
                            }
                            break;
                        }
                        default:
                        {
                            break;
                        }
                    }

                    break;
                }
                case"2":
                {
                    spot = getSpotOne(spot);
                    break;
                }
                case"3":
                {
                    spot = getSpotTwo(spot);
                    break;
                }
                case"4":
                {
                    System.out.println("\nYou'e starving");
                    basicCharacter = new Starving(basicCharacter);
                    spot = getSpotThree(spot);
                    break;
                }
                default:
                {
                    System.out.println("\nNot a valid option");
                    break;
                }
            }

        }while(inGame);

    }

    public static void mainForestMenu()
    {
        System.out.println("\nYou're in the main forest");
        System.out.println("You see a great sword in a stone");
        System.out.println("Choose what you want to do");
        System.out.println("1) Pull sword out of the stone");
        System.out.println("2) Go to left forest");
        System.out.println("3) Go to right forest");
        System.out.println("4) Go to middle forest");
    }

    public static void leftForestMenu()
    {
        System.out.println("\nYou're in the left forest");
        System.out.println("You see someone that could maybe be a dragon named Stacy");
        System.out.println("Choose what you want to do");
        System.out.println("1) Talk to Stacy");
        System.out.println("2) Go to main forest");
        System.out.println("3) Go to right forest");
        System.out.println("4) Go to middle forest");
    }

    public static void rightForestMenu()
    {
        System.out.println("\nYou're in the right forest");
        System.out.println("You see an old staff on the ground");
        System.out.println("Choose what you want to do");
        System.out.println("1) Get staff");
        System.out.println("2) Go to main forest");
        System.out.println("3) Go to left forest");
        System.out.println("4) go to middle forest");
    }

    public static void middleForestMenu()
    {
        System.out.println("\nYou're in the middle forest");
        System.out.println("You see some shield on the ground");
        System.out.println("Choose what you want to do");
        System.out.println("1) Get shield");
        System.out.println("2) Go to main forest");
        System.out.println("3) Go to right forest");
        System.out.println("4) Go to left forest");

    }

    public static void getMenu(String spot)
    {
        switch(spot)
        {
            case"main":
            {
                mainForestMenu();
                break;
            }
            case"left":
            {
                leftForestMenu();
                break;
            }
            case"right":
            {
                rightForestMenu();
                break;
            }
            case"middle":
            {
                middleForestMenu();
                break;
            }
            default:
            {
                break;
            }
        }
    }

    public static String getSpotOne(String spot)
    {
        switch(spot)
        {
            case"main":
            {
                return "left";
            }
            default:
            {
                return "main";
            }
        }
    }

    public static String getSpotTwo(String spot)
    {
        switch(spot)
        {
            case"right":
            {
                return "left";
            }
            default:
            {
                return "right";
            }
        }
    }

    public static String getSpotThree(String spot)
    {
        switch(spot)
        {
            case"middle":
            {
                return "left";
            }
            default:
            {
                return "middle";
            }
        }
    }

}
