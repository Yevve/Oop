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
        
        char[] inCharArr = inputText.toCharArray();
        for (int i=0;i<inputText.length();i++){
            
                inCharArr[i] = (char) (((((int)inCharArr[i] - 'A') +encryptionKey+26 )% 26 )+ 'A'); 
                 
        }
        return new String (inCharArr);
        
    }

    public String decrypt(String inputText){
    
        char[] inCharArr = inputText.toCharArray();
        for (int i=0;i<inputText.length();i++){
            
                inCharArr[i] = (char) (((((int)inCharArr[i] - 'A') -encryptionKey+26 )% 26 )+ 'A'); 
                 
        }
        return new String (inCharArr);

    }

    

    public void setController(Controller controller) {
        this.controller = controller;
    }


}
