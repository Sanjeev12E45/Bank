/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.main;

import com.bank.screens.Login;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Sanjeev H
 */
public class App {
    public static void main(String[] args) {
        
        Thread t = new Thread(){
            @Override
            public void run(){
                
            Login login = new Login();
            login.setVisible(true);
            }
        
            
        };
        t.run();
        
    }
    
}
