import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public class MiniOla {

	public static void main(String[] args) {
		String crtphonenum = "9715469917";
		String crtpassword = "Sai_baba";
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE MOBILE NUMBER");
		String phno = sc.nextLine();
		System.out.println("ENTER THE PASSWORD");
		String password = sc.nextLine();
		if (phno.equals(crtphonenum) &&  password.equals(crtpassword) )
		{
			System.out.println("SUBMIT");

			String  [] cabtypes = new String[3];
			cabtypes[0] = "micro";
			cabtypes[1] = "mini";
			cabtypes[2] = "prime";
			System.out.println("CAR TYPES");
			System.out.println(Arrays.toString(cabtypes));
			System.out.println("Enter The Type Of Car");
			String type = sc.nextLine();
			System.out.println("ENTER THE KILOMETER");
			int km = sc.nextInt();
			int  amt = 0;
			double total;
			double gst = 0.07;
			double gstamt ;
			if (type.equals("micro"))
			{
				amt = km*10;
				gstamt = amt*gst;
				
				total = amt + gstamt; 
			}
			else if (type.equals("mini"))
			{
				amt = km*15;
				gstamt = amt*gst;
				
				total = amt + gstamt;
			}
			else
			{
				amt= km*20;
                gstamt = amt*gst;
				
				total = amt + gstamt;
			}
			System.out.println("The Total to be paid is  " + total);	
			LocalDate date = LocalDate.now();
			LocalTime time = LocalTime.now();
			System.out.println("The Date  is " + date  );
			System.out.println("The Time is " + time);
			LocalTime time1 = LocalTime.of(17,0,0);
			LocalTime time2 = LocalTime.of(19,0,0);
			if ((time1 .isAfter(time)) && (time1.isBefore(time)))
			{
				System.out.println("due to peak hours");
				double peaktotal = total*1.25; 
				System.out.println("New Total is " + peaktotal);
			}
				}
			
		
		else
		{
			System.out.println("Invalid phone number or password");
		}
			
			}

	private static int gethour(LocalTime time) {
		// TODO Auto-generated method stub
		return 0;
	}
		}
