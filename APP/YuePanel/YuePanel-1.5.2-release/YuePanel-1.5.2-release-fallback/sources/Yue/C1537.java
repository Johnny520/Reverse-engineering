package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1537 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int[] f4954 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long[] f4955 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Object[] f4956 = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            Yue.C1537.f4954 = r1
            long[] r1 = new long[r0]
            Yue.C1537.f4955 = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            Yue.C1537.f4956 = r0
            return
    }

    public C1537() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m7665(int[] r3, int r4, int r5) {
            int r4 = r4 + (-1)
            r0 = 0
        L3:
            if (r0 > r4) goto L18
            int r1 = r0 + r4
            int r1 = r1 >>> 1
            r2 = r3[r1]
            if (r2 >= r5) goto L11
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L11:
            if (r2 <= r5) goto L17
            int r1 = r1 + (-1)
            r4 = r1
            goto L3
        L17:
            return r1
        L18:
            int r3 = ~r0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m7666(long[] r4, int r5, long r6) {
            int r5 = r5 + (-1)
            r0 = 0
        L3:
            if (r0 > r5) goto L1a
            int r1 = r0 + r5
            int r1 = r1 >>> 1
            r2 = r4[r1]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L13
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L13:
            if (r2 <= 0) goto L19
            int r1 = r1 + (-1)
            r5 = r1
            goto L3
        L19:
            return r1
        L1a:
            int r4 = ~r0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m7667(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m7668(int r2) {
            r0 = 4
        L1:
            r1 = 32
            if (r0 >= r1) goto Lf
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto Lc
            return r1
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m7669(int r0) {
            int r0 = r0 * 4
            int r0 = m7668(r0)
            int r0 = r0 / 4
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m7670(int r0) {
            int r0 = r0 * 8
            int r0 = m7668(r0)
            int r0 = r0 / 8
            return r0
    }
}
