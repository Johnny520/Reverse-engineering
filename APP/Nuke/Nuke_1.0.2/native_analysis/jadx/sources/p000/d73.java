package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d73 implements Comparable {

    /* JADX INFO: renamed from: h */
    public final int f1902h;

    public /* synthetic */ d73(int i) {
        this.f1902h = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return t11.m5089o(this.f1902h ^ Integer.MIN_VALUE, ((d73) obj).f1902h ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d73) {
            return this.f1902h == ((d73) obj).f1902h;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1902h);
    }

    public final String toString() {
        return String.valueOf(((long) this.f1902h) & 4294967295L);
    }
}
