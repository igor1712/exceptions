package hw_3.base.abstractClasses;

import hw_3.base.classes.workWithFile.CFileCreator;
import hw_3.base.classes.workWithFile.CFindTheSameFileName;
import hw_3.base.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
