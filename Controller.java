public class Controller {
    
private View view;
private EncryptionEngine encryptionEngine;
public Controller(){
    this.view=new View(this);
    encryptionEngine=new EncryptionEngine(this);
}    

public void encryptButtonClicked(){
    
    
   try { 
    String key= view.getEncryptionKey();
    char[] keyCha=key.toCharArray();
    for(int i=0;i<key.length();i+=1){
        if(Character.isAlphabetic(keyCha[i])){
            throw new Exception("Not a numerical key");
        }
    }
    String inputText=view.getInputText();
    char[] cha=inputText.toCharArray();
    for(int i=0;i<cha.length;i+=1){
        if(!Character.isUpperCase(cha[i])){
            throw new Exception("Not a uppercase word!");
        }
    }
    encryptionEngine.setEncryptionKey(Integer.parseInt(key));
    String outputText = encryptionEngine.encrypt(inputText);   
    view.setOutputText(outputText);
} catch (Exception e) {
    String errMsg=e.getMessage();
    view.setOutputText(errMsg);
   }
    
    

}
public void decryptButtonClicked(){
   
    try { 
        String key= view.getEncryptionKey();
        char[] keyCha=key.toCharArray();
        for(int i=0;i<key.length();i+=1){
            if(Character.isAlphabetic(keyCha[i])){
                throw new Exception("Not a numerical key");
            }
        }
        String inputText=view.getInputText();
        char[] cha=inputText.toCharArray();
        for(int i=0;i<cha.length;i+=1){
            if(!Character.isUpperCase(cha[i])){
                throw new Exception("Not a uppercase word!");
            }
        }
        encryptionEngine.setEncryptionKey(Integer.parseInt(key));
        String outputText = encryptionEngine.decrypt(inputText);   
        view.setOutputText(outputText);
    } catch (Exception e) {
        String errMsg=e.getMessage();
        view.setOutputText(errMsg);
       }
        
        
}

}