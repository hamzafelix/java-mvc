package dca.mvc.gestion_produits.Controller;

import dca.mvc.gestion_produits.Dao.DaoArticle;
import dca.mvc.gestion_produits.Models.Article;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet", urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Article art = new Article();
        art.setCode(request.getParameter( "code"));
        art.setDesignation (request.getParameter( "designation"));
        art.setPrix (Float.parseFloat(request.getParameter( "prix"))); DaoArticle.updateArticle (art);
        request.getRequestDispatcher( "ArticleServlet").forward (request, response);
}
}

