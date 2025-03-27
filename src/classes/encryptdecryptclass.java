package classes;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;

public class encryptdecryptclass {

//    input variables
    private String input;

    private KeyGenerator keygen;
    private KeyGenerator secretkey;

    private Cipher allcipher;

    private byte[] plaintext;

    private byte[] ciphertext;

    private byte[] decrypttext;

    private String strciphertext;

    private String strdecrypttext;

    private int len;
    private int maxlen;


    public encryptdecryptclass(String input, String al) throws  Exception {
        keygen = KeyGenerator.getInstance(al);
        secretkey= keygen.generateKey();
    }
}

