package androidx.constraintlayout.helper.widget;

import com.google.android.material.behavior.C0050;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.۟ۥ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0017 {

    /* JADX INFO: renamed from: ۧۥۣۦ, reason: not valid java name and contains not printable characters */
    public static int f17 = 731;

    /* JADX INFO: renamed from: ۟ۢ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m68(String r8) {
        int r0 = 0;
        String r3 = "";
        int r1 = 0;
        String r2 = "";
    L4:
        if (r1 >= 15) goto L5;
        r3 = new StringBuffer().append(r3).append(Integer.toHexString(r1)).toString();
        String r22 = new StringBuffer().append(r2).append(((int) (Math.random() * ((double) 10))) ^ r1).toString();
        r1 = r1 + 1;
        r2 = r22;
        goto L4
    L5:
        ByteArrayOutputStream r12 = new ByteArrayOutputStream(r8.length() / 2);
    L7:
        if (r8.length() <= 0) goto L8;
        r12.write((r3.indexOf(r8.charAt(-2)) << 4) | r3.indexOf(r8.charAt(-1)));
        goto L7
    L8:
        byte[] r13 = r12.toByteArray();
        int r32 = r13.length;
        int r4 = r2.length();
    L9:
        if (r0 >= r32) goto L11;
        r13[r0] = (byte) (r13[r0] ^ r2.charAt(r0 % r4));
        r0 = r0 + 1;
        goto L9
    L11:
        return new String(r13);
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int m70(Object r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: ۦۤۨۢ, reason: contains not printable characters */
    public static int m71() {
        return 652 ^ C0050.f50;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m69(short[] r3, int r4, int r5, int r6) {
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
