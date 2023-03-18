package dca.mvc.gestion_produits.Models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    private String code;

    private String designation;

    private Float prix;
    @Override
    public boolean equals (Object obj) {
        if (obj instanceof Article)
        {
            return ((Article) obj).code.equals(code);
        }
        return false;
    }
}