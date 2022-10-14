package Number;

import java.util.HashMap;
import java.util.Map;

import Interfaces.EncryptionNumberInterface;

public class NumberEncryptor implements EncryptionNumberInterface {

    Map<String, Integer> dictionary = new HashMap<String, Integer>();

    @Override
    public String encryptNumber(String str) {

    }

    @Override
    public String decryptNumber(String str) {
        return null;
    }
}