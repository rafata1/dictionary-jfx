package Dictionary_Oop;

public class Dictionary {
    
    //properties mang listword l danh sach cac tu
    // size la so luong tu
    private Word [] listWord;
    private int size;

    //constructor
    public Dictionary()
    {
        size = 0;
        listWord = new Word[100000];
    }

    public Dictionary(Word [] listWords)
    {
        this.size = listWords.length;
        this.listWord = listWords;
    }

    //them tu vao tu dien

    public void insert(Word newWord)
    {
        size++;
        listWord[size-1] = newWord;
    }

    // hien tat cac cac tu trong tu dien

    public void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(listWord[i].getwordTarget()+ " "+ listWord[i].getwordExplain());
        }
    }
}
