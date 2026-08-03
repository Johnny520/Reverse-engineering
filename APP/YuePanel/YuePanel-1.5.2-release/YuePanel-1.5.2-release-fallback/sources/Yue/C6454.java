package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6454<A, B, C> implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final A f22740;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final B f22741;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C f22742;

    public C6454(A r1, B r2, C r3) {
            r0 = this;
            r0.<init>()
            r0.f22740 = r1
            r0.f22741 = r2
            r0.f22742 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6454 m23769(Yue.C6454 r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            A r1 = r0.f22740
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            B r2 = r0.f22741
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            C r3 = r0.f22742
        L12:
            Yue.ۥۢۢۢ۟ r0 = r0.m23773(r1, r2, r3)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C6454
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥۢۢۢ۟ r5 = (Yue.C6454) r5
            A r1 = r4.f22740
            A r3 = r5.f22740
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            B r1 = r4.f22741
            B r3 = r5.f22741
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            C r1 = r4.f22742
            C r5 = r5.f22742
            boolean r5 = Yue.C3329.m13897(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public int hashCode() {
            r3 = this;
            A r0 = r3.f22740
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            B r2 = r3.f22741
            if (r2 != 0) goto L13
            r2 = r1
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            C r2 = r3.f22742
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r1 = r2.hashCode()
        L23:
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            A r1 = r3.f22740
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            B r2 = r3.f22741
            r0.append(r2)
            r0.append(r1)
            C r1 = r3.f22742
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final A m23770() {
            r1 = this;
            A r0 = r1.f22740
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final B m23771() {
            r1 = this;
            B r0 = r1.f22741
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C m23772() {
            r1 = this;
            C r0 = r1.f22742
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C6454<A, B, C> m23773(A r2, B r3, C r4) {
            r1 = this;
            Yue.ۥۢۢۢ۟ r0 = new Yue.ۥۢۢۢ۟
            r0.<init>(r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final A m23774() {
            r1 = this;
            A r0 = r1.f22740
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final B m23775() {
            r1 = this;
            B r0 = r1.f22741
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C m23776() {
            r1 = this;
            C r0 = r1.f22742
            return r0
    }
}
