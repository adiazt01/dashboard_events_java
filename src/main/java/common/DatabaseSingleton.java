package common;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

/**
 *
 * @author armando
 */
public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private Jbdi jdbi;
    
    private DatabaseSingleton () {
        jdbi = Jdbi.create("jdbc:h2:~/test");
        jdbi.installPlugin(new SqlObjectPlugin());
        
    }
}
