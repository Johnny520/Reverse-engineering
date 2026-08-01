package p243t4;

import java.io.ByteArrayOutputStream;
import p019D1.C3537;
import p117X2.AbstractC1676u;
import p117X2.C1660e;
import p231r3.C3679;

/* JADX INFO: renamed from: t4.ۣۣ۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3685 {

    /* JADX INFO: renamed from: ۥۣۢۡ, reason: contains not printable characters */
    public static int f11151 = 425;

    /* JADX INFO: renamed from: ۟ۡۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int m6601() {
        return 805 ^ C3537.f11001;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣ, reason: not valid java name and contains not printable characters */
    public static C1660e m6602(Object obj) {
        if (C3679.m6572() > 0) {
            return AbstractC1676u.m2995a((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m6603(String str) {
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

    /* JADX INFO: renamed from: ۥۦۨ, reason: contains not printable characters */
    public static int m6604(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m6600(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
