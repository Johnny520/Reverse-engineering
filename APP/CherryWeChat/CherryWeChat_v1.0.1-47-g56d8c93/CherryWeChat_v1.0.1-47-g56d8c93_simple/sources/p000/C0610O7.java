package p000;

/* JADX INFO: renamed from: O7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0610O7 {

    /* JADX INFO: renamed from: a */
    public final int f1954a;

    /* JADX INFO: renamed from: b */
    public final String f1955b;

    /* JADX INFO: renamed from: c */
    public boolean f1956c;

    public C0610O7(int r3, String r4, boolean r5) {
        AbstractC0295Gu.m625r(-251655018772533L);
        this.f1954a = r3;
        this.f1955b = r4;
        this.f1956c = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0610O7) == true) goto L8;
        return false;
    L8:
        C0610O7 r52 = (C0610O7) r5;
        if (this.f1954a == r52.f1954a) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f1955b, r52.f1955b) == true) goto L15;
        return false;
    L15:
        if (this.f1956c == r52.f1956c) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.f1954a) * 31;
        int r02 = AbstractC2374ph.m4810g(this.f1955b, r0, 31);
        return Boolean.hashCode(this.f1956c) + r02;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-251706558380085L));
        AbstractC0213Ey.m418p(r0, this.f1954a, -251264176748597L);
        AbstractC2374ph.m4817n(r0, this.f1955b, -251302831454261L);
        r0.append(this.f1956c);
        r0.append(')');
        return r0.toString();
    }
}
