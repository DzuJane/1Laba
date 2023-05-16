/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mephi_books;

import books.Books;
import books.fabrics.EngNaychFabric;
import books.fabrics.FicFabric;
import books.fabrics.RuNaychFabric;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import users.Students;
import users.Teachers;
import users.UsersFabric;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Пользователь
 */
public class MephiBooks {

    Biblio library;

    public void fill_with_Data(int kol_stud, int kol_tchrs, int kol_eng_fic, int kol_ru_fic, int kol_eng_naych, int kol_ru_naych){
        library = new Biblio();
        UsersFabric userfab = new UsersFabric();
        FicFabric ficfab = new FicFabric();
        EngNaychFabric engnaychfab = new EngNaychFabric();
        RuNaychFabric runaychfab = new RuNaychFabric();

        for (int i = 1; i <= kol_eng_naych; i++){
            Books newbook = engnaychfab.CreateEngNaych();
            library.books_list.add(newbook);
        }
        for (int i = 1; i <= kol_ru_naych; i++){
            Books newbook = runaychfab.CreateRusNaych();
            library.books_list.add(newbook);
        }
        for (int i = 1; i <= kol_eng_fic; i++){
            Books newbook = ficfab.CreateEngFic();
            library.books_list.add(newbook);
        }
        for (int i = 1; i <= kol_ru_fic; i++){
            Books newbook = ficfab.CreateRuFic();
            library.books_list.add(newbook);
        }
//------------------
        for (int i = 1; i <= kol_stud; i++){
            Students newstud = userfab.createStudent();
            newstud.TakeBook(library.books_list);
            library.students_list.add(newstud);
        }
        for (int i = 1; i <= kol_tchrs; i++){
            Teachers newtchr = userfab.createTeacher();
            newtchr.TakeBook(library.books_list);
            library.teachers_list.add(newtchr);
        }
    }

    public TreeNode MainGUI(){
        DefaultMutableTreeNode base = new DefaultMutableTreeNode("Users");
        base.add(library.createTeachersNodes());
        base.add(library.createStudentsNodes());
        return base;
    }
}

