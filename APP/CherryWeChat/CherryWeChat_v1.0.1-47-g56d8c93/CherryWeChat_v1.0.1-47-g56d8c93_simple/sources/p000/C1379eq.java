package p000;

/* JADX INFO: renamed from: eq */
/* JADX INFO: loaded from: classes.dex */
public final class C1379eq {

    /* JADX INFO: renamed from: a */
    public final int f4918a;

    /* JADX INFO: renamed from: b */
    public final String f4919b;

    /* JADX INFO: renamed from: c */
    public final int f4920c;

    /* JADX INFO: renamed from: d */
    public final String f4921d;

    /* JADX INFO: renamed from: e */
    public final int f4922e;

    public C1379eq(int r3, String r4, int r5, String r6, int r7) {
        AbstractC0295Gu.m625r(-809326457387061L);
        AbstractC0295Gu.m625r(-809352227190837L);
        this.f4918a = r3;
        this.f4919b = r4;
        this.f4920c = r5;
        this.f4921d = r6;
        this.f4922e = r7;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C1379eq) == false) goto L25;
        C1379eq r32 = (C1379eq) r3;
        if (this.f4918a == r32.f4918a) goto L11;
        return false;
    L11:
        if (AbstractC0585Nj.m1134a(this.f4919b, r32.f4919b) == true) goto L14;
        return false;
    L14:
        if (this.f4920c == r32.f4920c) goto L17;
        return false;
    L17:
        if (AbstractC0585Nj.m1134a(this.f4921d, r32.f4921d) == true) goto L20;
        return false;
    L20:
        if (this.f4922e == r32.f4922e) goto L23;
        return false;
    L23:
        return true;
    L25:
        return false;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.f4918a) * 31;
        int r02 = AbstractC2374ph.m4810g(this.f4919b, r0, 31);
        int r03 = AbstractC0213Ey.m403a(this.f4920c, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.f4921d, r03, 31);
        return Integer.hashCode(this.f4922e) + r04;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-809481076209717L));
        AbstractC0213Ey.m418p(r0, this.f4918a, -810086666598453L);
        AbstractC2374ph.m4817n(r0, this.f4919b, -810125321304117L);
        AbstractC0213Ey.m418p(r0, this.f4920c, -810181155878965L);
        AbstractC2374ph.m4817n(r0, this.f4921d, -810245580388405L);
        return AbstractC0213Ey.m408f(r0, this.f4922e, ')');
    }
}
