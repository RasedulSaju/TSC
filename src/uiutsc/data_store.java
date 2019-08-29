package uiutsc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shahadat Modified by Rasedul
 */
public class data_store {

    String id, name, course, trimester,uid, pass;

    data_store(String id, String name, String course_code, String trimester, String uid, String Password) {
        this.id = id;
        this.name = name;
        this.course = course_code;
        this.trimester = trimester;
        this.uid = uid;
        this.pass = Password;
    }
    String f1 = "student_data.txt";
    String f2 = "password.txt";
    String f3 = "name.txt";
    String f4 = "teacher_data.txt";
    String f5 = "tpassword.txt";
    String f6 = "tname.txt";
    File f11 = new File(f1);
    File f22 = new File(f2);
    File f33 = new File(f3);
    File f44 = new File(f4);
    File f55 = new File(f5);
    File f66 = new File(f6);
    FileWriter fw1 = null;
    FileWriter fw2 = null;
    FileWriter fw3 = null;
    FileWriter fw4 = null;
    FileWriter fw5 = null;
    FileWriter fw6 = null;
    BufferedWriter bw1 = null;
    BufferedWriter bw2 = null;
    BufferedWriter bw3 = null;
    BufferedWriter bw4 = null;
    BufferedWriter bw5 = null;
    BufferedWriter bw6 = null;
    
