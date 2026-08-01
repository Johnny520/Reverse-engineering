package p037;

import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Charset f17527;

    static {
        AbstractC8405.m13972(9);
        f17527 = StandardCharsets.UTF_8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static byte[] m11954(String str, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpecM11958 = m11958(str);
            Cipher cipher = Cipher.getInstance(AbstractC8405.m13972(9));
            cipher.init(1, secretKeySpecM11958);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m11955(String str, String str2) {
        byte[] bytes;
        try {
            bytes = str.getBytes(f17527);
        } catch (Exception e) {
            e.printStackTrace();
            bytes = null;
        }
        byte[] bArrM11954 = m11954(str2, bytes);
        if (bArrM11954 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArrM11954.length * 2);
        for (byte b : bArrM11954) {
            String hexString = Integer.toHexString(b & DefaultClassResolver.NAME);
            if (hexString.length() == 1) {
                sb.append(AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static byte[] m11956(String str, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpecM11958 = m11958(str);
            Cipher cipher = Cipher.getInstance(AbstractC8405.m13972(9));
            cipher.init(2, secretKeySpecM11958);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m11957(String str, String str2) {
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
        byte[] bArrM11956 = m11956(str2, bArr);
        if (bArrM11956 == null) {
            return null;
        }
        return new String(bArrM11956, f17527);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static SecretKeySpec m11958(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(str);
        while (sb.length() < 32) {
            sb.append(AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        }
        if (sb.length() > 32) {
            sb.setLength(32);
        }
        return new SecretKeySpec(sb.toString().getBytes(f17527), AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵呜呜喵喵喵喵~喵喵呜喵呜喵喵呜"));
    }
}
