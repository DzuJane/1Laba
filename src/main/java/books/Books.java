/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Пользователь
 */
public  abstract class Books {
    private String Name;             // переменная для названия книги
    
    public Books(String name) {          // записываем название книги
        this.Name = name;
    }

    public String getName() {        //
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    
}
    /*protected String title;
    protected String author;
    

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
       
    }
    public abstract String getGenre();
    public abstract String getLanguage();
}
*/
