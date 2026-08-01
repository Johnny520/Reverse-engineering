package p193l0;

import java.io.ByteArrayOutputStream;
import java.util.Collection;
import p084Q2.C3565;
import p090R3.C3569;
import p135b.C1809A;
import p170h1.C3635;
import p259w3.C3394b;

/* JADX INFO: renamed from: l0.ۥۤۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3648 {

    /* JADX INFO: renamed from: ۟ۥۡۦۨ, reason: not valid java name and contains not printable characters */
    public static int f11110 = -6;

    /* JADX INFO: renamed from: ۟۠۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static C1809A m6369(Object obj) {
        if (C3565.m5977() > 0) {
            return ((C3394b) obj).f10618g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m6371(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6372(Object obj, Object obj2) {
        if (C3635.m6306() > 0) {
            return ((Collection) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m6373(String str) {
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

    /* JADX INFO: renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
    public static int m6374() {
        return 412 ^ C3569.f11033;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m6370(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
