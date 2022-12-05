public class Main {
    public static void main(String[] args) {
         Manager mng = new Manager();
         mng.addContact("Tan", "0367858046");
         System.out.println(mng.checkContain("0367858046"));
         System.out.println(mng.sizeOfList());
         mng.addContact("Gam", "0367858046");
         mng.addContact("Gam","0376740007");
         System.out.println(mng.sizeOfList());
         mng.printContact();
         mng.editContact("0367858046", "0300678678");
         mng.printContact();
         String s="abc345";
         String s2="abc345";
         System.out.println(s==s2);
    }
}