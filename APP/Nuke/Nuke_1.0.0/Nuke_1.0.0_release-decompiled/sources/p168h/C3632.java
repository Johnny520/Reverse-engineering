package p168h;

import java.io.ByteArrayOutputStream;
import p055K1.C3554;

/* JADX INFO: renamed from: h.۟۟ۥۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3632 {

    /* JADX INFO: renamed from: ۠ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int f11095 = -311;

    /* JADX INFO: renamed from: ۟ۦۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6291(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static int m6293() {
        return (-383) ^ C3554.f11018;
    }

    /* JADX INFO: renamed from: ۨۢۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6294(String str) {
        String string = "";
        int i5 = 0;
        String str2 = "";
        while (i5 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i5)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i5).toString();
            i5++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i6 = 0; i6 < str.length(); i6 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i6)) << 4) | string.indexOf(str.charAt(i6 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i7 = 0; i7 < length; i7++) {
            byteArray[i7] = (byte) (byteArray[i7] ^ str2.charAt(i7 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۡۢۥۤ, reason: not valid java name and contains not printable characters */
    public static String m6292(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
