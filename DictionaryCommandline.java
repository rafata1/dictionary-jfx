package Dictionary_Oop;


public class DictionaryCommandline
{

    //moi commandline chua 1 dictionary management
    private DictionaryManagement myDictionaryManagement;

    public DictionaryCommandline()
    {

    }

    //getter setter
    public void setDictionaryManagement(DictionaryManagement newDictionaryManagement)
    {
        this.myDictionaryManagement = newDictionaryManagement;
    }


    //ham showallword hien thi tat ca cac tu trong tu dien
    public void showAllWords()
    {
        myDictionaryManagement.showDictionary();
    }
    //goi den jham nhap tu tu commandline
    public void insertFromCommandline()
    {
        myDictionaryManagement.insertFromCommandline();
    }
}