package p036;

import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3056;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Charset f17481;

    static {
        AbstractC3056.m6668(-3937561803001955751L);
        f17481 = StandardCharsets.UTF_8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static byte[] m11906(String str, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpecM11910 = m11910(str);
            Cipher cipher = Cipher.getInstance(AbstractC3056.m6668(-3937561803001955751L));
            cipher.init(1, secretKeySpecM11910);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m11907(String str, String str2) {
        byte[] bytes;
        try {
            bytes = str.getBytes(f17481);
        } catch (Exception e) {
            e.printStackTrace();
            bytes = null;
        }
        byte[] bArrM11906 = m11906(str2, bytes);
        if (bArrM11906 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArrM11906.length * 2);
        for (byte b : bArrM11906) {
            String hexString = Integer.toHexString(b & DefaultClassResolver.NAME);
            if (hexString.length() == 1) {
                sb.append(AbstractC3056.m6668(-3937561652678100391L));
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static byte[] m11908(String str, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpecM11910 = m11910(str);
            Cipher cipher = Cipher.getInstance(AbstractC3056.m6668(-3937561803001955751L));
            cipher.init(2, secretKeySpecM11910);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m11909(String str, String str2) {
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
        byte[] bArrM11908 = m11908(str2, bArr);
        if (bArrM11908 == null) {
            return null;
        }
        return new String(bArrM11908, f17481);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static SecretKeySpec m11910(String str) {
        if (str == null) {
            str = AbstractC3056.m6668(-3937561979095614887L);
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(str);
        while (sb.length() < 32) {
            sb.append(AbstractC3056.m6668(-3937561652678100391L));
        }
        if (sb.length() > 32) {
            sb.setLength(32);
        }
        return new SecretKeySpec(sb.toString().getBytes(f17481), AbstractC3056.m6668(-3937561626908296615L));
    }
}
