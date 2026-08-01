package androidx.constraintlayout.widget;

import androidx.savedstate.C0034;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.۠ۥۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0020 {

    /* JADX INFO: renamed from: ۡۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f20 = -254;

    /* JADX INFO: renamed from: ۟۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m80(Object r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m81(String r8) {
        int r1 = 0;
        String r3 = "";
        int r0 = 0;
        String r2 = "";
    L4:
        if (r0 >= 15) goto L6;
        r3 = new StringBuffer().append(r3).append(Integer.toHexString(r0)).toString();
        String r22 = new StringBuffer().append(r2).append(((int) (Math.random() * ((double) 10))) ^ r0).toString();
        r0 = r0 + 1;
        r2 = r22;
    L6:
        if (r3.length() > 0) goto L6;
        ByteArrayOutputStream r4 = new ByteArrayOutputStream(r8.length() / 2);
        int r02 = 0;
    L9:
        if (r02 >= r8.length()) goto L10;
        r4.write((r3.indexOf(r8.charAt(r02)) << 4) | r3.indexOf(r8.charAt(r02 + 1)));
        r02 = r02 + 2;
        goto L9
    L10:
        byte[] r03 = r4.toByteArray();
        int r32 = r03.length;
        int r42 = r2.length();
    L11:
        if (r1 >= r32) goto L13;
        r03[r1] = (byte) (r03[r1] ^ r2.charAt(r1 % r42));
        r1 = r1 + 1;
        goto L11
    L13:
        return new String(r03);
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m82() {
        return (-738) ^ C0034.f34;
    }

    /* JADX INFO: renamed from: ۥۥۥۣ, reason: contains not printable characters */
    public static String m83(short[] r3, int r4, int r5, int r6) {
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
