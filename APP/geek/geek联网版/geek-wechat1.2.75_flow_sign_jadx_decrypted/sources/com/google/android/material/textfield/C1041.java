package com.google.android.material.textfield;

import androidx.activity.result.C0992;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.textfield.ۡۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1041 {

    /* JADX INFO: renamed from: ۢۦ۠۟, reason: not valid java name and contains not printable characters */
    public static int f5688 = 476;

    /* JADX INFO: renamed from: ۟۠۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m3074(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m3075(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
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

    /* JADX INFO: renamed from: ۢ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m3076() {
        return 6 ^ C0992.f5639;
    }

    /* JADX INFO: renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3077(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
