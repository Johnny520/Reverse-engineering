package p166g3;

import java.io.ByteArrayOutputStream;
import p084Q2.C3565;

/* JADX INFO: renamed from: g3.ۣ۟۠ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3628 {

    /* JADX INFO: renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static int f11091 = 945;

    /* JADX INFO: renamed from: ۟ۧۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m6273(String str) {
        String string = "";
        int i5 = 0;
        String str2 = "";
        while (i5 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i5)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i5).toString();
            i5++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i6 = 0; i6 < str.length(); i6 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i6)) << 4) | string.indexOf(str.charAt(i6 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static int m6274() {
        return (-169) ^ C3565.f11029;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m6275(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m6272(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
