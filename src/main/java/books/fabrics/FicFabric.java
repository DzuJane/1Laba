/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit template
 */
package books.fabrics;

import books.Books;
import books.EngFic;
import books.RusFic;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Пользователь
 */
public class FicFabric extends BooksFabric {

    public Books CreateRuFic(){
        String Name = null; String Author = null; String Genre = null;

        try {
            provider.loadFile();                                                                //загружаем файл
            Name = provider.getData("Books_ru",0);                                    //считываем название, атвора и жанр
            Author = provider.getData("Books_ru",1);
            Genre = provider.getData("Books_ru",2);
            provider.Close();
        } catch (IOException e) {
        }
        return new RusFic(Name,Author,Genre);
    }

    public Books CreateEngFic(){
        String Name = null; String Author = null; String Genre = null;

        try {
            provider.loadFile();                                                               //загружаем файл
            Name = provider.getData("Books_en",0);                                   //считываем название, автора и жанр
            Author = provider.getData("Books_en",1);
            Genre = provider.getData("Books_en",2);
            provider.Close();                                                                  //закрываем файл
        } catch (IOException e) {
        }
        return new EngFic(Name,Author,Genre);
    }
}
