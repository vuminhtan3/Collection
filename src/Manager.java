import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Contact> contactList;

    public Manager() {
        this.contactList = new ArrayList<Contact>();
    }

    public boolean checkContain(String phoneNumber) {
//        Contact ct = new Contact(phoneNumber);
//        return this.contactList.contains(ct);

        for (Contact contact: contactList) {
            if (contact.getPhoneNumber() == phoneNumber) {
                return true;
            }
        }
        return false;
    }

    public int sizeOfList() {
        return this.contactList.size();
    }

    public void addContact(String name, String phoneNumber) {
        Contact ct = new Contact(name,phoneNumber);
        if (checkContain(phoneNumber)) {
            System.out.println("Danh bạ này đã tồn tại!");
        } else {
            this.contactList.add(ct);
            System.out.println("Đã thêm danh bạ thành công!");
        }
    }
    public void editContact(String phoneNumber, String newNumber) {
        for (Contact contact : contactList) {
            if (checkContain(phoneNumber)) {
                contact.setPhoneNumber(newNumber);
                System.out.println("Đã thay đổi số điện thoại cho tên "+contact.getName());
            }
        }
    }

    public void printContact() {
        for (Contact contact:contactList) {
            System.out.println(contact);
        }
    }

}
