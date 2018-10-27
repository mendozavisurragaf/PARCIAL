/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author LaboratorioFISI
 */
public class Fail {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args)
    {
        Map<String,String> telefono = new HashMap<String,String>();
        telefono.put("Apple", "Apple1");
        telefono.put("HTC", "HTC2");
        telefono.put("Samsung","Samsung3");
        
        Iterator iterator = telefono.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(telefono.get(iterator.next()));
            telefono.put("Sony", "Sony Xperia");
        }
        
    }
}
