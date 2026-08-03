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

    public C0755Ri(int i, String str, String str2) {
        AbstractC0295Gu.m625r(-77554224461877L);
        AbstractC0295Gu.m625r(-77579994265653L);
        this.f2392a = str;
        this.f2393b = str2;
        this.f2394c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0755Ri)) {
            return false;
        }
        C0755Ri c0755Ri = (C0755Ri) obj;
        return AbstractC0585Nj.m1134a(this.f2392a, c0755Ri.f2392a) && AbstractC0585Nj.m1134a(this.f2393b, c0755Ri.f2393b) && this.f2394c == c0755Ri.f2394c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2394c) + AbstractC2374ph.m4810g(this.f2393b, this.f2392a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-77648713742389L));
        AbstractC2374ph.m4817n(sb, this.f2392a, -77717433219125L);
        AbstractC2374ph.m4817n(sb, this.f2393b, -77751792957493L);
        return AbstractC0213Ey.m408f(sb, this.f2394c, ')');
    }
}
