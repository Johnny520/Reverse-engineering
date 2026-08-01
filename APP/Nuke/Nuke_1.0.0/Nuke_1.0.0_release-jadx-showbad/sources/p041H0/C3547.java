package p041H0;

import android.content.pm.PackageInfo;
import android.content.pm.SigningInfo;
import java.io.ByteArrayOutputStream;
import p019D1.C3537;

/* JADX INFO: renamed from: H0.۟ۦۤۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3547 {

    /* JADX INFO: renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static int f11011 = -999;

    /* JADX INFO: renamed from: ۟ۤۡۥۦ, reason: not valid java name and contains not printable characters */
    public static SigningInfo m5876(Object obj) {
        if (C3548.m5881() >= 0) {
            return ((PackageInfo) obj).signingInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m5877(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۢ۠, reason: not valid java name and contains not printable characters */
    public static int m5879() {
        return 250 ^ C3537.f11001;
    }

    /* JADX INFO: renamed from: ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5880(String str) {
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

    /* JADX INFO: renamed from: ۡۤ۠۠, reason: not valid java name and contains not printable characters */
    public static String m5878(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
