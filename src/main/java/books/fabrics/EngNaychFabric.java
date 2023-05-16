package books.fabrics;

import books.Books;
import books.EngNaych;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EngNaychFabric extends BooksFabric {

    public Books CreateEngNaych(){
        String Name = null; String Author = null; String University = null; String Degree = null;

        try {
            provider.loadFile();                                                                        //открываем файл
            Name = provider.getData("Books_en",3);                                            //подгружаем имя, автора и университет
            Author = provider.getData("Books_en",4);
            University = provider.getData("Books_en",5);
            provider.Close();                                                                           //закрываем файл
        } catch (IOException e) {
        }

        Random random = new Random();
        int numDegree = random.nextInt(2);
        if (numDegree == 1) Degree = "Bachelor";                                                        //путём выбора рандомного числа выбираем degree документа
            else Degree = "Magistracy";
        return new EngNaych(Name,Author,University,Degree);
    }
}
