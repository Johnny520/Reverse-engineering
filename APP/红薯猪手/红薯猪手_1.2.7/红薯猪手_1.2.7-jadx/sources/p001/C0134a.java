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
    public static final String f671 = C0341oa.m915(new byte[]{-50, -69, -41, -92, -36, 53, -51, -47, -44, -64, -38, 37, -70, -82, -27, -17, -3, 31, -31, -103}, new byte[]{-113, -2, -124, -117, -103, 118});

    /* JADX INFO: renamed from: ۥ */
    public static String m799(String str, String str2) {
        C0341oa.m915(new byte[]{25, -31, 49, 90, -87, 100, 8, -36, 38, 90}, new byte[]{124, -113, 82, 40, -48, 20});
        C0341oa.m915(new byte[]{-16, -115, -14, -38, 103, 55, -32, -93, -12, -47}, new byte[]{-108, -24, -111, -88, 30, 71});
        try {
            return m800(m992(str), str2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static String m800(byte[] bArr, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        C0341oa.m915(new byte[]{-20, 5, 55, -22, -51, 3, -4, 43, 49, -31}, new byte[]{-120, 96, 84, -104, -76, 115});
        KeyGenerator.getInstance(C0341oa.m915(new byte[]{82, -120, 64}, new byte[]{19, -51, 19, -48, 42, 63})).init(128);
        Cipher cipher = Cipher.getInstance(f671);
        Charset charset = C0247i0.f850;
        byte[] bytes = str.getBytes(charset);
        C0237h4.m1089(C0341oa.m915(new byte[]{101, -47, 22, -11, -91, 11, 103, -57, 74, -103, -14, 81, 43}, new byte[]{2, -76, 98, -73, -36, 127}), bytes);
        cipher.init(2, new SecretKeySpec(bytes, C0341oa.m915(new byte[]{-121, -97, 104}, new byte[]{-58, -38, 59, -92, 51, -102})));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        C0237h4.m865(bArrDoFinal);
        return new String(bArrDoFinal, charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m991(String str, String str2) {
        byte[] bytes;
        C0341oa.m915(new byte[]{-83, 85, -66, 78, -100, -48, -70}, new byte[]{-50, 58, -48, 58, -7, -66});
        C0341oa.m915(new byte[]{62, -84, 89, 103, -81, -13, 47, -119, 95, 108}, new byte[]{91, -62, 58, 21, -42, -125});
        C0341oa.m915(new byte[]{-25, 93, -118, 94, 0, 116, -16}, new byte[]{-124, 50, -28, 42, 101, 26});
        C0341oa.m915(new byte[]{-115, 78, 102, 49, -17, -38, -100, 107, 96, 58}, new byte[]{-24, 32, 5, 67, -106, -86});
        KeyGenerator.getInstance(C0341oa.m915(new byte[]{114, 6, 111}, new byte[]{51, 67, 60, 125, -14, -88})).init(256);
        try {
            Cipher cipher = Cipher.getInstance(f671);
            byte[] bytes2 = str2.getBytes(C0247i0.f850);
            C0237h4.m1089(C0341oa.m915(new byte[]{56, 99, -71, 78, 88, 102, 58, 117, -27, 34, 15, 60, 118}, new byte[]{95, 6, -51, 12, 33, 18}), bytes2);
            cipher.init(1, new SecretKeySpec(bytes2, C0341oa.m915(new byte[]{4, 34, -57}, new byte[]{69, 103, -108, 78, 30, 90})));
            Charset charsetForName = Charset.forName(C0341oa.m915(new byte[]{105, -12, 17, 87, -49}, new byte[]{28, -128, 119, 122, -9, 97}));
            C0237h4.m1089(C0341oa.m915(new byte[]{81, 55, 2, -125, -65, -27, 82, 112, 94, -29, -16, -95}, new byte[]{55, 88, 112, -51, -34, -120}), charsetForName);
            byte[] bytes3 = str.getBytes(charsetForName);
            C0237h4.m1089(C0341oa.m915(new byte[]{85, 87, 127, 28, -117, -8, 87, 65, 35, 112, -36, -94, 27}, new byte[]{50, 50, 11, 94, -14, -116}), bytes3);
            bytes = cipher.doFinal(bytes3);
            C0237h4.m1089(C0341oa.m915(new byte[]{-76, -126, -60, -79, 17, 14, -68, -59, -84, -10, 81, 70}, new byte[]{-48, -19, -126, -40, 127, 111}), bytes);
        } catch (Exception unused) {
            bytes = "".getBytes(C0247i0.f850);
            C0237h4.m1089(C0341oa.m915(new byte[]{-85, -21, 55, 25, 75, -59, -87, -3, 107, 117, 28, -97, -27}, new byte[]{-52, -114, 67, 91, 50, -79}), bytes);
        }
        C0341oa.m915(new byte[]{-109, -102, 64, 54, 78}, new byte[]{-15, -29, 52, 83, 61, 15});
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
        C0341oa.m915(new byte[]{120, 91, -33, 123, -39, -3, 89, 85, -56, 123}, new byte[]{26, 58, -84, 30, -17, -55});
        C0341oa.m915(new byte[]{-93, -68, 18}, new byte[]{-48, -56, 96, 20, 29, -44});
        StringBuffer stringBuffer = new StringBuffer();
        Charset charsetForName = Charset.forName(C0341oa.m915(new byte[]{66, -76, 125, -62, 114, 100, 94, -82}, new byte[]{23, -25, 80, -125, 33, 39}));
        C0237h4.m1089(C0341oa.m915(new byte[]{79, -106, -95, -101, 99, 70, 76, -47, -3, -5, 44, 2}, new byte[]{41, -7, -45, -43, 2, 43}), charsetForName);
        byte[] bytes = str.getBytes(charsetForName);
        C0237h4.m1089(C0341oa.m915(new byte[]{-105, 117, -14, -74, 22, 119, -107, 99, -82, -38, 65, 45, -39}, new byte[]{-16, 16, -122, -12, 111, 3}), bytes);
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
                    C0237h4.m1089(C0341oa.m915(new byte[]{-30, 68, 97, -64, 102, -14, -8, 76, 26, -102, 58, -75, -65}, new byte[]{-106, 43, 50, -76, 20, -101}), string);
                    Charset charsetForName2 = Charset.forName(C0341oa.m915(new byte[]{-66, 95, -54, -24, -32, 48, -62, 53, -88, -12}, new byte[]{-9, 12, -123, -59, -40, 8}));
                    C0237h4.m1089(C0341oa.m915(new byte[]{-112, -10, -45, 98, 38, 123, -109, -79, -113, 2, 105, 63}, new byte[]{-10, -103, -95, 44, 71, 22}), charsetForName2);
                    byte[] bytes2 = string.getBytes(charsetForName2);
                    C0237h4.m1089(C0341oa.m915(new byte[]{-126, 2, 6, 5, 74, -7, -128, 20, 90, 105, 29, -93, -52}, new byte[]{-27, 103, 114, 71, 51, -115}), bytes2);
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
                    C0237h4.m1089(C0341oa.m915(new byte[]{-88, 29, 112, -49, -118, 98, -78, 21, 11, -107, -42, 37, -11}, new byte[]{-36, 114, 35, -69, -8, 11}), string2);
                    Charset charsetForName3 = Charset.forName(C0341oa.m915(new byte[]{57, -58, 27, 102, -108, -80, 69, -84, 121, 122}, new byte[]{112, -107, 84, 75, -84, -120}));
                    C0237h4.m1089(C0341oa.m915(new byte[]{-104, -57, -53, -79, -96, -104, -101, -128, -105, -47, -17, -36}, new byte[]{-2, -88, -71, -1, -63, -11}), charsetForName3);
                    byte[] bytes3 = string2.getBytes(charsetForName3);
                    C0237h4.m1089(C0341oa.m915(new byte[]{-108, -77, 66, -29, -47, -113, -106, -91, 30, -113, -122, -43, -38}, new byte[]{-13, -42, 54, -95, -88, -5}), bytes3);
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
        C0237h4.m1089(C0341oa.m915(new byte[]{67, -49, -73, 62, -101, -74, 89, -57, -52, 100, -57, -15, 30}, new byte[]{55, -96, -28, 74, -23, -33}), string3);
        Charset charsetForName4 = Charset.forName(C0341oa.m915(new byte[]{-119, -125, 2, 90, -2, 63, -11, -23, 96, 70}, new byte[]{-64, -48, 77, 119, -58, 7}));
        C0237h4.m1089(C0341oa.m915(new byte[]{-49, 102, 85, -49, 81, -29, -52, 33, 9, -81, 30, -89}, new byte[]{-87, 9, 39, -127, 48, -114}), charsetForName4);
        byte[] bytes4 = string3.getBytes(charsetForName4);
        C0237h4.m1089(C0341oa.m915(new byte[]{-33, 13, 107, -124, -75, -114, -35, 27, 55, -24, -30, -44, -111}, new byte[]{-72, 104, 31, -58, -52, -6}), bytes4);
        return bytes4;
    }
}
