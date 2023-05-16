package books.fabrics;

import books.Books;
import books.RusNaych;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RuNaychFabric extends BooksFabric {

    public Books CreateRusNaych(){
        String Name = null; String Author = null; String Type = null; String Subject = null;

        try {
            provider.loadFile();                                               //загружаем файл
            Type = provider.getData("Books_ru",3);                   //считываем тип документа (задачник, пособие и тд), специальность и автора
            Subject = provider.getData("Books_ru",4);
            Author = provider.getData("Books_ru",5);
            provider.Close();                                                   //закрываем файл
        } catch (IOException e) {
        }

        return new RusNaych(Type + " " + Subject,Author);
    }
}
