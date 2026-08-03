package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class i8 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final ۟.i8.a f495 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final p000.e f496 = null;

    public static final class a extends p000.i8 implements java.io.Serializable {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p000.i8
        /* JADX INFO: renamed from: ۥ */
        public final int mo128(int r2) {
                r1 = this;
                ۟.e r0 = p000.i8.f496
                int r2 = r0.mo128(r2)
                return r2
        }

        @Override // p000.i8
        /* JADX INFO: renamed from: ۥ۟ */
        public final int mo129() {
                r1 = this;
                ۟.e r0 = p000.i8.f496
                int r0 = r0.mo129()
                return r0
        }

        @Override // p000.i8
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final int mo139(int r2, int r3) {
                r1 = this;
                ۟.e r0 = p000.i8.f496
                int r2 = r0.mo139(r2, r3)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final int m199(int r2) {
                r1 = this;
                ۟.e r0 = p000.i8.f496
                int r2 = r0.m131(r2)
                return r2
        }
    }

    static {
            ۟.i8$a r0 = new ۟.i8$a
            r0.<init>()
            p000.i8.f495 = r0
            ۟.m4 r0 = p000.d8.f293
            r0.getClass()
            java.lang.Integer r0 = ۟.m4.a.f770
            if (r0 == 0) goto L1b
            int r0 = r0.intValue()
            r1 = 34
            if (r0 < r1) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            if (r0 == 0) goto L24
            ۟.e8 r0 = new ۟.e8
            r0.<init>()
            goto L29
        L24:
            ۟.s2 r0 = new ۟.s2
            r0.<init>()
        L29:
            p000.i8.f496 = r0
            return
    }

    public i8() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract int mo128(int r1);

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract int mo129();

    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo139(int r5, int r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 <= r5) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            if (r2 == 0) goto L3f
            int r2 = r6 - r5
            if (r2 > 0) goto L20
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r3) goto L12
            goto L20
        L12:
            int r2 = r4.mo129()
            if (r5 > r2) goto L1c
            if (r2 >= r6) goto L1c
            r3 = r1
            goto L1d
        L1c:
            r3 = r0
        L1d:
            if (r3 == 0) goto L12
            return r2
        L20:
            int r6 = -r2
            r6 = r6 & r2
            if (r6 != r2) goto L2f
            int r6 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r6 = 31 - r6
            int r6 = r4.mo128(r6)
            goto L3d
        L2f:
            int r6 = r4.mo129()
            int r6 = r6 >>> r1
            int r0 = r6 % r2
            int r6 = r6 - r0
            int r3 = r2 + (-1)
            int r3 = r3 + r6
            if (r3 < 0) goto L2f
            r6 = r0
        L3d:
            int r5 = r5 + r6
            return r5
        L3f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "from"
            p000.h4.m189(r0, r5)
            java.lang.String r0 = "until"
            p000.h4.m189(r0, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Random range is empty: ["
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ", "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }
}
