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

    public C1379eq(int i, String str, int i2, String str2, int i3) {
        AbstractC0295Gu.m625r(-809326457387061L);
        AbstractC0295Gu.m625r(-809352227190837L);
        this.f4918a = i;
        this.f4919b = str;
        this.f4920c = i2;
        this.f4921d = str2;
        this.f4922e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1379eq)) {
            return false;
        }
        C1379eq c1379eq = (C1379eq) obj;
        return this.f4918a == c1379eq.f4918a && AbstractC0585Nj.m1134a(this.f4919b, c1379eq.f4919b) && this.f4920c == c1379eq.f4920c && AbstractC0585Nj.m1134a(this.f4921d, c1379eq.f4921d) && this.f4922e == c1379eq.f4922e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4922e) + AbstractC2374ph.m4810g(this.f4921d, AbstractC0213Ey.m403a(this.f4920c, AbstractC2374ph.m4810g(this.f4919b, Integer.hashCode(this.f4918a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-809481076209717L));
        AbstractC0213Ey.m418p(sb, this.f4918a, -810086666598453L);
        AbstractC2374ph.m4817n(sb, this.f4919b, -810125321304117L);
        AbstractC0213Ey.m418p(sb, this.f4920c, -810181155878965L);
        AbstractC2374ph.m4817n(sb, this.f4921d, -810245580388405L);
        return AbstractC0213Ey.m408f(sb, this.f4922e, ')');
    }
}
