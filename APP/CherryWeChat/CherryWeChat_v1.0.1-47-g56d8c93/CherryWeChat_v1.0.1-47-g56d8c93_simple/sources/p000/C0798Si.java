package p000;

/* JADX INFO: renamed from: Si */
/* JADX INFO: loaded from: classes.dex */
public final class C0798Si {

    /* JADX INFO: renamed from: a */
    public final AbstractC1101Zk f2500a;

    /* JADX INFO: renamed from: b */
    public final String f2501b;

    /* JADX INFO: renamed from: c */
    public final String f2502c;

    public C0798Si(AbstractC1101Zk r3, String r4, String r5) {
        AbstractC0295Gu.m625r(-77790447663157L);
        AbstractC0295Gu.m625r(-76162655057973L);
        AbstractC0295Gu.m625r(-76218489632821L);
        this.f2500a = r3;
        this.f2501b = r4;
        this.f2502c = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0798Si) == true) goto L8;
        return false;
    L8:
        C0798Si r52 = (C0798Si) r5;
        if (AbstractC0585Nj.m1134a(this.f2500a, r52.f2500a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f2501b, r52.f2501b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f2502c, r52.f2502c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f2500a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f2501b, r0, 31);
        return this.f2502c.hashCode() + r02;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-76416058128437L));
        r0.append(this.f2500a);
        r0.append(AbstractC0295Gu.m625r(-75930726823989L));
        AbstractC2374ph.m4817n(r0, this.f2501b, -75999446300725L);
        return AbstractC2374ph.m4815l(r0, this.f2502c, ')');
    }
}
