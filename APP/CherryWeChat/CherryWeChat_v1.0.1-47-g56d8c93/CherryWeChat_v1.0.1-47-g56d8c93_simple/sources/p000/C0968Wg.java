package p000;

/* JADX INFO: renamed from: Wg */
/* JADX INFO: loaded from: classes.dex */
public final class C0968Wg {

    /* JADX INFO: renamed from: a */
    public final String f3016a;

    /* JADX INFO: renamed from: b */
    public final String f3017b;

    /* JADX INFO: renamed from: c */
    public boolean f3018c;

    public C0968Wg(String r3, String r4) {
        AbstractC0295Gu.m625r(-812792495994933L);
        AbstractC0295Gu.m625r(-813380906514485L);
        this.f3016a = r3;
        this.f3017b = r4;
        this.f3018c = false;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0968Wg) == true) goto L8;
        return false;
    L8:
        C0968Wg r52 = (C0968Wg) r5;
        if (AbstractC0585Nj.m1134a(this.f3016a, r52.f3016a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f3017b, r52.f3017b) == true) goto L15;
        return false;
    L15:
        if (this.f3018c == r52.f3018c) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f3016a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f3017b, r0, 31);
        return Boolean.hashCode(this.f3018c) + r02;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-813479690762293L));
        AbstractC2374ph.m4817n(r0, this.f3016a, -813557000173621L);
        AbstractC2374ph.m4817n(r0, this.f3017b, -813599949846581L);
        r0.append(this.f3018c);
        r0.append(')');
        return r0.toString();
    }
}
