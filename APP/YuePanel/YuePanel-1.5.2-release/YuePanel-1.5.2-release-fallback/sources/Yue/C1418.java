package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1418 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final java.lang.Object f4521;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> f4522;

    public C1418(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r2) {
            r0 = this;
            r0.<init>()
            r0.f4521 = r1
            r0.f4522 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C1418 m7043(Yue.C1418 r0, java.lang.Object r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.Object r1 = r0.f4521
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r2 = r0.f4522
        Lc:
            Yue.ۥ۟ۦۣۣ r0 = r0.m7046(r1, r2)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C1418
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۦۣۣ r5 = (Yue.C1418) r5
            java.lang.Object r1 = r4.f4521
            java.lang.Object r3 = r5.f4521
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r1 = r4.f4522
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r5 = r5.f4522
            boolean r5 = Yue.C3329.m13897(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f4521
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r1 = r2.f4522
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CompletedWithCancellation(result="
            r0.append(r1)
            java.lang.Object r1 = r2.f4521
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r1 = r2.f4522
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m7044() {
            r1 = this;
            java.lang.Object r0 = r1.f4521
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> m7045() {
            r1 = this;
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r0 = r1.f4522
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C1418 m7046(@Yue.InterfaceC4543 java.lang.Object r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r3) {
            r1 = this;
            Yue.ۥ۟ۦۣۣ r0 = new Yue.ۥ۟ۦۣۣ
            r0.<init>(r2, r3)
            return r0
    }
}
