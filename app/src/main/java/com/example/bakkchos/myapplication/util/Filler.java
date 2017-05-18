/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bakkchos.myapplication.util;

import java.util.ArrayList;

/**
 *
 * @author bakkchos
 */
public class Filler {
    private final ArrayList<Subject> lista = new ArrayList<>();
    private final ArrayList<Subject> day_list = new ArrayList<>();
    private static final String PON = "PONIEDZIALEK";
    private static final String WT = "WTOREK";
    private static final String SR = "SRODA";
    private static final String CZW = "CZWARTEK";
    private static final String PT = "PIATEK";

    public Filler() {
        
    }
    
    private void addSubject(String dzien,String godzina, String grupa, String nazwa_przedmiotu,String prowadzacy,String sala, String typ_zajec){
        Subject e = new Subject();
        e.setDzien(dzien);
        e.setGodzina(godzina);
        e.setGrupa(grupa);
        e.setNazwa_przedmiotu(nazwa_przedmiotu);
        e.setProwadzacy(prowadzacy);
        e.setSala(sala);
        e.setTyp_zajec(typ_zajec);
        this.lista.add(e);
    }
    public void fillSchedule(){
        this.addSubject(WT,"08:00","ALL", "Techniki Multimedialne", "prof. dr hab. inż. M. Gorgoń", "C202", "W");
        this.addSubject(WT,"09:45","LT1", "Techniki Multimedialne", "mgr inż. M. Bydłosz", "D104", "L");
        this.addSubject(WT,"11:30","PZ1", "Zespołowy Projekt \nInformatyczny", "dr inż S. Stoch", "D106", "P");
        this.addSubject(WT,"13:15","LT2", "Techniki Multimedialne", "mgr inż. M. Bydłosz", "D104", "L");
        this.addSubject(WT,"15:00","PZ2", "Zespołowy Projekt \nInformatyczny", "dr inż S. Stoch", "D106", "P");
        this.addSubject(WT,"16:45","C1", "Techniki Multimedialne", "prof. dr hab. inż. M. Gorgoń", "C202", "C");
        
        this.addSubject(SR,"08:00","ALL", "Testowanie i jakość \noprogramowania", "mgr inż A. Pyteraf", "C202", "W");
        this.addSubject(SR,"09:45","LI1", "Testowanie i jakość \noprogramowania", "mgr inż A. Pyteraf", "C112", "L");
        this.addSubject(SR,"09:45","LA2", "Technologie aplikacji \ninternetowych", "mgr inż R. Jędryka", "A203", "L");
        this.addSubject(SR,"11:30","LI2", "Testowanie i jakość \noprogramowania", "mgr inż A. Pyteraf", "C112", "L");
        this.addSubject(SR,"11:30","LA1", "Technologie aplikacji \ninternetowych", "mgr inż R. Jędryka", "A203", "L");
        this.addSubject(SR,"13:15","ALL", "Technologie aplikacji \ninternetowych", "mgr inż R. Jędryka", "A120", "W");
        this.addSubject(SR,"13:15","PA1", "Technologie aplikacji \ninternetowych", "mgr inż R. Jędryka", "C112", "P");
        
        this.addSubject(CZW,"08:00","LM1", "Programowanie systemów \nmobilnych", "mgr inż A. Pieprzycki", "C212", "L");
        this.addSubject(CZW,"08:00","PA2", "Technologie aplikacji \ninternetowych", "mgr inż R. Jędryka", "C112", "P");
        this.addSubject(CZW,"09:45","ALL", "Programowanie gier", "dr inż. P. Pawlik", "C302", "W");
        this.addSubject(CZW,"11:15","ALL", "Programowanie systemów \nmobilnych", "mgr inż. A. Pieprzycki", "C206", "W");
        this.addSubject(CZW,"13:15","LM2", "Programowanie systemów \nmobilnych", "mgr inż A. Pieprzycki", "C212", "L");
        this.addSubject(CZW,"13:15","LG1", "Programowanie gier", "dr inż. P. Pawlik", "C112", "L");
        this.addSubject(CZW,"16:45","LG2", "Programowanie gier", "dr inż. P. Pawlik", "C112", "L");
        
        this.addSubject(PT,"08:00","ALL", "Modelowanie procesów \nbiznesowych", "mgr inż T. Potempa", "C202", "W");
        this.addSubject(PT,"09:45","LB1", "Modelowanie procesów \nbiznesowych", "mgr inż T. Potempa", "C112", "L");
        this.addSubject(PT,"11:30","LB2", "Modelowanie procesów biznesowych", "mgr inż T. Potempa", "C112", "L");
        this.addSubject(PT,"12:30","LK1", "Kryptografia i \nbezpieczeństwo sieci", "dr inż W. Iwaniec", "C105", "L");
        this.addSubject(PT,"14:45","ALL", "Kryptografia i \nbezpieczeństwo sieci", "dr inż W. Iwaniec", "C306", "W");
        this.addSubject(PT,"16:00","LK2", "Kryptografia i \nbezpieczeństwo sieci", "dr inż W. Iwaniec", "C105", "L");
        
        
    }
    public ArrayList<Subject> listOfSubjects(){
        return this.lista;
    }
    public ArrayList<Subject> listOrderByDay(String day){
        for(Subject x : lista){
            if(x.getDzien().contains(day)){
                day_list.add(x);
            }
        }
        return this.day_list;
    }
    
    
}
