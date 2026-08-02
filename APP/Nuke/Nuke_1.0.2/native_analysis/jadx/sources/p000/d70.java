package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d70 {

    /* JADX INFO: renamed from: a */
    public int f1897a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d70) && this.f1897a == ((d70) obj).f1897a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1897a);
    }

    public final String toString() {
        return vi0.m5694m(new StringBuilder("DeltaCounter(count="), this.f1897a, ')');
    }
}
