/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Пользователь
 */
public class EngNaych extends Books{

    private String Author;
    private String University;
    private String Degree;
    
    public EngNaych (String name,  String author, String university,String degree)
    {
        super(name);
        this.Author = author;
        this.University = university;
        this.Degree = degree;
    }

}
