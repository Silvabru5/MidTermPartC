/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class TestUserprofile {
    public static void main (String[] args){
    
    String userName = " ";
    String genre = " ";
    
    userInfos(userName,genre);
}
    public static void userInfos (String userName, String genreOfChoice){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        userName = sc.nextLine();
        System.out.println("What is your favourite genre (Comedy, Action, Drama, Mystery)");
        genreOfChoice = sc.nextLine();
        System.out.println("Your account has been created under the name " + userName + "and genre" + genreOfChoice);
    }
}
