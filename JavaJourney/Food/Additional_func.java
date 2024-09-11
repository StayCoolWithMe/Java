package Food;

import java.util.Random;
import java.util.Scanner;

public class Additional_func {

    public static Random rand=new Random();
    public static Scanner scan=new Scanner(System.in);



    public static boolean is_username_duplicate(String name)
    {
        for(int i=0;i<Variable.create_acc_index;i++)
        {
            User Single_User=User.Users[i];
            if(Single_User.getName().equals(name))
            {
                return true;
            }

        }
        return false;
    }

    public static int unique_id()
    {
        int id=0;
        do{
              id = 1000 + rand.nextInt(9000);
              return id;
        }while(id_existed(id));
    }
    public static boolean id_existed(int id)
    {
        for(int i=0;i<Variable.create_acc_index;i++)
        {
            User Single_User=User.Users[i];
            if(Single_User.getId()==id)
            {
                return true;
            }

        }
        return false;
    }

    public static float get_valid_amount(String prompt)
    {
        while (true) {
            System.out.printf(prompt);
            try
            {
                String input=scan.nextLine().trim();
                float amount=Float.parseFloat(input);
                if(amount>0)
                {
                   return amount;
                }
                else{
                    System.out.printf("Amount cannot be lower or equal to zero, please enter another one: ");
                    
                }

            }
            catch(NumberFormatException e)
            {
                System.out.println("Unvalid amount, please enter another proper amount: ");
                continue;
            }
            
        }
    }
}
