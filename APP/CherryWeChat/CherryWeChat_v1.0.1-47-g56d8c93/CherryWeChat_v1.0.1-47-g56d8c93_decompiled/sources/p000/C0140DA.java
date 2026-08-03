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

    public C0140DA(String str, String str2, String str3, String str4, long j, String str5) {
        AbstractC0295Gu.m625r(-740808844113973L);
        AbstractC0295Gu.m625r(-740821729015861L);
        AbstractC0295Gu.m625r(-740873268623413L);
        AbstractC0295Gu.m625r(-740911923329077L);
        AbstractC0295Gu.m625r(-740946283067445L);
        this.f364a = str;
        this.f365b = str2;
        this.f366c = str3;
        this.f367d = str4;
        this.f368e = j;
        this.f369f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0140DA)) {
            return false;
        }
        C0140DA c0140da = (C0140DA) obj;
        return AbstractC0585Nj.m1134a(this.f364a, c0140da.f364a) && AbstractC0585Nj.m1134a(this.f365b, c0140da.f365b) && AbstractC0585Nj.m1134a(this.f366c, c0140da.f366c) && AbstractC0585Nj.m1134a(this.f367d, c0140da.f367d) && this.f368e == c0140da.f368e && AbstractC0585Nj.m1134a(this.f369f, c0140da.f369f);
    }

    public final int hashCode() {
        return this.f369f.hashCode() + ((Long.hashCode(this.f368e) + AbstractC2374ph.m4810g(this.f367d, AbstractC2374ph.m4810g(this.f366c, AbstractC2374ph.m4810g(this.f365b, this.f364a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-740619865552949L));
        AbstractC2374ph.m4817n(sb, this.f364a, -740692879996981L);
        AbstractC2374ph.m4817n(sb, this.f365b, -740757304506421L);
        AbstractC2374ph.m4817n(sb, this.f366c, -739159576672309L);
        AbstractC2374ph.m4817n(sb, this.f367d, -739206821312565L);
        sb.append(this.f368e);
        sb.append(AbstractC0295Gu.m625r(-739258360920117L));
        return AbstractC2374ph.m4815l(sb, this.f369f, ')');
    }
}
