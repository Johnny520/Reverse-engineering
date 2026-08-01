package p214o3;

import java.io.ByteArrayOutputStream;
import p015C2.C3534;
import p095T.C1357e;
import p095T.C1371l;
import p148d2.C3619;
import p168h.C3632;
import p263x2.AbstractC3448a;

/* JADX INFO: renamed from: o3.ۣ۟ۢۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3667 {

    /* JADX INFO: renamed from: ۟ۢۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int f11133 = -910;

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static int m6514() {
        return 98 ^ C3619.f11082;
    }

    /* JADX INFO: renamed from: ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static C1357e m6515() {
        if (C3632.m6293() <= 0) {
            return C1371l.f4833a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static String m6516(String str) {
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

    /* JADX INFO: renamed from: ۦۨ۟۟, reason: contains not printable characters */
    public static int m6517() {
        if (C3534.m5817() > 0) {
            return AbstractC3448a.f10763a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m6518(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static String m6519(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
