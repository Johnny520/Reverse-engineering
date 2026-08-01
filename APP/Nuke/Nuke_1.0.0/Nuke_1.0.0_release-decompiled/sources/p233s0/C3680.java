package p233s0;

import java.io.ByteArrayOutputStream;
import p061L2.C3558;
import p064M1.C3561;
import p095T.C1383r;
import p104U3.C3578;

/* JADX INFO: renamed from: s0.۠ۢۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3680 {

    /* JADX INFO: renamed from: ۥۨ۠۟, reason: contains not printable characters */
    public static int f11146 = 283;

    /* JADX INFO: renamed from: ۟۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static int m6575() {
        return 233 ^ C3578.f11042;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤ, reason: not valid java name and contains not printable characters */
    public static void m6577(Object obj, Object obj2) {
        if (C3561.m5957() >= 0) {
            ((C1383r) obj).m2585g0(obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m6578(String str) {
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

    /* JADX INFO: renamed from: ۡۥۡ۠, reason: not valid java name and contains not printable characters */
    public static int m6579(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۥۦۥ, reason: contains not printable characters */
    public static boolean m6580(Object obj, Object obj2) {
        if (C3558.m5942() < 0) {
            return ((C1383r) obj).m2582f(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static String m6576(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
