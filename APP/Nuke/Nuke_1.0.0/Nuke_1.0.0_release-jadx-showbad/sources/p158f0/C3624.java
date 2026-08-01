package p158f0;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import p015C2.C3535;
import p095T.C1383r;
import p100U.C3575;
import p220p4.C3673;

/* JADX INFO: renamed from: f0.۟ۢۧۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3624 {

    /* JADX INFO: renamed from: ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static int f11087 = 686;

    /* JADX INFO: renamed from: ۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static MessageDigest m6252(Object obj) {
        if (C3535.m5818() <= 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m6253(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۨ, reason: not valid java name and contains not printable characters */
    public static String m6255(String str) {
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

    /* JADX INFO: renamed from: ۣ۠۟۟, reason: not valid java name and contains not printable characters */
    public static int m6256() {
        return (-5) ^ C3575.f11039;
    }

    /* JADX INFO: renamed from: ۨۧۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6257(Object obj, boolean z5) {
        if (C3673.m6547() > 0) {
            return ((C1383r) obj).m2584g(z5);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m6254(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
