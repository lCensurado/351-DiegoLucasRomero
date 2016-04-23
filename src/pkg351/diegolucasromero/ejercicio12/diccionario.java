/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg351.diegolucasromero.ejercicio12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author android-0174654321
 */
public class diccionario {
    String s,a,b="",i,c="";

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }
    
    
    
    public void buscar(){
       
	
        StringTokenizer st;
	try{
            FileReader f=new FileReader("/home/android-0174654321/Documentos/Dam/programacion/Unidad5/ejercicios/dic/dic.txt");
        //bucle que se ejecutara mientas exista una linea
            BufferedReader bf = new BufferedReader(f); 
            //bucle que se ejecutara mientas exista una linea
            while ((s=bf.readLine())!=null) {
                st=new StringTokenizer(s);
                if(st.nextElement().toString().equalsIgnoreCase(a)){
                   for(int i=0;i<=st.countTokens();i++){
                       b=b+" "+st.nextToken();
                   } 
                  
                   
                    
                    System.out.println(a+b);
                }
                    
                }
            //cerramos el flujo creado por Bufferdreader
            }catch(IOException e){
                
            }finally{
            
        }
    }
    
     public void buscarEsp(){
         StringTokenizer st;
         try{
            FileReader f=new FileReader("/home/android-0174654321/Documentos/Dam/programacion/Unidad5/ejercicios/dic/dic.txt");
        //bucle que se ejecutara mientas exista una linea
            BufferedReader bf = new BufferedReader(f); 
            //bucle que se ejecutara mientas exista una linea
            while ((s=bf.readLine())!=null) { 
                           
                st=new StringTokenizer(s);
                            
                if(s.contains(a)) {
                     b=st.nextToken();
                    System.out.println(s);
                    }
                
                }
             //cerramos el flujo creado por Bufferdreader
            }catch(IOException e){
                
            }finally{            
        }
     }
    
    public static void main(String[] args){      
        diccionario a=new diccionario();
        a.buscar();
    }
    }



    

