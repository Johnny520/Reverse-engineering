package p015C2;

import android.content.res.Configuration;
import androidx.window.reflection.C3611;
import java.io.ByteArrayOutputStream;
import p031F2.C3544;
import p056K2.C0884j;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p131a2.C3599;
import p135b.AbstractC1826n;
import p135b.C1827o;
import p159f1.C3625;
import p220p4.C3673;

/* JADX INFO: renamed from: C2.۟ۡۤۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3534 {

    /* JADX INFO: renamed from: ۟ۤۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int f10998 = -453;

    /* JADX INFO: renamed from: ۣ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static C1827o m5810() {
        if (C3673.m6547() >= 0) {
            return AbstractC1826n.f6225c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨ۠, reason: not valid java name and contains not printable characters */
    public static int m5812(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۡۦ, reason: not valid java name and contains not printable characters */
    public static int m5813(Object obj) {
        if (C3611.m6196() > 0) {
            return ((Configuration) obj).uiMode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static C0884j m5814(Object obj) {
        if (C3544.m5863() < 0) {
            return AbstractC1784a.m3229o((Throwable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m5815(String str) {
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

    /* JADX INFO: renamed from: ۧۡۥ۟, reason: not valid java name and contains not printable characters */
    public static void m5816(Object obj, Object obj2) {
        if (C3599.m6134() <= 0) {
            AbstractC1665j.m2984d(obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m5817() {
        return (-12) ^ C3625.f11088;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String m5811(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
