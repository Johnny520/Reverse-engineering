package p000;

/* JADX INFO: renamed from: DA */
/* JADX INFO: loaded from: classes.dex */
public final class C0140DA {

    /* JADX INFO: renamed from: a */
    public final String f364a;

    /* JADX INFO: renamed from: b */
    public final String f365b;

    /* JADX INFO: renamed from: c */
    public final String f366c;

    /* JADX INFO: renamed from: d */
    public final String f367d;

    /* JADX INFO: renamed from: e */
    public final long f368e;

    /* JADX INFO: renamed from: f */
    public final String f369f;

    public C0140DA(String r3, String r4, String r5, String r6, long r7, String r9) {
        AbstractC0295Gu.m625r(-740808844113973L);
        AbstractC0295Gu.m625r(-740821729015861L);
        AbstractC0295Gu.m625r(-740873268623413L);
        AbstractC0295Gu.m625r(-740911923329077L);
        AbstractC0295Gu.m625r(-740946283067445L);
        this.f364a = r3;
        this.f365b = r4;
        this.f366c = r5;
        this.f367d = r6;
        this.f368e = r7;
        this.f369f = r9;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C0140DA) == true) goto L8;
        return false;
    L8:
        C0140DA r82 = (C0140DA) r8;
        if (AbstractC0585Nj.m1134a(this.f364a, r82.f364a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f365b, r82.f365b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f366c, r82.f366c) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.f367d, r82.f367d) == true) goto L21;
        return false;
    L21:
        if (this.f368e == r82.f368e) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.f369f, r82.f369f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f364a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f365b, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.f366c, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.f367d, r03, 31);
        int r2 = (Long.hashCode(this.f368e) + r04) * 31;
        return this.f369f.hashCode() + r2;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-740619865552949L));
        AbstractC2374ph.m4817n(r0, this.f364a, -740692879996981L);
        AbstractC2374ph.m4817n(r0, this.f365b, -740757304506421L);
        AbstractC2374ph.m4817n(r0, this.f366c, -739159576672309L);
        AbstractC2374ph.m4817n(r0, this.f367d, -739206821312565L);
        r0.append(this.f368e);
        r0.append(AbstractC0295Gu.m625r(-739258360920117L));
        return AbstractC2374ph.m4815l(r0, this.f369f, ')');
    }
}
