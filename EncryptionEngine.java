public class EncryptionEngine {
public Controller controller;
public int encryptionKey;

    public EncryptionEngine(Controller controller){


    }
    public void setEncryptionKey(int key){
    this.encryptionKey=key;
    }

    public int getEncryptionKey(){   
    return encryptionKey;
    }

    public String encrypt(String inputText){
        int key=getEncryptionKey();
        char[] inCharArr = inputText.toCharArray();
        for (int i=0;i<=inCharArr.length;i+=1){
            if (Character.isUpperCase(inCharArr[i])){
                char ch = (char)(((int)inCharArr[i] + key - 65) % 26 + 65); 
                inCharArr[i]+=ch;
            }
            else
            { 
                char ch = (char)(((int)inCharArr[i] + key - 97) % 26 + 97); 
                inCharArr[i]+=ch;
            } 
        }
        String outputText =String.valueOf(inCharArr);
        return outputText;
    }

    public String decrypt(String inputText){
    int key=getEncryptionKey();
    char[] inCharArr = inputText.toCharArray();
    for (int i=0;i<=inCharArr.length;i+=1){
        if (Character.isUpperCase(inCharArr[i])){
            char ch = (char)(((int)inCharArr[i] + 
                                  key - 65) % 26 + 65); 
                
        }
        
        


    }
    return null;
    }


}
