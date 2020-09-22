public class Controller {
    
private View view;
private EncryptionEngine encryptionEngine;
public Controller(){
    this.view=new View(this);
    encryptionEngine=new EncryptionEngine(this);
}    

public void encryptButtonClicked(){
String inputText=view.getInputText();
view.getEncryptionKey();
String outputText = "bajs";
encryptionEngine.encrypt(inputText);
view.setOutputText(outputText);
}
public void decryptButtonClicked(){

}

}