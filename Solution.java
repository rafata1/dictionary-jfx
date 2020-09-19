package Dictionary_Oop;

public class Solution {
    public static void main(String[] args) {
        Dictionary myDictionary = new Dictionary();
        myDictionary.insert(new Word("Hello","Xin Chao"));
        myDictionary.insert(new Word("Goodbye","Tam biet"));
        DictionaryManagement myDictionaryManagement = new DictionaryManagement();
        myDictionaryManagement.setDictionary(myDictionary);  
        DictionaryCommandline myCommandline = new DictionaryCommandline();
        myCommandline.setDictionaryManagement(myDictionaryManagement);
        myCommandline.insertFromCommandline();
        myCommandline.showAllWords();
    }    
}
