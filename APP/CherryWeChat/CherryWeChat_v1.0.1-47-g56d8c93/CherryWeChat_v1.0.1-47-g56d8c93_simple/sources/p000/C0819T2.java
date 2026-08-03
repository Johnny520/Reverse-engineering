package p000;

/* JADX INFO: renamed from: T2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0819T2 {

    /* JADX INFO: renamed from: a */
    public final String f2586a;

    /* JADX INFO: renamed from: b */
    public final String f2587b;

    /* JADX INFO: renamed from: c */
    public final int f2588c;

    /* JADX INFO: renamed from: d */
    public final boolean f2589d;

    /* JADX INFO: renamed from: e */
    public final int f2590e;

    /* JADX INFO: renamed from: f */
    public final int f2591f;

    public C0819T2(int r3, int r4, int r5, String r6, String r7, boolean r8) {
        AbstractC0295Gu.m625r(-395252955346997L);
        AbstractC0295Gu.m625r(-395274430183477L);
        this.f2586a = r6;
        this.f2587b = r7;
        this.f2588c = r3;
        this.f2589d = r8;
        this.f2590e = r4;
        this.f2591f = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0819T2) == true) goto L8;
        return false;
    L8:
        C0819T2 r52 = (C0819T2) r5;
        if (AbstractC0585Nj.m1134a(this.f2586a, r52.f2586a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f2587b, r52.f2587b) == true) goto L15;
        return false;
    L15:
        if (this.f2588c == r52.f2588c) goto L18;
        return false;
    L18:
        if (this.f2589d == r52.f2589d) goto L21;
        return false;
    L21:
        if (this.f2590e == r52.f2590e) goto L24;
        return false;
    L24:
        if (this.f2591f == r52.f2591f) goto L26;
        return false;
    L26:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f2586a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f2587b, r0, 31);
        int r03 = AbstractC0213Ey.m403a(this.f2588c, r02, 31);
        int r2 = (Boolean.hashCode(this.f2589d) + r03) * 31;
        int r04 = AbstractC0213Ey.m403a(this.f2590e, r2, 31);
        return Integer.hashCode(this.f2591f) + r04;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-394797688813621L));
        AbstractC2374ph.m4817n(r0, this.f2586a, -394870703257653L);
        AbstractC2374ph.m4817n(r0, this.f2587b, -394909357963317L);
        AbstractC0213Ey.m418p(r0, this.f2588c, -394965192538165L);
        r0.append(this.f2589d);
        r0.append(AbstractC0295Gu.m625r(-395575077894197L));
        AbstractC0213Ey.m418p(r0, this.f2590e, -395652387305525L);
        return AbstractC0213Ey.m408f(r0, this.f2591f, ')');
    }
}
