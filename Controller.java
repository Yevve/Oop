public class Controller {
    
private View view;
private EncryptionEngine encryptionEngine;
public Controller(){
    this.view=new View(this);
    encryptionEngine=new EncryptionEngine(this);
}    

public void encryptButtonClicked(){
String key= view.getEncryptionKey();
String inputText=view.getInputText();
encryptionEngine.setEncryptionKey(Integer.parseInt(key));
String outputText = encryptionEngine.encrypt(inputText);
view.setOutputText(outputText);
}
public void decryptButtonClicked(){
    String key= view.getEncryptionKey();
    String inputText=view.getInputText();
    encryptionEngine.setEncryptionKey(Integer.parseInt(key));
    String outputText = encryptionEngine.decrypt(inputText);
    view.setOutputText(outputText);
}

}