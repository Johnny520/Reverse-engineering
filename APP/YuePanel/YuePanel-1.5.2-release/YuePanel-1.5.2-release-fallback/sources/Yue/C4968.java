package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4968 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int m19393(int r0, int r1, int r2) {
            int r0 = m19397(r0, r2)
            int r1 = m19397(r1, r2)
            int r0 = r0 - r1
            int r0 = m19397(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long m19394(long r0, long r2, long r4) {
            long r0 = m19398(r0, r4)
            long r2 = m19398(r2, r4)
            long r0 = r0 - r2
            long r0 = m19398(r0, r4)
            return r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m19395(int r0, int r1, int r2) {
            if (r2 <= 0) goto Lb
            if (r0 < r1) goto L5
            goto L16
        L5:
            int r0 = m19393(r1, r0, r2)
            int r1 = r1 - r0
            goto L16
        Lb:
            if (r2 >= 0) goto L17
            if (r0 > r1) goto L10
            goto L16
        L10:
            int r2 = -r2
            int r0 = m19393(r0, r1, r2)
            int r1 = r1 + r0
        L16:
            return r1
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step is zero."
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long m19396(long r7, long r9, long r11) {
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 <= 0) goto L14
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto Lb
            goto L23
        Lb:
            r0 = r9
            r2 = r7
            r4 = r11
            long r7 = m19394(r0, r2, r4)
            long r9 = r9 - r7
            goto L23
        L14:
            if (r0 >= 0) goto L24
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L1b
            goto L23
        L1b:
            long r5 = -r11
            r1 = r7
            r3 = r9
            long r7 = m19394(r1, r3, r5)
            long r9 = r9 + r7
        L23:
            return r9
        L24:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Step is zero."
            r7.<init>(r8)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m19397(int r0, int r1) {
            int r0 = r0 % r1
            if (r0 < 0) goto L4
            goto L5
        L4:
            int r0 = r0 + r1
        L5:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final long m19398(long r2, long r4) {
            long r2 = r2 % r4
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L8
            goto L9
        L8:
            long r2 = r2 + r4
        L9:
            return r2
    }
}
