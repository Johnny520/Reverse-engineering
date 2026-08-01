package p054K;

import android.content.Context;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import me.dartcv.nuke.C3655;
import p009B2.C3530;
import p056K2.InterfaceC0877c;
import p095T.InterfaceC1373m;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p192l.C3647;

/* JADX INFO: renamed from: K.۟ۤ۠۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3553 {

    /* JADX INFO: renamed from: ۧۥۡۤ, reason: not valid java name and contains not printable characters */
    public static int f11017 = 968;

    /* JADX INFO: renamed from: ۟ۡ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m5916() {
        return (-30) ^ C3530.f10994;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static C1843e m5917(int i5, Object obj, Object obj2) {
        if (C3647.m6366() >= 0) {
            return AbstractC1848j.m3314c(i5, (InterfaceC0877c) obj, (InterfaceC1373m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static Resources m5918(Object obj) {
        if (C3655.m6406() < 0) {
            return ((Context) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۤ۠, reason: contains not printable characters */
    public static String m5920(String str) {
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

    /* JADX INFO: renamed from: ۨۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5921(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۧۦۣ, reason: not valid java name and contains not printable characters */
    public static String m5919(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
