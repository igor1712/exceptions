package hw_3.base.interfaces;

import hw_3.base.exceptions.MyFileCreateException;
import hw_3.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
