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

    public C0798Si(AbstractC1101Zk abstractC1101Zk, String str, String str2) {
        AbstractC0295Gu.m625r(-77790447663157L);
        AbstractC0295Gu.m625r(-76162655057973L);
        AbstractC0295Gu.m625r(-76218489632821L);
        this.f2500a = abstractC1101Zk;
        this.f2501b = str;
        this.f2502c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0798Si)) {
            return false;
        }
        C0798Si c0798Si = (C0798Si) obj;
        return AbstractC0585Nj.m1134a(this.f2500a, c0798Si.f2500a) && AbstractC0585Nj.m1134a(this.f2501b, c0798Si.f2501b) && AbstractC0585Nj.m1134a(this.f2502c, c0798Si.f2502c);
    }

    public final int hashCode() {
        return this.f2502c.hashCode() + AbstractC2374ph.m4810g(this.f2501b, this.f2500a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-76416058128437L));
        sb.append(this.f2500a);
        sb.append(AbstractC0295Gu.m625r(-75930726823989L));
        AbstractC2374ph.m4817n(sb, this.f2501b, -75999446300725L);
        return AbstractC2374ph.m4815l(sb, this.f2502c, ')');
    }
}
