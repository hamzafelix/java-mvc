package dca.mvc.gestion_produits.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoFactory {
    private static Connection connexion = null;
    private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url="jdbc:sqlserver://DESKTOP-Q6K3EQS;databaseName=dca;integratedSecurity=true;trustServerCertificate=true;";
    private static void seConnecter()
    {
        try {
            System.out.println("Start of Connection, Loading Driver ... ");
            Class.forName(driver);
            System.out.println(" Driver upload successful");
            connexion= DriverManager.getConnection(url);
            System.out.println("Connection established .. ");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Driver loading problem");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public static Connection getConnection(){
        if(connexion == null)
            seConnecter();
        return connexion;
    }
}

