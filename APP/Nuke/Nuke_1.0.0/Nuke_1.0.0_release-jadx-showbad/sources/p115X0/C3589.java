package p115X0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayOutputStream;
import p019D1.C3538;
import p026E3.C3542;
import p151e.C3622;

/* JADX INFO: renamed from: X0.۟ۥ۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3589 {

    /* JADX INFO: renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f11053 = 697;

    /* JADX INFO: renamed from: ۟ۢۤۤۡ, reason: not valid java name and contains not printable characters */
    public static int m6090(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static Context m6091(Object obj) {
        if (C3542.m5851() >= 0) {
            return ((View) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨ۠, reason: not valid java name and contains not printable characters */
    public static int m6093() {
        return 892 ^ C3538.f11002;
    }

    /* JADX INFO: renamed from: ۣۡ۟۠, reason: not valid java name and contains not printable characters */
    public static void m6094(Object obj, Object obj2) {
        if (C3622.m3665() > 0) {
            ((ViewGroup) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m2946(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static String m6092(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
