/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.exception;

/**
 *
 * @author Sanjeev H
 */
public class InvalidLoginCredentials extends Exception {
    public String getmessage(){
        return "Invalid credentials";
    }
}
