package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3913 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f12451;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3279 f12452;

    public C3913(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 Yue.C3279 r3) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f12451 = r2
            r1.f12452 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C3913 m15868(Yue.C3913 r0, java.lang.String r1, Yue.C3279 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.f12451
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            Yue.ۥ۠ۥۣۨ r2 = r0.f12452
        Lc:
            Yue.ۥ۠ۨۨۨ r0 = r0.m15871(r1, r2)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C3913
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۠ۨۨۨ r5 = (Yue.C3913) r5
            java.lang.String r1 = r4.f12451
            java.lang.String r3 = r5.f12451
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            Yue.ۥ۠ۥۣۨ r1 = r4.f12452
            Yue.ۥ۠ۥۣۨ r5 = r5.f12452
            boolean r5 = Yue.C3329.m13897(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f12451
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            Yue.ۥ۠ۥۣۨ r1 = r2.f12452
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MatchGroup(value="
            r0.append(r1)
            java.lang.String r1 = r2.f12451
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            Yue.ۥ۠ۥۣۨ r1 = r2.f12452
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String m15869() {
            r1 = this;
            java.lang.String r0 = r1.f12451
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C3279 m15870() {
            r1 = this;
            Yue.ۥ۠ۥۣۨ r0 = r1.f12452
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C3913 m15871(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 Yue.C3279 r3) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۠ۨۨۨ r0 = new Yue.ۥ۠ۨۨۨ
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.C3279 m15872() {
            r1 = this;
            Yue.ۥ۠ۥۣۨ r0 = r1.f12452
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.lang.String m15873() {
            r1 = this;
            java.lang.String r0 = r1.f12451
            return r0
    }
}
