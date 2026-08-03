package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5705 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5705.C5706 f20966 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f20967 = 65535;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f20968 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f20969 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f20970 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f20971 = 5;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f20972 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f20973 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f20974 = 10;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f20975;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final int[] f20976;

    /* JADX INFO: renamed from: Yue.ۥۡۨۥۦ$ۥ, reason: contains not printable characters */
    public static final class C5706 {
        public C5706() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5706(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۡۨۥۦ$ۥ r0 = new Yue.ۥۡۨۥۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5705.f20966 = r0
            return
    }

    public C5705() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.f20976 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m21315() {
            r7 = this;
            r0 = 0
            r7.f20975 = r0
            int[] r1 = r7.f20976
            r5 = 6
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            Yue.C0586.m2246(r1, r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int m21316(int r2) {
            r1 = this;
            int[] r0 = r1.f20976
            r2 = r0[r2]
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m21317(boolean r2) {
            r1 = this;
            int r0 = r1.f20975
            r0 = r0 & 4
            if (r0 == 0) goto L11
            int[] r2 = r1.f20976
            r0 = 2
            r2 = r2[r0]
            r0 = 1
            if (r2 != r0) goto L10
            r2 = r0
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m21318() {
            r2 = this;
            int r0 = r2.f20975
            r0 = r0 & 2
            if (r0 == 0) goto Lc
            int[] r0 = r2.f20976
            r1 = 1
            r0 = r0[r1]
            goto Ld
        Lc:
            r0 = -1
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m21319() {
            r2 = this;
            int r0 = r2.f20975
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lc
            int[] r0 = r2.f20976
            r1 = 7
            r0 = r0[r1]
            goto Lf
        Lc:
            r0 = 65535(0xffff, float:9.1834E-41)
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m21320() {
            r2 = this;
            int r0 = r2.f20975
            r0 = r0 & 16
            if (r0 == 0) goto Lc
            int[] r0 = r2.f20976
            r1 = 4
            r0 = r0[r1]
            goto Lf
        Lc:
            r0 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m21321(int r2) {
            r1 = this;
            int r0 = r1.f20975
            r0 = r0 & 32
            if (r0 == 0) goto Lb
            int[] r2 = r1.f20976
            r0 = 5
            r2 = r2[r0]
        Lb:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m21322(int r2) {
            r1 = this;
            int r0 = r1.f20975
            r0 = r0 & 64
            if (r0 == 0) goto Lb
            int[] r2 = r1.f20976
            r0 = 6
            r2 = r2[r0]
        Lb:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m21323(int r3) {
            r2 = this;
            r0 = 1
            int r3 = r0 << r3
            int r1 = r2.f20975
            r3 = r3 & r1
            if (r3 == 0) goto L9
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m21324(@Yue.InterfaceC4418 Yue.C5705 r3) {
            r2 = this;
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
        L6:
            r1 = 10
            if (r0 >= r1) goto L1a
            boolean r1 = r3.m21323(r0)
            if (r1 == 0) goto L17
            int r1 = r3.m21316(r0)
            r2.m21325(r0, r1)
        L17:
            int r0 = r0 + 1
            goto L6
        L1a:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Yue.C5705 m21325(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L11
            int[] r0 = r3.f20976
            int r1 = r0.length
            if (r4 < r1) goto L8
            goto L11
        L8:
            r1 = 1
            int r1 = r1 << r4
            int r2 = r3.f20975
            r1 = r1 | r2
            r3.f20975 = r1
            r0[r4] = r5
        L11:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int m21326() {
            r1 = this;
            int r0 = r1.f20975
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }
}
