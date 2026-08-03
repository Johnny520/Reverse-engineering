package p000;

/* JADX INFO: renamed from: U7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0867U7 {

    /* JADX INFO: renamed from: a */
    public final String f2737a;

    /* JADX INFO: renamed from: b */
    public final int f2738b;

    /* JADX INFO: renamed from: c */
    public final String f2739c;

    /* JADX INFO: renamed from: d */
    public final int f2740d;

    /* JADX INFO: renamed from: e */
    public final int f2741e;

    /* JADX INFO: renamed from: f */
    public final long f2742f;

    public C0867U7(String r3, int r4, String r5, int r6, int r7, long r8) {
        AbstractC0295Gu.m625r(-500604208150581L);
        AbstractC0295Gu.m625r(-500629977954357L);
        this.f2737a = r3;
        this.f2738b = r4;
        this.f2739c = r5;
        this.f2740d = r6;
        this.f2741e = r7;
        this.f2742f = r8;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof C0867U7) == false) goto L28;
        C0867U7 r52 = (C0867U7) r5;
        if (AbstractC0585Nj.m1134a(this.f2737a, r52.f2737a) == true) goto L11;
        return false;
    L11:
        if (this.f2738b == r52.f2738b) goto L14;
        return false;
    L14:
        if (AbstractC0585Nj.m1134a(this.f2739c, r52.f2739c) == true) goto L17;
        return false;
    L17:
        if (this.f2740d == r52.f2740d) goto L20;
        return false;
    L20:
        if (this.f2741e == r52.f2741e) goto L23;
        return false;
    L23:
        if (this.f2742f == r52.f2742f) goto L26;
        return false;
    L26:
        return true;
    L28:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f2737a.hashCode() * 31;
        int r02 = AbstractC0213Ey.m403a(this.f2738b, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.f2739c, r02, 31);
        int r04 = AbstractC0213Ey.m403a(this.f2740d, r03, 31);
        int r05 = AbstractC0213Ey.m403a(this.f2741e, r04, 31);
        return Long.hashCode(this.f2742f) + r05;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-500776006842421L));
        AbstractC2374ph.m4817n(r0, this.f2737a, -500312150374453L);
        AbstractC0213Ey.m418p(r0, this.f2738b, -500355100047413L);
        AbstractC2374ph.m4817n(r0, this.f2739c, -500428114491445L);
        AbstractC0213Ey.m418p(r0, this.f2740d, -500453884295221L);
        AbstractC0213Ey.m418p(r0, this.f2741e, -500492539000885L);
        r0.append(this.f2742f);
        r0.append(')');
        return r0.toString();
    }
}
