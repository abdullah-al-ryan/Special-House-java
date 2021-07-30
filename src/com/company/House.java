package com.company;

import java.lang.management.MemoryType;

public class House {
    public Room r;
    //public Bath b;
    //public Bed bd;
    //public Kitchen k;
    public Mortgage mg;
    public Mailbox m;

    public House(Room r,Bath b,Bed bd,Kitchen k,Mortgage mg,Mailbox m)
    {
        r.room();
        b.bath();
        bd.bed();
        k.kitch();
        mg.mGage();
        m.mBox();
    }


    public static void main(String[] args)
    {
	    Room ro = new Room();
        Bath b1 = new Bath();
        Bed b2 = new Bed();
        Kitchen k1 = new Kitchen();
        Mortgage m1 = new Mortgage();
        Mailbox m2 = new Mailbox();
	    House h = new House(ro,b1,b2,k1,m1,m2);
    }
}
