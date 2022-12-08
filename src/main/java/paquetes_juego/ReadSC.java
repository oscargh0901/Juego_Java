/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetes_juego;

import java.io.IOException;

/**
 *
 * @author CodeWithDaro
 */
public class ReadSC {
    
    private final static java.io.BufferedReader sc = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    
    public static String readString(String content)
    {
        String result = null;
        
        do{
            try
            {
                System.out.print(content);
                result = sc.readLine();
            }
            catch(IOException e)
            {
                return "";
            }
        }while(result == null);
        
        return result;
    }
    
    public static int readInteger(String content)
    {
        int result = 0;
        boolean isInteger = false;
        
        while(!isInteger)
        {
            try
            {
                result = Integer.parseInt(readString(content));
                isInteger = true;
            }
            catch(NumberFormatException e)
            {
                System.err.println("¡Error! Introduce una cantidad numerica.");
            }
        }
        
        return result;
    }
}
