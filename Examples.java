import java.util.GregorianCalendar;
import java.util.LinkedList;

import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {
    Time midnight = new Time(0,0);
    Time time1 = new Time(0,30);
    Time time2 = new Time(1,0);
    Time time3 = new Time(2,30);
    Time time4 = new Time(3, 27);
    Time time5 = new Time(7,30);
    Time noon = new Time(12,0);
    Time time6 = new Time(23,59);




    GregorianCalendar jan1 = new GregorianCalendar(2000, 0, 1);
    GregorianCalendar jan2 = new GregorianCalendar(2000,0,2);
    GregorianCalendar jan3 = new GregorianCalendar(2000,0,3);
    GregorianCalendar may5 = new GregorianCalendar(2001,4,5);
    GregorianCalendar may6 = new GregorianCalendar(2001, 4,6);
    GregorianCalendar aug15 = new GregorianCalendar(1997, 7, 15);
    GregorianCalendar aug16 = new GregorianCalendar(1997,7,16);
    GregorianCalendar oct29 = new GregorianCalendar(1942,9,29);



    Reading reading1 = new Reading(midnight,0,0 );
    Reading reading2 = new Reading(midnight, 32, 0);
    Reading reading3 = new Reading(time1, 32, 5);
    Reading reading4 = new Reading(time1, 32, 0);
    Reading reading5 = new Reading(time2, 50,11);
    Reading reading6 = new Reading(time3, 75,100);
    Reading reading7 = new Reading(time4, -50,0);
    Reading reading8 = new Reading(time4, 50,10);
    Reading reading9 = new Reading(time5, 100,100);
    Reading reading10 = new Reading(noon, -15,10);
    Reading reading11 = new Reading(noon, 115,0);
    Reading reading12 = new Reading(time6, 0, 0);
    Reading reading13 = new Reading(time6, 15,15);






    LinkedList<Reading> list1 = new LinkedList<Reading>();
    LinkedList<Reading> list2 = new LinkedList<Reading>();
    LinkedList<Reading> list3 = new LinkedList<Reading>();

    WeatherMonitor day1 = new WeatherMonitor();



    public Examples() {
        list1.add(reading1);
        list1.add(reading2);
        list1.add(reading3);
        list1.add(reading4);















    }

    @Test
    public void test1(){
        assertEquals(0,day1.totalRainfallForMonth(0,2000),.001);
    }






}
