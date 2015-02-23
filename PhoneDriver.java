public class PhoneDriver {
  public static void main(String[] args) {
	Phone myPhone = new Phone();
	System.out.println(myPhone.toString());

	Phone anotherPhone = new Phone("Samsung", "Galaxy S3", 3);
	System.out.println(anotherPhone.toString());
	}
}
