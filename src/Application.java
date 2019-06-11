public class Application {


    public static void main(String[] args) {


       Drawing dr = new Drawing();


            dr.setShape( new Triangle() );
      
            dr.drawShape();

    }


   static public  void myDrawMethod( Shape shape ){


        shape.draw();



    }


}
