/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.Menu;

public class EnterSystem {
    Menu menu = new Menu();
    Login login = new Login();
    public void runSystem(){
        menu.setVisible(true);
        login.setVisible(false);
}
}
