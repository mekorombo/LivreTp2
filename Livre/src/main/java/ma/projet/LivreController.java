package ma.projet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LivreController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LivreController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titre = request.getParameter("titre");
        String categorie = request.getParameter("categorie");
        int isbn = Integer.parseInt(request.getParameter("isbn"));
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Confirmation</title></head><body>");
        out.println("<h1>Validation d'un livre</h1>");
        out.println("<h2>Le livre</h2>");
        out.println("Titre : " + titre + "<br>");
        out.println("Catégorie : " + categorie + "<br>");
        out.println("ISBN : " + isbn + "<br>");

        out.println("<h2>L'auteur</h2>");
        out.println("Nom : " + nom + "<br>");
        out.println("Prénom : " + prenom + "<br>");
        out.println("</body></html>");
    }
}