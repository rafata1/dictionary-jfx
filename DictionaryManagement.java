package Dictionary_Oop;

import java.util.Scanner;

public class DictionaryManagement {

    //Dictionary management chua myDictionary
    private Dictionary myDictionary;
    
    public DictionaryManagement()
    {
    }
    
    //getter setter
    public void setDictionary(Dictionary newDictionary)
    {
        this.myDictionary = newDictionary;
    }
    
    public Dictionary getDictionary()
    {
        return myDictionary;
    }
    
    //nhap tu tu commandline
    public void insertFromCommandline()
    {
        Scanner myScanner = new Scanner(System.in);
        int numberOfWord;
        numberOfWord = myScanner.nextInt();
        for(int i=0;i<numberOfWord;i++)
        {
            Word tmp = new Word();
            tmp.setwordTarget(myScanner.nextLine());
            tmp.setwordExplain(myScanner.nextLine()); 
            myDictionary.insert(tmp);
        }
        myScanner.close();
    }

    //goi pden ham show cua tu dien
    public void showDictionary()
    {
        myDictionary.show();
    }

}
