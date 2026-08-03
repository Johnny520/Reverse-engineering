package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4677<A, B> implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final A f14894;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final B f14895;

    public C4677(A r1, B r2) {
            r0 = this;
            r0.<init>()
            r0.f14894 = r1
            r0.f14895 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C4677 m18536(Yue.C4677 r0, java.lang.Object r1, java.lang.Object r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            A r1 = r0.f14894
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            B r2 = r0.f14895
        Lc:
            Yue.ۥۣۡۦ۠ r0 = r0.m18539(r1, r2)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C4677
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥۣۡۦ۠ r5 = (Yue.C4677) r5
            A r1 = r4.f14894
            A r3 = r5.f14894
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            B r1 = r4.f14895
            B r5 = r5.f14895
            boolean r5 = Yue.C3329.m13897(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r3 = this;
            A r0 = r3.f14894
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            B r2 = r3.f14895
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            A r1 = r2.f14894
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            B r1 = r2.f14895
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final A m18537() {
            r1 = this;
            A r0 = r1.f14894
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final B m18538() {
            r1 = this;
            B r0 = r1.f14895
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C4677<A, B> m18539(A r2, B r3) {
            r1 = this;
            Yue.ۥۣۡۦ۠ r0 = new Yue.ۥۣۡۦ۠
            r0.<init>(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final A m18540() {
            r1 = this;
            A r0 = r1.f14894
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final B m18541() {
            r1 = this;
            B r0 = r1.f14895
            return r0
    }
}
