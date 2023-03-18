package dca.mvc.gestion_produits.Dao;

import dca.mvc.gestion_produits.Models.Article;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoArticle {
    private static Connection Mycon = DaoFactory.getConnection();;

    public DaoArticle() {

    }

    public static void create(Article article) {
        String Requete;
        Requete = " INSERT INTO article (code , designation, prix) VALUES (?,?,?)";
        PreparedStatement Pst;
        try {
            Pst=Mycon.prepareStatement(Requete);
            Pst.setString(1,article.getCode());
            Pst.setString(2,article.getDesignation());
            Pst.setFloat(3,article.getPrix());
            int Ligne = Pst.executeUpdate();
            if (Ligne==1)
                System.out.println("Article added with success");
            else
                System.out.println("Article added Failed !!!");

        }catch (SQLException exception){
            System.out.println("Problem to app Query : " + exception.getMessage());
        }
    }

    public static List<Article> getAll(){
        String Requete;
        List<Article> LesArticles = new ArrayList<Article>();
        Requete = "Select * from article";
        Statement St;
        try{
            St=Mycon.createStatement();
            ResultSet rs = St.executeQuery(Requete);
            System.out.println("LISTE DES ARTICLES :");
            while (rs.next()){
                LesArticles.add(new Article( rs.getString(1),rs.getString(2), rs.getFloat(3)));
            }
            return LesArticles;
        }catch (SQLException exception){
            return null;
        }

    }

    public static void updateArticle (Article article){
        String Requete = "update article set designation = ? , prix = ? where code = ?";
        PreparedStatement Pst;
        try {
            Pst=Mycon.prepareStatement(Requete);
            Pst.setString(1,article.getDesignation());
            Pst.setString(3,article.getCode());
            Pst.setFloat(2,article.getPrix());

            int Ligne = Pst.executeUpdate();
            if (Ligne==1)
                System.out.println("Article added with success");
            else
                System.out.println("Article added Failed !!!");

        }catch (SQLException exception){
            System.out.println("Problem to app Query : " + exception.getMessage());
        }
    }

    public static void deleteArticle(Article article) {
        String Requete = "delete article where code = ?";
        PreparedStatement pst;
        try{
            pst=Mycon.prepareStatement(Requete);
            pst.setString(1,article.getCode());
            pst.executeUpdate() ;
        }catch (Exception ex){
            System.out.println(ex.getMessage());}

    }

    public static Article getArticle(String code) {
        String Requete;
        Article result  = null;
        Requete = "Select * from article where code = '"+code+"'";
        Statement St;
        try{
            St=Mycon.createStatement();
            ResultSet rs = St.executeQuery(Requete);
            System.out.println("LISTE DES ARTICLES :");
            if (rs.next()) {
                result = new Article(rs.getString(1), rs.getString(2), rs.getFloat(3));
            }
        }catch (SQLException exception){
        }
        return result;
    }
}
