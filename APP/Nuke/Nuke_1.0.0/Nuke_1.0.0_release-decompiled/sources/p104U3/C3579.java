package p104U3;

import java.io.ByteArrayOutputStream;
import p022E.C3540;
import p095T.InterfaceC1373m;
import p103U2.C3577;
import p137b3.C3612;
import p216p.AbstractC2856m;

/* JADX INFO: renamed from: U3.ۨۢۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3579 {

    /* JADX INFO: renamed from: ۟۠ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static int f11043 = -765;

    /* JADX INFO: renamed from: ۢۢۦۥ, reason: not valid java name and contains not printable characters */
    public static String m6045(String str) {
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

    /* JADX INFO: renamed from: ۤۧۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6046(Object obj) {
        if (C3577.m2749() < 0) {
            return AbstractC2856m.m5056j((InterfaceC1373m) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧۥ, reason: contains not printable characters */
    public static long m6047() {
        if (C3612.m6201() < 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۥۢۧ, reason: contains not printable characters */
    public static int m6048(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m6049() {
        return (-452) ^ C3540.f11004;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m6044(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
