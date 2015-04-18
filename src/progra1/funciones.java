/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1;

/**
 *
 * @author CarlosMario
 */
public class funciones {
    
    public static boolean ValidarEmail(String strEmail)
        {
        return strEmail.matches("^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,4}$");
        }
    
}
