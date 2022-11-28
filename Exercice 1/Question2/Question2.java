package ex1.q2;

import java.util.ArrayList;
import java.util.List;

abstract class Didi{
    public String getDetail(){
        return "droite -";
    }
}

class Fifi extends Didi{
    @Override
    public String getDetail() {
        return super.getDetail() + "gauche -";
    }
}

class Nini extends Didi{

     @Override
     public String getDetail() {
         return "milieu -";
     }
}


class Question2 {
    public static void main(String[] args) {
        List<Didi> list;
        list = new ArrayList();
        list.add(new Fifi());
        list.add(new Nini());
            for(Didi d:list)  System.out.print(d.getDetail());


    }
}