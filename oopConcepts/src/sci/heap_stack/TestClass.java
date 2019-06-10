package sci.heap_stack;

public class TestClass {

    public static void main(String args[]) {
        metoda1();

        //primitve data type examples
        int i=5;
        System.out.println("i VALUE BEFORE UPDATE METHOD: " + i);
        updatePrimitiveDataType(i);
        System.out.println("i VALUE AFTER UPDATE METHOD CALL: " + i);
        i = 10;
        System.out.println(i);

        //obiecte - IN METODE SE PASEAZA ADRESA DE MEMORIE A OBIECTULUI
        Notebook notebook = new Notebook();
        notebook.color = "rosu";
        notebook.nrPages = 4;
        System.out.println("NOTEBOOK COLOR BEFORE UPGRADE: " + notebook.color);
        updateNotebookColor(notebook);
        System.out.println("NOTEBOOK COLOR AFTER UPGRADE: " + notebook.color);
    }

    private static void updateNotebookColor(Notebook notebook) {
        notebook.color = "negru";
    }

    private static void updatePrimitiveDataType(int primitiveDataType) {
        System.out.println(primitiveDataType);
        primitiveDataType = 7;
    }


    private static void metoda1() {
        Integer i1 = 127;
        Integer i2 = 127;

//        System.out.println(i1);
//        System.out.println(i1 == i2);
//        System.out.println(i1.equals(i2));


    /*    String a1 = "a";
        String b1 = "b";
        System.out.println(a1 == (b1));*/
/*
        Integer i11 = new Integer(127);
        Integer i22 = new Integer(127);

        System.out.println(i11 == i22);
        System.out.println(i11.equals(i22));*/

        Long i111 = 128L;
        Long i222 = 128L;

        System.out.println(i111);
        System.out.println(i111 == i222);
        System.out.println(i111.equals(i222));


        Notebook notebook1 = new Notebook();
        notebook1.nrPages = 5;
        notebook1.color = "red";

        Notebook notebook2 = new Notebook();
        notebook2.nrPages = 5;
        notebook2.color = "red";

        System.out.println(notebook1);
        System.out.println(notebook1.equals(notebook2));
    }
    //note nr between -128 - 127 are true
}
