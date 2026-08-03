package p000;

/* JADX INFO: renamed from: Ri */
/* JADX INFO: loaded from: classes.dex */
public final class C0755Ri {

    /* JADX INFO: renamed from: a */
    public final String f2392a;

    /* JADX INFO: renamed from: b */
    public final String f2393b;

    /* JADX INFO: renamed from: c */
    public final int f2394c;

    public C0755Ri(int r3, String r4, String r5) {
        AbstractC0295Gu.m625r(-77554224461877L);
        AbstractC0295Gu.m625r(-77579994265653L);
        this.f2392a = r4;
        this.f2393b = r5;
        this.f2394c = r3;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C0755Ri) == false) goto L19;
        C0755Ri r32 = (C0755Ri) r3;
        if (AbstractC0585Nj.m1134a(this.f2392a, r32.f2392a) == true) goto L11;
        return false;
    L11:
        if (AbstractC0585Nj.m1134a(this.f2393b, r32.f2393b) == true) goto L14;
        return false;
    L14:
        if (this.f2394c == r32.f2394c) goto L17;
        return false;
    L17:
        return true;
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f2392a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f2393b, r0, 31);
        return Integer.hashCode(this.f2394c) + r02;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-77648713742389L));
        AbstractC2374ph.m4817n(r0, this.f2392a, -77717433219125L);
        AbstractC2374ph.m4817n(r0, this.f2393b, -77751792957493L);
        return AbstractC0213Ey.m408f(r0, this.f2394c, ')');
    }
}
