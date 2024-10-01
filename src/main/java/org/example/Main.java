package org.example;

import org.example.modelos.Medicamentp;
import org.example.modelos.Medico;
import org.example.modelos.Paciente;
import org.example.modelos.SignoVital;

public class Main {
    public static void main(String[] args) {

        Paciente Joan = new Paciente();
        Paciente Carlos = new Paciente("78","Carlos","positivo","joanzapata55", "2543256", "medellin", "colombia",19,80,180,false,false,false,false,false);

        System.out.println(Joan);
        System.out.println(Carlos);

        Medico jaime = new Medico();
        Medico matias = new Medico("10","matias","cirujano","matiasmedico09","3117106077", "bogota", "Colombia",10,true,true,"fisica",1000,true,10,"doctorado")
        System.out.println(jaime);
        System.out.println(matias);

        enfermedad covid = new enfermedad();
        enfermedad gripa = new enfermedad("gripa","gripa","afectacion fisica","breve calentamiento ",10,"enfermedad breve",false,false,"jarabe""ninguno");


        System.out.println(covid);
        System.out.println(gripa);

        Medicamentp dolex = new Medicamentp();
        Medicamentp acetaminofen = new Medicamentp("acetaminofen", "acetaminofen","acetaminofen", "principio activo", "tableta", 10, "oral", true, "nignuno", "ninguna");


        System.out.println(dolex);
        System.out.println(acetaminofen);

        SignoVital muerto = new SignoVital();
        SignoVital vivo = new SignoVital("conciente", "ninguna afectacion", 10, 50,20,80,90,20,70,180);

        System.out.println(muerto);
        System.out.println(vivo);
    }
    }



