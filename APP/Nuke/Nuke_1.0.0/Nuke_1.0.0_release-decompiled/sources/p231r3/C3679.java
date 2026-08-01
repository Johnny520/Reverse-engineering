package p231r3;

import java.io.ByteArrayOutputStream;
import p019D1.C3537;

/* JADX INFO: renamed from: r3.۟ۧۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3679 {

    /* JADX INFO: renamed from: ۣ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int f11145 = -358;

    /* JADX INFO: renamed from: ۟۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m6571(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i7 = 0; i7 < length; i7++) {
            byteArray[i7] = (byte) (byteArray[i7] ^ str2.charAt(i7 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۨ, reason: not valid java name and contains not printable characters */
    public static int m6572() {
        return (-524) ^ C3537.f11001;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۥ, reason: not valid java name and contains not printable characters */
    public static int m6573(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۥۦۥ, reason: not valid java name and contains not printable characters */
    public static String m6574(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
