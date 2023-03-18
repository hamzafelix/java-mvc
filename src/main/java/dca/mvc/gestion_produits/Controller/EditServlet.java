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

@WebServlet (name = "EditServlet", urlPatterns = {"/EditServlet"})
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Code = request.getParameter( "Code");
        Article art=DaoArticle.getArticle (Code);
        request.setAttribute( "art", art);
        request.getRequestDispatcher ( "Edit_Article.jsp"). forward (request, response);
    }
}
