package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.1")
public final class C3557 implements java.lang.Comparable<Yue.C3557> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3557.C3558 f11342 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f11343 = 255;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C3557 f11344 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f11345;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f11346;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f11347;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f11348;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧۨ$ۥ, reason: contains not printable characters */
    public static final class C3558 {
        public C3558() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3558(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۠ۦۧۨ$ۥ r0 = new Yue.ۥ۠ۦۧۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3557.f11342 = r0
            Yue.ۥ۠ۦۧۨ r0 = Yue.C3559.m14486()
            Yue.C3557.f11344 = r0
            return
    }

    public C3557(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C3557(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f11345 = r1
            r0.f11346 = r2
            r0.f11347 = r3
            int r1 = r0.m14485(r1, r2, r3)
            r0.f11348 = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Yue.C3557 r1) {
            r0 = this;
            Yue.ۥ۠ۦۧۨ r1 = (Yue.C3557) r1
            int r1 = r0.m14479(r1)
            return r1
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C3557
            if (r1 == 0) goto Lb
            Yue.ۥ۠ۦۧۨ r4 = (Yue.C3557) r4
            goto Lc
        Lb:
            r4 = 0
        Lc:
            r1 = 0
            if (r4 != 0) goto L10
            return r1
        L10:
            int r2 = r3.f11348
            int r4 = r4.f11348
            if (r2 != r4) goto L17
            goto L18
        L17:
            r0 = r1
        L18:
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f11348
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.f11345
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r2 = r3.f11346
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f11347
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m14479(@Yue.InterfaceC4418 Yue.C3557 r2) {
            r1 = this;
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            int r0 = r1.f11348
            int r2 = r2.f11348
            int r0 = r0 - r2
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m14480() {
            r1 = this;
            int r0 = r1.f11345
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m14481() {
            r1 = this;
            int r0 = r1.f11346
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m14482() {
            r1 = this;
            int r0 = r1.f11347
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m14483(int r2, int r3) {
            r1 = this;
            int r0 = r1.f11345
            if (r0 > r2) goto Ld
            if (r0 != r2) goto Lb
            int r2 = r1.f11346
            if (r2 < r3) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m14484(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.f11345
            if (r0 > r2) goto L13
            if (r0 != r2) goto L11
            int r2 = r1.f11346
            if (r2 > r3) goto L13
            if (r2 != r3) goto L11
            int r2 = r1.f11347
            if (r2 < r4) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int m14485(int r4, int r5, int r6) {
            r3 = this;
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            r0.<init>(r1, r2)
            boolean r0 = r0.m13745(r4)
            if (r0 == 0) goto L2b
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            r0.<init>(r1, r2)
            boolean r0 = r0.m13745(r5)
            if (r0 == 0) goto L2b
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            r0.<init>(r1, r2)
            boolean r0 = r0.m13745(r6)
            if (r0 == 0) goto L2b
            int r4 = r4 << 16
            int r5 = r5 << 8
            int r4 = r4 + r5
            int r4 = r4 + r6
            return r4
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Version components are out of range: "
            r0.append(r1)
            r0.append(r4)
            r4 = 46
            r0.append(r4)
            r0.append(r5)
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }
}
