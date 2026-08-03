package p001;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: ۟.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0134a {

    /* JADX INFO: renamed from: ۥ */
    public static final String f671 = "AES/ECB/PKCS5Padding";

    /* JADX INFO: renamed from: ۥ */
    public static String m799(String str, String str2) {
        "encryptStr";
        "decryptKey";
        try {
            return m800(m992(str), str2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static String m800(byte[] bArr, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        "decryptKey";
        KeyGenerator.getInstance("AES").init(128);
        Cipher cipher = Cipher.getInstance(f671);
        Charset charset = C0247i0.f850;
        byte[] bytes = str.getBytes(charset);
        C0237h4.m1089("getBytes(...)", bytes);
        cipher.init(2, new SecretKeySpec(bytes, "AES"));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        C0237h4.m865(bArrDoFinal);
        return new String(bArrDoFinal, charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m991(String str, String str2) {
        byte[] bytes;
        "content";
        "encryptKey";
        "content";
        "encryptKey";
        KeyGenerator.getInstance("AES").init(256);
        try {
            Cipher cipher = Cipher.getInstance(f671);
            byte[] bytes2 = str2.getBytes(C0247i0.f850);
            C0237h4.m1089("getBytes(...)", bytes2);
            cipher.init(1, new SecretKeySpec(bytes2, "AES"));
            Charset charsetForName = Charset.forName("utf-8");
            C0237h4.m1089("forName(...)", charsetForName);
            byte[] bytes3 = str.getBytes(charsetForName);
            C0237h4.m1089("getBytes(...)", bytes3);
            bytes = cipher.doFinal(bytes3);
            C0237h4.m1089("doFinal(...)", bytes);
        } catch (Exception unused) {
            bytes = "".getBytes(C0247i0.f850);
            C0237h4.m1089("getBytes(...)", bytes);
        }
        "bytes";
        return C0272jb.m1100(bytes);
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static byte[] m992(String str) {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        "base64Code";
        "str";
        StringBuffer stringBuffer = new StringBuffer();
        Charset charsetForName = Charset.forName("US-ASCII");
        C0237h4.m1089("forName(...)", charsetForName);
        byte[] bytes = str.getBytes(charsetForName);
        C0237h4.m1089("getBytes(...)", bytes);
        int length = bytes.length;
        int i5 = 0;
        while (i5 < length) {
            while (true) {
                i = i5 + 1;
                b = C0272jb.f885[bytes[i5]];
                if (i >= length || b != -1) {
                    break;
                }
                i5 = i;
            }
            if (b == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b2 = C0272jb.f885[bytes[i]];
                if (i2 >= length || b2 != -1) {
                    break;
                }
                i = i2;
            }
            if (b2 == -1) {
                break;
            }
            stringBuffer.append((char) ((b << 2) | ((b2 & 48) >>> 4)));
            while (true) {
                i3 = i2 + 1;
                byte b5 = bytes[i2];
                if (b5 == 61) {
                    String string = stringBuffer.toString();
                    C0237h4.m1089("toString(...)", string);
                    Charset charsetForName2 = Charset.forName("ISO-8859-1");
                    C0237h4.m1089("forName(...)", charsetForName2);
                    byte[] bytes2 = string.getBytes(charsetForName2);
                    C0237h4.m1089("getBytes(...)", bytes2);
                    return bytes2;
                }
                b3 = C0272jb.f885[b5];
                if (i3 >= length || b3 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b3 == -1) {
                break;
            }
            stringBuffer.append((char) (((b2 & 15) << 4) | ((b3 & 60) >>> 2)));
            while (true) {
                i4 = i3 + 1;
                byte b6 = bytes[i3];
                if (b6 == 61) {
                    String string2 = stringBuffer.toString();
                    C0237h4.m1089("toString(...)", string2);
                    Charset charsetForName3 = Charset.forName("ISO-8859-1");
                    C0237h4.m1089("forName(...)", charsetForName3);
                    byte[] bytes3 = string2.getBytes(charsetForName3);
                    C0237h4.m1089("getBytes(...)", bytes3);
                    return bytes3;
                }
                b4 = C0272jb.f885[b6];
                if (i4 >= length || b4 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b4 == -1) {
                break;
            }
            stringBuffer.append((char) (b4 | ((b3 & 3) << 6)));
            i5 = i4;
        }
        String string3 = stringBuffer.toString();
        C0237h4.m1089("toString(...)", string3);
        Charset charsetForName4 = Charset.forName("ISO-8859-1");
        C0237h4.m1089("forName(...)", charsetForName4);
        byte[] bytes4 = string3.getBytes(charsetForName4);
        C0237h4.m1089("getBytes(...)", bytes4);
        return bytes4;
    }
}
