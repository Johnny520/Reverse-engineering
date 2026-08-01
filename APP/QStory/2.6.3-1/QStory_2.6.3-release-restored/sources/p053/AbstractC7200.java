package p053;

import com.android.p002dx.p005io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7200 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Charset f17872;

    static {
        "AES/ECB/PKCS5Padding";
        f17872 = StandardCharsets.UTF_8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static byte[] m12513(String str, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpecM12517 = m12517(str);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpecM12517);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m12514(String str, String str2) {
        byte[] bytes;
        try {
            bytes = str.getBytes(f17872);
        } catch (Exception e) {
            e.printStackTrace();
            bytes = null;
        }
        byte[] bArrM12513 = m12513(str2, bytes);
        if (bArrM12513 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArrM12513.length * 2);
        for (byte b : bArrM12513) {
            String hexString = Integer.toHexString(b & DefaultClassResolver.NAME);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static byte[] m12515(String str, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpecM12517 = m12517(str);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpecM12517);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m12516(String str, String str2) {
        byte[] bArr;
        if (str != null) {
            try {
                if (str.length() < 2) {
                    bArr = new byte[0];
                } else {
                    String lowerCase = str.toLowerCase();
                    int length = lowerCase.length() / 2;
                    bArr = new byte[length];
                    for (int i = 0; i < length; i++) {
                        int i2 = i * 2;
                        bArr[i] = (byte) (Integer.parseInt(lowerCase.substring(i2, i2 + 2), 16) & Opcodes.CONST_METHOD_TYPE);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                bArr = null;
            }
        } else {
            bArr = new byte[0];
        }
        byte[] bArrM12515 = m12515(str2, bArr);
        if (bArrM12515 == null) {
            return null;
        }
        return new String(bArrM12515, f17872);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static SecretKeySpec m12517(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(str);
        while (sb.length() < 32) {
            sb.append("0");
        }
        if (sb.length() > 32) {
            sb.setLength(32);
        }
        return new SecretKeySpec(sb.toString().getBytes(f17872), "AES");
    }
}
