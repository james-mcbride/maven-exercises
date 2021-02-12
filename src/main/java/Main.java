import com.github.javafaker.Faker;
import com.github.javafaker.HowIMetYourMother;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter anything below");
//        String response = scanner.nextLine();
//        System.out.println("You entered: "+ response);
//
//        if (StringUtils.isNumeric(response)){
//            System.out.println(response+" is a number!");
//        } else{
//            System.out.println(response+" is not a number");
//        }
//        System.out.println(StringUtils.swapCase(response));
//        System.out.println(StringUtils.reverse(response));

        Faker faker = new Faker();

//        System.out.println(faker.howIMetYourMother().character());
        System.out.println(faker.funnyName().name());
        String name = "Jimmie McBride";
        Pattern pattern = Pattern.compile("Jimmie", Pattern.CASE_INSENSITIVE);
        System.out.println(Arrays.toString(name.split(" ", 0)));


    }
}
