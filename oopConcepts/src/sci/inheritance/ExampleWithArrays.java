package sci.inheritance;

public class ExampleWithArrays {
    public static void main(String args[]) {

        int dataPrimitiva;

        exampleWithArray();

        exampleWithArrayObject();

        exampleWithDeleteElementFromArray();
    }



    private static void exampleWithArray() {
        int [] sirDeNumere = new int [5];
        sirDeNumere[0] = 5;
        sirDeNumere[1] = 3;
        sirDeNumere[2] = 6;
        sirDeNumere[3] = 4;
        sirDeNumere[4] = 7;
        int a=sirDeNumere[0];

        for(int i=0; i<sirDeNumere.length; i++) {
            System.out.println(sirDeNumere[i]);
        }


        int [] sirNumerePredef = {3, 4, 8};
        System.out.println(sirNumerePredef[1]);
    }


    private static void exampleWithArrayObject() {
        Shape[] sirDeForme = new Shape[5] ;
        sirDeForme[0] = new Circle(2);
        sirDeForme[1] = new Circle(4);
        sirDeForme[2] = new Triangle( 3,4,5);
        sirDeForme[3] = new Rectangle( 2,5);
        sirDeForme[4] = new Triangle( 2,5,7);

        for(int i=0; i<sirDeForme.length; i++) {
            System.out.println(sirDeForme[i].displayShapeName());
        }

    }


    private static void exampleWithDeleteElementFromArray() {
        String[] sirString = {"a" , "b", "c", "d", "e"};
        String[] newArrayCopy = new String[5];

        for (int i=0; i<sirString.length;i++){
            if (i!=2 && i<newArrayCopy.length){
                newArrayCopy[i] = sirString[i];
                System.out.println(newArrayCopy[i]);
            }

        }


    }


}
