package p097T1;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import p005A4.C3528;
import p015C2.C0243c;
import p016C3.C0245b;
import p021D3.C0274k;
import p021D3.EnumC0272i;
import p084Q2.C3565;
import p120Y0.C3594;
import p166g3.C3629;

/* JADX INFO: renamed from: T1.ۦۣۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3574 {

    /* JADX INFO: renamed from: ۟ۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int f11038 = 182;

    /* JADX INFO: renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static EnumC0272i m6020() {
        if (C3594.m6113() >= 0) {
            return EnumC0272i.f877e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m6021(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۡۤۧ۠, reason: not valid java name and contains not printable characters */
    public static Method m6022(Object obj) {
        if (C3629.m6279() >= 0) {
            return ((C0243c) obj).f814g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m6023() {
        return 994 ^ C3565.f11029;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static C0245b m6025() {
        if (C3528.m5783() > 0) {
            return C0274k.m467j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠۟, reason: not valid java name and contains not printable characters */
    public static int m6026(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static String m6024(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
