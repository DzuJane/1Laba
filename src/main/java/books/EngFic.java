/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Пользователь
 */
public class EngFic extends Books{

    private String Author;
    private String Genre;
    public EngFic(String name, String author, String genre) {
        super(name);                    // вызов конструктора суперкласса, т.е. берём данные из родительского класса
        this.Genre = genre;
        this.Author = author;
    }  
}



    
   /* public EngFic (String title)
    {
        this.title = title;
        

    
}
**/