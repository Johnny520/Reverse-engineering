package kotlinx.coroutines;

import androidx.viewpager2.adapter.C0043;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: kotlinx.coroutines.ۣ۟ۧۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0069 {

    /* JADX INFO: renamed from: ۟۟ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int f69 = -35;

    /* JADX INFO: renamed from: ۡۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m276() {
        return (-718) ^ C0043.f43;
    }

    /* JADX INFO: renamed from: ۣۨۥۡ, reason: not valid java name and contains not printable characters */
    public static int m277(Object r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m279(String r8) {
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
        String r03 = "a";
    L10:
        if (r03.length() <= 0) goto L11;
        r03 = "";
        if ("".length() != 0) goto L10;
        r03 = "a";
        goto L10
    L11:
        int r42 = r03.length();
        int r5 = r2.length();
        int r04 = 0;
    L12:
        if (r04 >= r42) goto L14;
        r32[r04] = (byte) (r32[r04] ^ r2.charAt(r04 % r5));
        r04 = r04 + 1;
    L14:
        if (r1 >= r32.length) goto L16;
        r1 = "".length() + 1;
        goto L14
    L16:
        return new String(r32);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۨ, reason: contains not printable characters */
    public static String m278(short[] r3, int r4, int r5, int r6) {
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
