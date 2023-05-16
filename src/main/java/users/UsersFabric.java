package users;

import mephi_books.ExlProvider;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsersFabric {

    public ExlProvider provider = new ExlProvider();
    public Students createStudent() {
        Random random = new Random();
        String surname = null; String shortname = null;

        try {
            provider.loadFile();

            int s = random.nextInt(2);
            if (s == 0) {
                shortname = provider.getData("Names",0);
                surname = provider.getData("Names",2);

            } else {

                shortname = provider.getData("Names",1);
                surname = provider.getData("Names",3);
            }
            provider.Close();
        } catch (IOException ex) {
            Logger.getLogger(UsersFabric.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new Students(surname + " " + shortname);
    }

    public Teachers createTeacher(){
        String surname = null; String shortname = null; String lastname = null;
        Random random = new Random();

        try {
            provider.loadFile();                               // грузим файл - грузить заранее

            int s = random.nextInt(2);                              // s - рандомное первое отчество
            if (s == 1) {                                           // сравниваем считанное значение с нулём, то есть, если ячейка не пустая, то смотрим на её окончание, опр пол преподавателя
                lastname = provider.getData("Names",4) + "ич";
                shortname = provider.getData("Names",0);
                surname = provider.getData("Names",5);

            } else {
                lastname = provider.getData("Names",4) + "на";
                shortname = provider.getData("Names",1);
                surname = provider.getData("Names",6);
            }
            provider.Close();
        } catch (IOException ex) {
        }

        return new Teachers(lastname + " " + shortname + " " + lastname);
    }
}
