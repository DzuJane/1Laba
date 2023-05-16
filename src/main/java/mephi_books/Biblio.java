package mephi_books;

import books.Books;
import users.Students;
import users.Teachers;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import java.util.ArrayList;

public class Biblio {
    public ArrayList<Students> students_list = new ArrayList<>();
    public ArrayList<Teachers> teachers_list = new ArrayList<>();
    public ArrayList<Books> books_list = new ArrayList<>();

public MutableTreeNode createStudentsNodes() {
    DefaultMutableTreeNode Students_Nodes = new DefaultMutableTreeNode("Students");
    for (Students stud : students_list){
        Students_Nodes.add(stud.getNode());
    }
    return Students_Nodes;
    }

    public MutableTreeNode createTeachersNodes() {
        DefaultMutableTreeNode Teachers_Nodes = new DefaultMutableTreeNode("Teachers");
        for (Teachers techrs : teachers_list){
            Teachers_Nodes.add(techrs.getNode());
        }
        return Teachers_Nodes;
    }

}
