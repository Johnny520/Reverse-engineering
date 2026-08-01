package p262x1;

import java.io.ByteArrayOutputStream;
import me.dartcv.nuke.C3655;
import p255w.C3696;

/* JADX INFO: renamed from: x1.ۢۨ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3699 {

    /* JADX INFO: renamed from: ۦۨۡۤ, reason: contains not printable characters */
    public static int f11165 = 33;

    /* JADX INFO: renamed from: ۟ۥۦۥ۠, reason: not valid java name and contains not printable characters */
    public static int m6669(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6670(Object obj) {
        if (C3696.m6657() <= 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۦۢ, reason: not valid java name and contains not printable characters */
    public static int m6671() {
        return (-625) ^ C3655.f11118;
    }

    /* JADX INFO: renamed from: ۤۦ۟۟, reason: not valid java name and contains not printable characters */
    public static String m6672(String str) {
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

    /* JADX INFO: renamed from: ۥۡۨۨ, reason: contains not printable characters */
    public static String m6673(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
