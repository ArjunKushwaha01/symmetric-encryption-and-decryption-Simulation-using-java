package classes;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

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

    // Create constructor

    public encryptdecryptclass(String input, String al) throws  Exception {
        // Generate Key
        keygen = KeyGenerator.getInstance(al);
        secretkey= keygen.generateKey();

        // Parameter Setting
        allcipher = Cipher.getInstance(al+"/CBC/PKCS5Padding");
        allcipher.init(Cipher.ENCRYPT_MODE, secretkey);

        //Create Plaintext
        plaintext = input.getBytes(StandardCharsets.UTF_8);
    }
    //Getter method to return encryption result
    public String encrypt() throws Exception {
        // start encryption
        ciphertext = allcipher.doFinal(plaintext);

        //Covert the encryption output to string

        strciphertext = Base64.getEncoder().encodeToString(ciphertext);
        return strciphertext;
    }

    //Getter method to return the decryption result

    public String decrypt() throws Exception {
        //parameter setting

        allcipher.init(Cipher.DECRYPT_MODE, secretkey, allcipher.getParameters());
        //Start Decrypt
        decrypttext = allcipher.doFinal(ciphertext);
        //Convert the decryption result to string
        strciphertext = new String((decrypttext, StandardCharsets.UTF_8);
        return strciphertext;
    }
}

