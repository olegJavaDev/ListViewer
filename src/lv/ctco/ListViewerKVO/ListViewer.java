package lv.ctco.ListViewerKVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListViewer implements ListOfOperations {
    List<Student> studentList;
    ConsoleIO consoleIO;
    List<String> values;

    public ListViewer() {
        studentList = new ArrayList<Student>();
        consoleIO = new ConsoleIO();
    }

    public List lst() {
        return null;
    }

    public void start() {
        while (true) {
            values = consoleIO.readFromConsole();
            for (int i = 0; i < listOfOperations.size(); i++) {
                if (listOfOperations.get(i).getOperation().equals(values.get(0))) {
                    values = values.subList(1, values.size());
                    studentList = (List<Student>) listOfOperations.get(i).doOperation(studentList, values);
                }
            }

            for (Student student : studentList)
                System.out.println(student);
        }
    }
}
