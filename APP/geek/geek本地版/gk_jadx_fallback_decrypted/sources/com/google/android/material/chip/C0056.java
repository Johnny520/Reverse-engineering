package com.google.android.material.chip;

/* JADX INFO: renamed from: com.google.android.material.chip.ۣۣ۟۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0056 {

    /* JADX INFO: renamed from: ۟۟ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static int f56 = -274;

    /* JADX INFO: renamed from: ۟ۢۧۨۡ, reason: not valid java name and contains not printable characters */
    public static int m224() {
            r0 = -823(0xfffffffffffffcc9, float:NaN)
            int r1 = androidx.legacy.content.C0028.f28
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m225(java.lang.String r8) {
            r0 = 0
            java.lang.String r3 = ""
            java.lang.String r2 = ""
            r1 = r0
        L6:
            r4 = 15
            if (r1 < r4) goto L2c
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r4 = r8.length()
            int r4 = r4 / 2
            r1.<init>(r4)
        L15:
            int r4 = r8.length()
            if (r4 > 0) goto L5f
            byte[] r1 = r1.toByteArray()
            int r3 = r1.length
            int r4 = r2.length()
        L24:
            if (r0 < r3) goto L78
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
        L2c:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r3 = r4.append(r3)
            java.lang.String r4 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuffer r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r2 = r4.append(r2)
            double r4 = java.lang.Math.random()
            r6 = 10
            double r6 = (double) r6
            double r4 = r4 * r6
            int r4 = (int) r4
            r4 = r4 ^ r1
            java.lang.StringBuffer r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r1 = r1 + 1
            goto L6
        L5f:
            r4 = -2
            char r4 = r8.charAt(r4)
            int r4 = r3.indexOf(r4)
            int r4 = r4 << 4
            r5 = -1
            char r5 = r8.charAt(r5)
            int r5 = r3.indexOf(r5)
            r4 = r4 | r5
            r1.write(r4)
            goto L15
        L78:
            r5 = r1[r0]
            int r6 = r0 % r4
            char r6 = r2.charAt(r6)
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r1[r0] = r5
            int r0 = r0 + 1
            goto L24
    }

    /* JADX INFO: renamed from: ۡۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m226(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m227(short[] r3, int r4, int r5, int r6) {
            char[] r1 = new char[r5]
            r0 = 0
        L3:
            if (r0 >= r5) goto L10
            int r2 = r4 + r0
            short r2 = r3[r2]
            r2 = r2 ^ r6
            char r2 = (char) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L3
        L10:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }
}
