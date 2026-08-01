package me.dartcv.nuke;

import java.io.ByteArrayOutputStream;
import p233s0.C3681;

/* JADX INFO: renamed from: me.dartcv.nuke.ۣۣۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3657 {

    /* JADX INFO: renamed from: ۥ۟ۢۨ, reason: contains not printable characters */
    public static int f11120 = 704;

    /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m6415() {
        return 902 ^ C3681.f11147;
    }

    /* JADX INFO: renamed from: ۤۨۢۤ, reason: not valid java name and contains not printable characters */
    public static String m6416(String str) {
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

    /* JADX INFO: renamed from: ۣۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m6417(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m6414(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
