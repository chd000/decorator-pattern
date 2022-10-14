import Interface.EncryptionLetterInterface;
import Interface.EncryptionNumberInterface;
import Interface.EncryptionReverseInterface;
import Number.NumberEncryptor;
import Number.NumberEncryptorDecorator;
import Letter.LetterEncryptor;
import Letter.LetterEncryptorDecorator;
import Reverse.ReverseEncryptorDecorator;
import Reverse.ReverseEncryptor;

public class Main {
    public static void main(String[] args) {

        EncryptionNumberInterface numberEncryptor = new NumberEncryptorDecorator(new NumberEncryptor());
        EncryptionLetterInterface letterEncryptor = new LetterEncryptorDecorator(new LetterEncryptor());
        EncryptionReverseInterface reverseEncryptor = new ReverseEncryptorDecorator(new ReverseEncryptor());

        String encrypted = reverseEncryptor.encryptReverse("футболла");
        System.out.println(encrypted);

        // String decrypted = numberEncryptor.decryptNumber(encrypted);
        // System.out.println(decrypted);

    }
}
