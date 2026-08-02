package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nm2 implements Comparable {

    /* JADX INFO: renamed from: h */
    public int f7259h;

    /* JADX INFO: renamed from: i */
    public int f7260i;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7259h - ((nm2) obj).f7259h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Segment{start=");
        sb.append(this.f7259h);
        sb.append(", end=");
        return vi0.m5694m(sb, this.f7260i, '}');
    }
}
