package p203n;

import android.content.Context;
import android.content.res.Configuration;
import java.io.ByteArrayOutputStream;
import p030F1.AbstractC0442g;
import p056K2.AbstractC0885k;
import p059L0.C3557;
import p151e.C3622;
import p234s1.C3682;
import p243t4.C3685;

/* JADX INFO: renamed from: n.۟ۥۥۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3658 {

    /* JADX INFO: renamed from: ۣ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int f11121 = -811;

    /* JADX INFO: renamed from: ۟ۡۧۢ۠, reason: not valid java name and contains not printable characters */
    public static String m6418(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۣ۟۠, reason: not valid java name and contains not printable characters */
    public static int m6419() {
        return 160 ^ C3682.f11148;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m6420(Object obj) {
        if (C3622.m3665() > 0) {
            ((AbstractC0442g) obj).m709a();
        }
    }

    /* JADX INFO: renamed from: ۣۢۥۢ, reason: not valid java name and contains not printable characters */
    public static int m6421(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۧۦ۠, reason: not valid java name and contains not printable characters */
    public static Throwable m6422(Object obj) {
        if (C3685.m6601() <= 0) {
            return AbstractC0885k.m1902a(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦ, reason: contains not printable characters */
    public static Context m6424(Object obj, Object obj2) {
        if (C3557.m5938() >= 0) {
            return ((Context) obj).createConfigurationContext((Configuration) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static String m6423(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
