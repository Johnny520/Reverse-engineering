package androidx.constraintlayout.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۣ۟ۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0018 {

    /* JADX INFO: renamed from: ۢۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f18 = 205;

    /* JADX INFO: renamed from: ۟۠ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m72(java.lang.String r8) {
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r2 = ""
            r0 = r1
        L6:
            r4 = 15
            if (r0 < r4) goto L33
        La:
            int r0 = r3.length()
            if (r0 > 0) goto La
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            int r0 = r8.length()
            int r0 = r0 / 2
            r4.<init>(r0)
            r0 = r1
        L1c:
            int r5 = r8.length()
            if (r0 < r5) goto L66
            byte[] r0 = r4.toByteArray()
            int r3 = r0.length
            int r4 = r2.length()
        L2b:
            if (r1 < r3) goto L81
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        L33:
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
        L66:
            char r5 = r8.charAt(r0)
            int r5 = r3.indexOf(r5)
            int r5 = r5 << 4
            int r6 = r0 + 1
            char r6 = r8.charAt(r6)
            int r6 = r3.indexOf(r6)
            r5 = r5 | r6
            r4.write(r5)
            int r0 = r0 + 2
            goto L1c
        L81:
            r5 = r0[r1]
            int r6 = r1 % r4
            char r6 = r2.charAt(r6)
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r0[r1] = r5
            int r1 = r1 + 1
            goto L2b
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۡ, reason: not valid java name and contains not printable characters */
    public static int m73(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m74(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۣۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m75() {
            r0 = -666(0xfffffffffffffd66, float:NaN)
            int r1 = com.ljx.wechatmod.ui.C0067.f67
            r0 = r0 ^ r1
            return r0
    }
}
