package dca.mvc.gestion_produits.Controller;

import dca.mvc.gestion_produits.Dao.DaoArticle;
import dca.mvc.gestion_produits.Models.Article;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ArticleServlet",urlPatterns = {"/ArticleServlet"})
public class ArticleServlet extends HttpServlet {

    List<Article> LesArticles ;
    @Override
    public void init() throws ServletException {
        LesArticles = DaoArticle.getAll();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute(  "MaListe", LesArticles);
        request.getRequestDispatcher ( "List-Articles.jsp").forward (request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
