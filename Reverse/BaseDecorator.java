package Reverse;

import Interface.EncryptionReverseInterface;

public abstract class BaseDecorator implements EncryptionReverseInterface {

    protected EncryptionReverseInterface encryptionInterface;

    public BaseDecorator(EncryptionReverseInterface encryptionInterface) {
        this.encryptionInterface = encryptionInterface;
    }

    public String encryptReverse(String str) {
        return this.encryptionInterface.encryptReverse(str);
    }

    // public String decryptReverse(String str) {
    // return this.encryptionInterface.decryptReverse(str);
    // }

}
