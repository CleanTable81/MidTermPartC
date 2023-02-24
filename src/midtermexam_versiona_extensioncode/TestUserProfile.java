/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author gamer
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the new user's name:");
        String name = take.next();
        System.out.println("Enter your favourite genre from this list: ");
        for (String each: UserProfile.getGenres()) {
            System.out.println(each);
        }
        String genre = take.next();
        
        UserProfile newUser = new UserProfile(name, genre);
        System.out.println("A new user account has been created!");
        
        take.close();
    }
}
