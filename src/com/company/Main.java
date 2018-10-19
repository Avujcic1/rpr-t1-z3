package com.company;

public class Main {

    public static class Sat {
        public Integer sati, minute, sekunde;

        Sat(Integer sat, Integer min, Integer sec) {
            this.Postavi(sat, min, sec);
        };

        public void Postavi(Integer sati, Integer minute, Integer sekunde) {
            this.sati = sati;
            this.minute = minute;
            this.sekunde = sekunde;
        };

        public void Sljedeci() {
            sekunde++;
            if(sekunde == 60) {
                sekunde = 0;
                minute++;
            }
            if(minute == 60) {
                minute = 0;
                sati++;
            }
            if(sati == 24) {
                sati = 0;
            }
        };

        public void Prethodni() {
            sekunde--;
            if(sekunde == -1) {
                sekunde = 59;
                minute--;
            }
            if(minute == -1) {
                minute = 59;
                sati--;
            }
            if(sati == -1) {
                sati = 23;
            }
        };

        public void PomjeriZa(Integer pomak) {
            if(pomak > 0) {
                for(Integer i=0; i<pomak; i++) Sljedeci();
            } else {
                for(Integer i=0; i < -1*pomak; i++) Prethodni();
            }
        };

        public Integer DajSate() {
            return this.sati;
        };

        public Integer DajMinute() {
            return this.minute;
        };

        public Integer DajSekunde() {
            return this.sekunde;
        };

        public void Ispisi() {
            System.out.println(sati + ":" + minute + ":" + sekunde);
        };
    }

    public static void main(String[] args) {
        Sat s = new Sat(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();
    }
}
