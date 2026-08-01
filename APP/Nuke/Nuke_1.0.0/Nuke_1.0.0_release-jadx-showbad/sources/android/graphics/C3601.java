package android.graphics;

import java.io.ByteArrayOutputStream;
import p090R3.C3569;

/* JADX INFO: renamed from: android.graphics.۟۟ۢ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3601 {

    /* JADX INFO: renamed from: ۣۧۤۢ, reason: not valid java name and contains not printable characters */
    public static int f11065 = -217;

    /* JADX INFO: renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m6143() {
        return 362 ^ C3569.f11033;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static int m6144(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۤ, reason: not valid java name and contains not printable characters */
    public static String m6145(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i6 = 0; i6 < length; i6++) {
            byteArray[i6] = (byte) (byteArray[i6] ^ str2.charAt(i6 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۡۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6146(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
