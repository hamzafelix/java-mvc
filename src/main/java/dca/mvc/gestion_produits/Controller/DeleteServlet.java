package dca.mvc.gestion_produits.Controller;

import dca.mvc.gestion_produits.Dao.DaoArticle;
import dca.mvc.gestion_produits.Models.Article;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", urlPatterns = {"/DeleteServlet"})
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Code = request.getParameter( "code");
        Article art = new Article();
        art.setCode(Code);
        DaoArticle.deleteArticle (art);
        request.getRequestDispatcher ( "ArticleServlet").forward (request, response);
    }
}
