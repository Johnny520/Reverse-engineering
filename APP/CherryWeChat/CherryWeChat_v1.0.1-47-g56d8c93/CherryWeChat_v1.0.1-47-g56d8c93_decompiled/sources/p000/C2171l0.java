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

    public C2171l0(String str, String str2, String str3) {
        AbstractC0295Gu.m625r(-411822939174965L);
        AbstractC0295Gu.m625r(-411861593880629L);
        AbstractC0295Gu.m625r(-411887363684405L);
        this.f7562a = str;
        this.f7563b = str2;
        this.f7564c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2171l0)) {
            return false;
        }
        C2171l0 c2171l0 = (C2171l0) obj;
        return AbstractC0585Nj.m1134a(this.f7562a, c2171l0.f7562a) && AbstractC0585Nj.m1134a(this.f7563b, c2171l0.f7563b) && AbstractC0585Nj.m1134a(this.f7564c, c2171l0.f7564c);
    }

    public final int hashCode() {
        return this.f7564c.hashCode() + AbstractC2374ph.m4810g(this.f7563b, this.f7562a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-412029097605173L));
        AbstractC2374ph.m4817n(sb, this.f7562a, -410474319444021L);
        AbstractC2374ph.m4817n(sb, this.f7563b, -410512974149685L);
        return AbstractC2374ph.m4815l(sb, this.f7564c, ')');
    }
}
