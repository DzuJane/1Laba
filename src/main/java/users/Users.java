/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import books.Books;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Пользователь
 */
public abstract class Users {
    private String Name;
    private ArrayList<Books> taken_books = new ArrayList<>();
    public Users (String Name){
        this.Name = Name;
    }
    public String getUserName() {
        return Name;
    }

    public void TakeBook(ArrayList<Books> book) {
        ArrayList<Books> booklist = new ArrayList<>(book);
        Random random = new Random();
        int kol_books = random.nextInt(7) + 3;
        for (int i = 1; i <= kol_books; i++) {
            int num = random.nextInt(booklist.size() - 1);
            this.taken_books.add(booklist.get(num));
            booklist.remove(num);
        }
    }
    public MutableTreeNode getNode(){
            DefaultMutableTreeNode Node = new DefaultMutableTreeNode(Name);
            for (Books taken_book : taken_books)
                Node.add(new DefaultMutableTreeNode(taken_book.getName()));
            return Node;
    }

    public void setName(String name) {
        this.Name = name;
    }

}
