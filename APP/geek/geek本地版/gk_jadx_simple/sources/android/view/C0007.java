package android.view;

import androidx.activity.C0010;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: android.view.ۢۥۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0007 {

    /* JADX INFO: renamed from: ۣ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int f7 = 482;

    /* JADX INFO: renamed from: ۟۠ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static int m28(Object r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۤ, reason: not valid java name and contains not printable characters */
    public static String m29(String r8) {
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
        byte[] r32 = r4.toByteArray();
        int r42 = r32.length;
        int r5 = r2.length();
        int r03 = 0;
    L9:
        if (r03 >= r42) goto L11;
        r32[r03] = (byte) (r32[r03] ^ r2.charAt(r03 % r5));
        r03 = r03 + 1;
    L11:
        if (r1 >= r32.length) goto L13;
        r1 = "".length() + 1;
        goto L11
    L13:
        return new String(r32);
    }

    /* JADX INFO: renamed from: ۤۦۢ۟, reason: not valid java name and contains not printable characters */
    public static int m31() {
        return 145 ^ C0010.f10;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m30(short[] r3, int r4, int r5, int r6) {
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
