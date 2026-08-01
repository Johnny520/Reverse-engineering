package com.bumptech.glide;

import android.view.View;
import java.io.ByteArrayOutputStream;
import p041H0.C3547;
import p047I0.AbstractC0691Q;
import p048I1.InterfaceC0782g;
import p055K1.C3554;
import p095T.C1305C;
import p179i4.AbstractC2352g;
import p233s0.C3681;

/* JADX INFO: renamed from: com.bumptech.glide.۟ۧۦۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3617 {

    /* JADX INFO: renamed from: ۡ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static int f11080 = -691;

    /* JADX INFO: renamed from: ۟ۡۡۢۤ, reason: not valid java name and contains not printable characters */
    public static int m6220() {
        return 274 ^ C3547.f11011;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6221(String str) {
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

    /* JADX INFO: renamed from: ۡ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0782g m6222(Object obj) {
        if (C3681.m6583() >= 0) {
            return AbstractC2352g.m4206s((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۡۦ, reason: not valid java name and contains not printable characters */
    public static int m6223(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۧ, reason: not valid java name and contains not printable characters */
    public static C1305C m6225() {
        if (C3554.m5926() <= 0) {
            return AbstractC0691Q.f2210a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m6224(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
