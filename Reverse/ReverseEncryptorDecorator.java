package Reverse;

import Interface.EncryptionReverseInterface;

public class ReverseEncryptorDecorator extends BaseDecorator {

    public ReverseEncryptorDecorator(EncryptionReverseInterface encryptionInterface) {
        super(encryptionInterface);
    }

    @Override
    public String encryptReverse(String str) {
        return encryptionInterface.encryptReverse(str);
    }

    // @Override
    // public String decryptReverse(String str) {
    // return encryptionInterface.decryptReverse(str);
    // }

}