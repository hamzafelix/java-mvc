package dca.mvc.gestion_produits.Controller;

import dca.mvc.gestion_produits.Dao.DaoArticle;
import dca.mvc.gestion_produits.Models.Article;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddServlet", urlPatterns= {"/AddServlet"})
public class AddServlet extends HttpServlet {
    Article art = new Article();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        art.setCode(request.getParameter ( "code"));
        art.setDesignation (request.getParameter( "designation"));
        art.setPrix (Float.parseFloat(request.getParameter ( "prix")));
        DaoArticle.create(art);
        request.getRequestDispatcher( "ArticleServlet").forward (request, response);
    }
}
