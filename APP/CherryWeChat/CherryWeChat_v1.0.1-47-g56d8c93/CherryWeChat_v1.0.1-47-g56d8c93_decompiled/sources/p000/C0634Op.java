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

    public C0634Op(String str, String str2, String str3) {
        AbstractC0295Gu.m625r(-130184753707061L);
        AbstractC0295Gu.m625r(-130206228543541L);
        AbstractC0295Gu.m625r(-130227703380021L);
        this.f2029a = str;
        this.f2030b = str2;
        this.f2031c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0634Op)) {
            return false;
        }
        C0634Op c0634Op = (C0634Op) obj;
        return AbstractC0585Nj.m1134a(this.f2029a, c0634Op.f2029a) && AbstractC0585Nj.m1134a(this.f2030b, c0634Op.f2030b) && AbstractC0585Nj.m1134a(this.f2031c, c0634Op.f2031c);
    }

    public final int hashCode() {
        return this.f2031c.hashCode() + AbstractC2374ph.m4810g(this.f2030b, this.f2029a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-129763846912053L));
        AbstractC2374ph.m4817n(sb, this.f2029a, -129849746257973L);
        AbstractC2374ph.m4817n(sb, this.f2030b, -129884105996341L);
        return AbstractC2374ph.m4815l(sb, this.f2031c, ')');
    }
}
