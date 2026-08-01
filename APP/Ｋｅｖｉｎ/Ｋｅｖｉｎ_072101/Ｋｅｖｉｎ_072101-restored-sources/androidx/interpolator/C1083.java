package androidx.interpolator;

/* JADX INFO: renamed from: androidx.interpolator.ۦۨۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1083 {

    /* JADX INFO: renamed from: ۟ۦۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f109 = -446;

    /* JADX INFO: renamed from: ۟ۦۡۨۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m1723(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m1724(java.lang.String r8) {
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r2 = ""
            r0 = r1
        L6:
            r4 = 15
            if (r0 < r4) goto L31
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            int r0 = r8.length()
            int r0 = r0 / 2
            r4.<init>(r0)
            r0 = r1
        L16:
            int r5 = r8.length()
            if (r0 < r5) goto L64
            byte[] r3 = r4.toByteArray()
            int r4 = r3.length
            int r5 = r2.length()
            r0 = r1
        L26:
            if (r0 < r4) goto L7f
        L28:
            int r0 = r3.length
            if (r1 < r0) goto L8e
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        L31:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r3 = r4.append(r3)
            java.lang.String r4 = java.lang.Integer.toHexString(r0)
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
            r4 = r4 ^ r0
            java.lang.StringBuffer r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r0 = r0 + 1
            goto L6
        L64:
            char r5 = r8.charAt(r0)
            int r5 = r3.indexOf(r5)
            int r5 = r5 << 4
            int r6 = r0 + 1
            char r6 = r8.charAt(r6)
            int r6 = r3.indexOf(r6)
            r5 = r5 | r6
            r4.write(r5)
            int r0 = r0 + 2
            goto L16
        L7f:
            r6 = r3[r0]
            int r7 = r0 % r5
            char r7 = r2.charAt(r7)
            r6 = r6 ^ r7
            byte r6 = (byte) r6
            r3[r0] = r6
            int r0 = r0 + 1
            goto L26
        L8e:
            java.lang.String r0 = ""
            int r0 = r0.length()
            int r1 = r0 + 1
            goto L28
    }

    /* JADX INFO: renamed from: ۣۤۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1725() {
            r0 = -555(0xfffffffffffffdd5, float:NaN)
            int r1 = org.luckypray.dexkit.C1124.f434
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۨۡۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1726(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }
}
