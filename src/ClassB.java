public class ClassB extends ClassA {

    public int numberB;
    public String nameB1 = "default";
    private String nameB2 = "default";
    public String nameB3 = "default";

    public int getNumberB() {
        return numberB;
    }
    public void setNumberB(int number) {
        this.numberB = number;
    }
    public void setNameB(String name) {
        this.nameB1 = name;
    }
    private void printDataB(){
        System.out.println(numberB + nameB1);
    }

    private void medtodB1(){}

    private void medtodB2(){}

    private void medtodB3(){}

    private void medtodB4(){}

    private void medtodB5(){}
}
