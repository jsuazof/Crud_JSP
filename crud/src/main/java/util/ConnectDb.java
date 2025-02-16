package util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectDb {

    //atributos
    static int port = 3306;
    static String nameDb = "java_curso";
    //locahost equivale 127.0.0.1
    private final static String URL =
            "jdbc:mysql://localhost:"+port+"/"+nameDb;
    //localhost:8889/tiendaE
    private static String user="root"; //bd usuario
    private static String pass = "@Desafio2020"; //pass usuario bd

    private static BasicDataSource pool;
    /*pool: es un objeto que almacenará todos las configuraciones
     para conectar a la base de datos

     */

    //metodos

    public static BasicDataSource getPool() throws SQLException
    {
        if(pool==null)
        {
            pool= new BasicDataSource(); //creando un objeto
            pool.setUrl(URL); //envia URL como ruta de acceso
            pool.setUsername(user); //enviar usuario de la BD
            pool.setPassword(pass);//enviar password usuario BD
            pool.setInitialSize(3); //valor de los parámetros iniciales que recibirá
            pool.setMinIdle(3); // establece tiempo minimo de 3 segundos de espera
            pool.setMaxIdle(10);// establece tiempo maximo de 10 segundos de espera


        }
        return pool;

    }

    public static Connection getConexion() throws SQLException {
        return getPool().getConnection(); //retornar una conexion
    }
}
