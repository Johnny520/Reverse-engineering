package p255w;

import java.io.ByteArrayOutputStream;
import java.util.List;
import p111W1.C3586;
import p234s1.C3682;
import p269y2.C3492b;

/* JADX INFO: renamed from: w.۟ۢۧۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3696 {

    /* JADX INFO: renamed from: ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f11162 = 323;

    /* JADX INFO: renamed from: ۟ۦ۠۠۠, reason: not valid java name and contains not printable characters */
    public static List m6655(Object obj) {
        if (C3682.m6586() >= 0) {
            return ((C3492b) obj).m5751b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۡ, reason: not valid java name and contains not printable characters */
    public static String m6656(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۤ۠۟, reason: not valid java name and contains not printable characters */
    public static int m6657() {
        return (-40) ^ C3586.f11050;
    }

    /* JADX INFO: renamed from: ۠۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m6658(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6654(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