    void Update() {
        switch (id) {
            case "1":
                if (f11.length() == 0)
                {
                    try{
                        fw1 = new FileWriter(f11);
                        bw1 = new BufferedWriter(fw1);
                        {
                            bw1.write(". " + name);
                            bw1.newLine();
                            bw1.write(", " + course);
                            bw1.newLine();
                            bw1.write("," + trimester);
                            bw1.newLine();
                            bw1.write("," + uid);
                            bw1.newLine();
                        }
                    }
                
                    catch (IOException e) {
                        System.out.println("vul hoise" + e.getMessage());
                    } 
                    finally {
                        
                        try {
                            
                            if (bw1 != null)
                                bw1.close();
                            
                            if (fw1 != null)
                                fw1.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error" + e.getMessage());
                            
                        }
                    }                      
                    
                    
                }
                
                else if (f11.length() != 0) {
                    
                    try {
                        fw1 = new FileWriter(f11, true);
                        bw1 = new BufferedWriter(fw1);
                        bw1.append(". " + name);
                        bw1.newLine();
                        bw1.append(", " + course);
                        bw1.newLine();
                        bw1.append("," + trimester);
                        bw1.newLine();
                        bw1.append("," + uid);
                        bw1.newLine();
                    } catch (IOException ex) {
                        System.out.println("error" + ex.getMessage());
                    }
                    finally {
                        
                        try {
                            
                            if (bw1 != null)
                                bw1.close();
                            
                            if (fw1 != null)
                                fw1.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error" + e.getMessage());
                            
                        }
                    }
                }
                if (f22.length() == 0) {
                    try {
                        fw2 = new FileWriter(f22);
                        bw2 = new BufferedWriter(fw2);
                        bw2.write(uid + "," + pass);
                        bw2.newLine();
                    } catch (IOException ex) {
                        System.out.println("error" + ex.getMessage());
                    }
                    finally {
                        
                        try {
                            
                            if (bw2 != null)
                                bw2.close();
                            
                            if (fw2 != null)
                                fw2.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error" + e.getMessage());
                            
                        }
                    }
                }
                else if (f22.length() != 0) {
                    try {
                        fw2 = new FileWriter(f22, true);
                        bw2 = new BufferedWriter(fw2);
                        bw2.append(uid + "," + pass);
                        bw2.newLine();
                    } catch (IOException ex) {
                        System.out.println("error" + ex.getMessage());
                    }
                    finally {
                        
                        try {
                            
                            if (bw2 != null)
                                bw2.close();
                            
                            if (fw2 != null)
                                fw2.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error" + e.getMessage());
                            
                        }
                    }
                }
                if (f33.length() == 0) {
                    try {
                        fw3 = new FileWriter(f33);
                        bw3 = new BufferedWriter(fw3);
                        bw3.write(name);
                        bw3.newLine();
                        bw3.close();
                    } catch (IOException ex) {
                        System.out.println("error" + ex.getMessage());
                    }
                    finally {
                        
                        try {
                            
                            if (bw3 != null)
                                bw3.close();
                            
                            if (fw3 != null)
                                fw3.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error" + e.getMessage());
                            
                        }}
                } else if (f33.length() != 0) {
                       try {
                           fw3 = new FileWriter(f33, true);
                           bw3 = new BufferedWriter(fw3);
                           bw3.append(name );
                           bw3.newLine();
                           bw3.close();
                       } catch (IOException ex) {
                          System.out.println("error" + ex.getMessage());
                       }
                       finally {

			try {

				if (bw3 != null)
					bw3.close();

				if (fw3 != null)
					fw3.close();

}
                 catch(IOException e)
                 {
                     System.out.println("error" + e.getMessage());
                     
                 }}
            }   break;
            case "2":
                
                 if (f44.length() == 0)
                {
                    try{
                        fw4 = new FileWriter(f44);
                        bw4 = new BufferedWriter(fw4);
                        {
                            bw4.write(". " + name);
                            bw4.newLine();
                            bw4.write(", " + course);
                            bw4.newLine();
                            bw4.write("," + trimester);
                            bw4.newLine();
                            bw4.write("," + uid);
                            bw4.newLine();
                        }
                    }
                
                    catch (IOException e) {
                        System.out.println("vul hoise" + e.getMessage());
                    } 
                    finally {
                        
                        try {
                            
                            if (bw4 != null)
                                bw4.close();
                            
                            if (fw4 != null)
                                fw4.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error from tname" + e.getMessage());
                            
                        }
                    }                      
                    
                    
                }
                
                else if (f44.length() != 0) {
                    
                    try {
                        fw4 = new FileWriter(f44, true);
                        bw4 = new BufferedWriter(fw4);
                        bw4.append(". " + name);
                        bw4.newLine();
                        bw4.append(", " + course);
                        bw4.newLine();
                        bw4.append("," + trimester);
                        bw4.newLine();
                        bw4.append("," + uid);
                        bw4.newLine();
                    } catch (IOException ex) {
                        System.out.println("error" + ex.getMessage());
                    }
                    finally {
                        
                        try {
                            
                            if (bw4 != null)
                                bw4.close();
                            
                            if (fw4 != null)
                                fw4.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error" + e.getMessage());
                            
                        }
                    }
                }
                if (f55.length() == 0) {
                    try {
                        fw5 = new FileWriter(f55);
                        bw5 = new BufferedWriter(fw5);
                        bw5.write(uid + "," + pass);
                        bw5.newLine();
                    } catch (IOException ex) {
                        System.out.println("error" + ex.getMessage());
                    }
                    finally {
                        
                        try {
                            
                            if (bw5 != null)
                                bw5.close();
                            
                            if (fw5 != null)
                                fw5.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error" + e.getMessage());
                            
                        }
                    }
                }
                else if (f55.length() != 0) {
                    try {
                        fw5 = new FileWriter(f55, true);
                        bw5 = new BufferedWriter(fw5);
                        bw5.append(uid + "," + pass);
                        bw5.newLine();
                    } catch (IOException ex) {
                        System.out.println("error" + ex.getMessage());
                    }
                    finally {
                        
                        try {
                            
                            if (bw5 != null)
                                bw5.close();
                            
                            if (fw5 != null)
                                fw5.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error" + e.getMessage());
                            
                        }
                    }
                }
                if (f66.length() == 0) {
                    try {
                        fw6 = new FileWriter(f66);
                        bw6 = new BufferedWriter(fw6);
                        bw6.write(name);
                        bw6.newLine();
                        bw6.close();
                    } catch (IOException ex) {
                        System.out.println("error" + ex.getMessage());
                    }
                    finally {
                        
                        try {
                            
                            if (bw6 != null)
                                bw6.close();
                            
                            if (fw6 != null)
                                fw6.close();
                            
                        }
                        catch(IOException e)
                        {
                            System.out.println("error" + e.getMessage());
                            
                        }}
                } else if (f66.length() != 0) {
                       try {
                           fw6 = new FileWriter(f66, true);
                           bw6 = new BufferedWriter(fw6);
                           bw6.append(name );
                           bw6.newLine();
                           bw6.close();
                       } catch (IOException ex) {
                          System.out.println("error" + ex.getMessage());
                       }
                       finally {

			try {

				if (bw6 != null)
					bw6.close();

				if (fw6 != null)
					fw6.close();

}
                 catch(IOException e)
                 {
                     System.out.println("error" + e.getMessage());
                     
                 }}
            }
                
                
                break;
        }
        
    }
    }

