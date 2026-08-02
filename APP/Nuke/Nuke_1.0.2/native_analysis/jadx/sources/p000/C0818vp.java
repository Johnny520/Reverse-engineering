package p000;

/* JADX INFO: renamed from: vp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0818vp implements Comparable {

    /* JADX INFO: renamed from: h */
    public final r30 f12096h;

    /* JADX INFO: renamed from: i */
    public final int f12097i;

    public C0818vp(r30 r30Var, int i) {
        if (i < 0) {
            C0676s.m4651j("handler < 0");
            throw null;
        }
        this.f12097i = i;
        this.f12096h = r30Var;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0818vp c0818vp) {
        int i = c0818vp.f12097i;
        int i2 = this.f12097i;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f12096h.compareTo(c0818vp.f12096h);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0818vp) && compareTo((C0818vp) obj) == 0;
    }

    public final int hashCode() {
        return this.f12096h.hashCode() + (this.f12097i * 31);
    }
}
