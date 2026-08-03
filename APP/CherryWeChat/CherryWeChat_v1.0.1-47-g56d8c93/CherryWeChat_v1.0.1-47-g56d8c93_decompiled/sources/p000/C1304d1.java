package p000;

/* JADX INFO: renamed from: d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1304d1 {

    /* JADX INFO: renamed from: a */
    public final String f4745a;

    /* JADX INFO: renamed from: b */
    public final String f4746b;

    /* JADX INFO: renamed from: c */
    public final String f4747c;

    /* JADX INFO: renamed from: d */
    public final int f4748d;

    public C1304d1(String str, String str2, String str3, int i) {
        AbstractC0295Gu.m625r(-813041604098101L);
        AbstractC0295Gu.m625r(-813054488999989L);
        AbstractC0295Gu.m625r(-812543387891765L);
        this.f4745a = str;
        this.f4746b = str2;
        this.f4747c = str3;
        this.f4748d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1304d1)) {
            return false;
        }
        C1304d1 c1304d1 = (C1304d1) obj;
        return AbstractC0585Nj.m1134a(this.f4745a, c1304d1.f4745a) && AbstractC0585Nj.m1134a(this.f4746b, c1304d1.f4746b) && AbstractC0585Nj.m1134a(this.f4747c, c1304d1.f4747c) && this.f4748d == c1304d1.f4748d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4748d) + AbstractC2374ph.m4810g(this.f4747c, AbstractC2374ph.m4810g(this.f4746b, this.f4745a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-812629287237685L));
        AbstractC2374ph.m4817n(sb, this.f4745a, -812676531877941L);
        AbstractC2374ph.m4817n(sb, this.f4746b, -812728071485493L);
        AbstractC2374ph.m4817n(sb, this.f4747c, -812758136256565L);
        return AbstractC0213Ey.m408f(sb, this.f4748d, ')');
    }
}
