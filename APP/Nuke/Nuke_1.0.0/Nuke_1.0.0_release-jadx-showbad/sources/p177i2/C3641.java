package p177i2;

import java.io.ByteArrayOutputStream;
import p004A3.AbstractC0159d;
import p095T.InterfaceC1373m;
import p136b0.C1843e;
import p151e.C3622;
import p234s1.C3682;

/* JADX INFO: renamed from: i2.ۣ۟ۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3641 {

    /* JADX INFO: renamed from: ۧۧۨۡ, reason: not valid java name and contains not printable characters */
    public static int f11103 = -766;

    /* JADX INFO: renamed from: ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static int m6334() {
        return (-285) ^ C3622.f11085;
    }

    /* JADX INFO: renamed from: ۤۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m6335(String str) {
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

    /* JADX INFO: renamed from: ۥۥۧۨ, reason: contains not printable characters */
    public static void m6336(boolean z5, boolean z6, Object obj, Object obj2, int i5, int i6) {
        if (C3682.m6586() > 0) {
            AbstractC0159d.m228a(z5, z6, (C1843e) obj, (InterfaceC1373m) obj2, i5, i6);
        }
    }

    /* JADX INFO: renamed from: ۦۦۤ۟, reason: contains not printable characters */
    public static int m6337(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m6338(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
