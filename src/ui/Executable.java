package ui;

import java.util.Scanner;
import model.Controller;

public class Executable{

    private Scanner reader;
    private Controller control;

    public static void main(String[] args){
        
        Executable exe = new Executable();
        exe.menu();

    }

    public Executable(){

        reader = new Scanner(System.in);
        control = new Controller();

    }

    public void menu(){

        int option = 0;
        do{
        System.out.println("\nWelcome to Icesi Sostenible");
        System.out.println("1) Register evidence");
        System.out.println("2) Modify evidence");
        System.out.println("3) Delete evidence");
		System.out.println("4) Evidence report");
        System.out.println("5) Exit");
        option = reader.nextInt();

        switch(option){

            case 1:
            registerEvidence();
            break;
            case 2:
            modifyEvidence();
            break;
            case 3:
            deleteEvidence();
            break;
			case 4:
            evidenceReport();
            break;
            case 5:
            System.out.println("See you later!");
            break;
            default:
            System.out.println("Type a valid option");
            break;

        }

        }while(option != 5);

    }

	public void registerEvidence() {

      

    }

    public void modifyEvidence(){

       

    }
	
	public void deleteEvidence(){

       

    }   

	public void evidenceReport(){

      

    }




}


