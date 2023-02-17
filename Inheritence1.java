public class Inheritence1 {
    String name;
    static String school;
    public void chageSchool(){
        school="new-School";
    }
}
 class OOP {
    public static void main(String[] args) {
        Inheritence1.school="Abu Al Shahruar School";
        Inheritence1 in_1=new Inheritence1();
        in_1.name="Rifat";
        System.out.println(in_1.school);
    }
}
