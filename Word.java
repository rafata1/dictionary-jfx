package Dictionary_Oop;

public class Word {
    // cai nay la properties
    private String wordTarget;
    private String wordExpain;

    //constructor
    public Word()
    {
        this.wordExpain="";
        this.wordExpain="";
    }
    public Word(String wordTarget,String wordExplain)
    {
        this.wordTarget = wordTarget;
        this.wordExpain = wordExplain;
    }

    //getter setter cua properties
    public String getwordTarget()
    {
        return this.wordTarget;
    }
    public void setwordTarget(String wordTarget)
    {
        this.wordTarget = wordTarget;
    }
    public String getwordExplain()
    {
        return this.wordExpain;
    }
    public void setwordExplain(String wordExplain)
    {
        this.wordExpain = wordExplain;
    }
}
