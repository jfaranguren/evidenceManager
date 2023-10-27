package model;

import java.util.Calendar;

public class Controller {
    
    private Project[] projects;

    public Controller(){

        projects = new Project[40];
        testCases();

    }

    public void testCases(){

        Project p1 = new Project(true, "Recuperacion del humedal", "Limpieza del agua", Calendar.getInstance(), Calendar.getInstance());
        Project p2 = new Project(true, "Cero papel", "Reducir el uso de papel en el campus", Calendar.getInstance(), Calendar.getInstance());
        Project p3 = new Project(false, "Reciclaje de aceite", "Recoleccion y venta de aceite de cocina", Calendar.getInstance(), Calendar.getInstance());

        projects[0] = p1;
        projects[1] = p2;
        projects[2] = p3;

    }

    public String projectList(){

        String result = "";

        for(int i =0; i<projects.length;i++){
            
            if(projects[i] != null){
            result+= "\n"+(i+1)+". "+projects[i].getName();
           
            }
        }

        return result;

    }



}
