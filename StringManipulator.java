public class StringManipulator{
    public String trimAndConcat(String a, String b){
        return a.trim()+b.trim();
    } 

    public int getIndexOrNull(String a, char L){
        return a.indexOf(L);
    }

    public int getIndexOrNull(String a, String b){
        return a.indexOf(b);
    }
    
    public String concatSubstring(String a, int x, int y, String b){
        return a.substring(x,y)+b;
    }
}