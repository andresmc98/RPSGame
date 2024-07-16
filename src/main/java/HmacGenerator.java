import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

public class HmacGenerator {
    public static String generateHMAC(String move, String key){
        byte[] decodedKey = Base64.decodeBase64(key);
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, decodedKey);
        return hmacUtils.hmacHex(move);
    }
}
