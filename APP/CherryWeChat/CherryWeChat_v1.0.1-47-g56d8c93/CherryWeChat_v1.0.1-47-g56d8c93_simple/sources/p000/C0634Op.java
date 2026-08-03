package p000;

/* JADX INFO: renamed from: Op */
/* JADX INFO: loaded from: classes.dex */
public final class C0634Op {

    /* JADX INFO: renamed from: a */
    public final String f2029a;

    /* JADX INFO: renamed from: b */
    public final String f2030b;

    /* JADX INFO: renamed from: c */
    public final String f2031c;

    public C0634Op(String r3, String r4, String r5) {
        AbstractC0295Gu.m625r(-130184753707061L);
        AbstractC0295Gu.m625r(-130206228543541L);
        AbstractC0295Gu.m625r(-130227703380021L);
        this.f2029a = r3;
        this.f2030b = r4;
        this.f2031c = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0634Op) == true) goto L8;
        return false;
    L8:
        C0634Op r52 = (C0634Op) r5;
        if (AbstractC0585Nj.m1134a(this.f2029a, r52.f2029a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f2030b, r52.f2030b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f2031c, r52.f2031c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f2029a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f2030b, r0, 31);
        return this.f2031c.hashCode() + r02;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-129763846912053L));
        AbstractC2374ph.m4817n(r0, this.f2029a, -129849746257973L);
        AbstractC2374ph.m4817n(r0, this.f2030b, -129884105996341L);
        return AbstractC2374ph.m4815l(r0, this.f2031c, ')');
    }
}
