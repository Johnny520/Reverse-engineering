package p090R3;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p038G3.AbstractC0517c;
import p076P.C3563;
import p116X1.C3591;
import p246u1.C3688;

/* JADX INFO: renamed from: R3.۟ۤۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3569 {

    /* JADX INFO: renamed from: ۟۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static int f11033 = 305;

    /* JADX INFO: renamed from: ۟۟ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static String m5993(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5995(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5996() {
        if (C3563.m5967() < 0) {
            return AbstractC0517c.f1652a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۧۧ, reason: not valid java name and contains not printable characters */
    public static void m5997(Object obj, Object obj2) {
        if (C3591.m6100() <= 0) {
            ((Configuration) obj).setLocales((LocaleList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۨۡ, reason: contains not printable characters */
    public static int m5998() {
        return (-768) ^ C3688.f11154;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m5994(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
