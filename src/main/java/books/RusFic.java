/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Пользователь
 */
public class RusFic extends Books {

    private String Author;
    private String Genre;

    public RusFic(String name, String author, String genre) {
        super(name);
        this.Genre = genre;
        this.Author = author;
    }
}
    /*private String genre;

    public RusFic(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String getLanguage() {
        return "Russian";
    }
}

    /*private String title;
    
    public RusFic (String title)
    {
        this.title = title;
        
    }
    
}*/
