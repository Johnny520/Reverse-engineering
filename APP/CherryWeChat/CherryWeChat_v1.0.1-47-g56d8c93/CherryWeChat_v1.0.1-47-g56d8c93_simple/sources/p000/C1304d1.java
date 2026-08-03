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

    public C1304d1(String r3, String r4, String r5, int r6) {
        AbstractC0295Gu.m625r(-813041604098101L);
        AbstractC0295Gu.m625r(-813054488999989L);
        AbstractC0295Gu.m625r(-812543387891765L);
        this.f4745a = r3;
        this.f4746b = r4;
        this.f4747c = r5;
        this.f4748d = r6;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1304d1) == true) goto L8;
        return false;
    L8:
        C1304d1 r52 = (C1304d1) r5;
        if (AbstractC0585Nj.m1134a(this.f4745a, r52.f4745a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f4746b, r52.f4746b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f4747c, r52.f4747c) == true) goto L18;
        return false;
    L18:
        if (this.f4748d == r52.f4748d) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f4745a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f4746b, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.f4747c, r02, 31);
        return Integer.hashCode(this.f4748d) + r03;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-812629287237685L));
        AbstractC2374ph.m4817n(r0, this.f4745a, -812676531877941L);
        AbstractC2374ph.m4817n(r0, this.f4746b, -812728071485493L);
        AbstractC2374ph.m4817n(r0, this.f4747c, -812758136256565L);
        return AbstractC0213Ey.m408f(r0, this.f4748d, ')');
    }
}
