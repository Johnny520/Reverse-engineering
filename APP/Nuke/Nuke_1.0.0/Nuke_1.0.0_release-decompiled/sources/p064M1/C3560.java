package p064M1;

import java.io.ByteArrayOutputStream;
import p095T.C1305C;
import p095T.C1383r;
import p095T.C1386s0;
import p103U2.C3577;
import p120Y0.C3595;
import p168h.C3632;

/* JADX INFO: renamed from: M1.۟ۧۢۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3560 {

    /* JADX INFO: renamed from: ۟ۦۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int f11024 = -87;

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static C1386s0 m5950(Object obj, Object obj2) {
        if (C3595.m3088() < 0) {
            return ((C1305C) obj).mo2399a(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m5951(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5952(Object obj, int i5) {
        if (C3577.m2749() <= 0) {
            return ((C1383r) obj).m2578d(i5);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static int m5953() {
        return (-1024) ^ C3632.f11095;
    }

    /* JADX INFO: renamed from: ۤۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m5954(String str) {
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
        for (int i7 = 0; i7 < length; i7++) {
            byteArray[i7] = (byte) (byteArray[i7] ^ str2.charAt(i7 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String m5949(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
