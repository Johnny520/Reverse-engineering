package p194l1;

import java.io.ByteArrayOutputStream;
import p095T.C1383r;
import p112W2.C3587;
import p203n.C3660;

/* JADX INFO: renamed from: l1.ۡۢۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3650 {

    /* JADX INFO: renamed from: ۣۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f11112 = 945;

    /* JADX INFO: renamed from: ۟۟ۦۥۥ, reason: not valid java name and contains not printable characters */
    public static void m6381(Object obj) {
        if (C3587.m6084() < 0) {
            ((C1383r) obj).m2563R();
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m6382(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m6383(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m6384() {
        return 836 ^ C3660.f11123;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m6385(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
