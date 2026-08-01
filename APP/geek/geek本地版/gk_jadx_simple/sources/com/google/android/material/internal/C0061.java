package com.google.android.material.internal;

import androidx.core.content.C0023;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.internal.۟۟ۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0061 {

    /* JADX INFO: renamed from: ۡ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static int f61 = 478;

    /* JADX INFO: renamed from: ۟ۤۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int m244() {
        return 59 ^ C0023.f23;
    }

    /* JADX INFO: renamed from: ۠۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m246(Object r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۟ۢ, reason: contains not printable characters */
    public static String m247(String r8) {
        int r1 = 0;
        String r3 = "";
        int r0 = 0;
        String r2 = "";
    L4:
        if (r0 >= 15) goto L5;
        r3 = new StringBuffer().append(r3).append(Integer.toHexString(r0)).toString();
        String r22 = new StringBuffer().append(r2).append(((int) (Math.random() * ((double) 10))) ^ r0).toString();
        r0 = r0 + 1;
        r2 = r22;
        goto L4
    L5:
        ByteArrayOutputStream r4 = new ByteArrayOutputStream(r8.length() / 2);
        int r02 = 0;
    L7:
        if (r02 >= r8.length()) goto L8;
        r4.write((r3.indexOf(r8.charAt(r02)) << 4) | r3.indexOf(r8.charAt(r02 + 1)));
        r02 = r02 + 2;
        goto L7
    L8:
        byte[] r03 = r4.toByteArray();
        int r32 = r03.length;
        int r42 = r2.length();
    L9:
        if (r32 <= 0) goto L11;
        r03[-1] = (byte) (r03[-1] ^ r2.charAt((-1) % r42));
    L11:
        if (r1 >= r03.length) goto L13;
        r1 = "".length() + 1;
        goto L11
    L13:
        return new String(r03);
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۢ, reason: not valid java name and contains not printable characters */
    public static String m245(short[] r3, int r4, int r5, int r6) {
        char[] r1 = new char[r5];
        int r0 = 0;
    L3:
        if (r0 >= r5) goto L6;
        r1[r0] = (char) (r3[r4 + r0] ^ r6);
        r0 = r0 + 1;
        goto L3
    L6:
        return new String(r1);
    }
}
