package p000;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2171l0 {

    /* JADX INFO: renamed from: a */
    public final String f7562a;

    /* JADX INFO: renamed from: b */
    public final String f7563b;

    /* JADX INFO: renamed from: c */
    public final String f7564c;

    public C2171l0(String r3, String r4, String r5) {
        AbstractC0295Gu.m625r(-411822939174965L);
        AbstractC0295Gu.m625r(-411861593880629L);
        AbstractC0295Gu.m625r(-411887363684405L);
        this.f7562a = r3;
        this.f7563b = r4;
        this.f7564c = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2171l0) == true) goto L8;
        return false;
    L8:
        C2171l0 r52 = (C2171l0) r5;
        if (AbstractC0585Nj.m1134a(this.f7562a, r52.f7562a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f7563b, r52.f7563b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f7564c, r52.f7564c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f7562a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f7563b, r0, 31);
        return this.f7564c.hashCode() + r02;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-412029097605173L));
        AbstractC2374ph.m4817n(r0, this.f7562a, -410474319444021L);
        AbstractC2374ph.m4817n(r0, this.f7563b, -410512974149685L);
        return AbstractC2374ph.m4815l(r0, this.f7564c, ')');
    }
}
