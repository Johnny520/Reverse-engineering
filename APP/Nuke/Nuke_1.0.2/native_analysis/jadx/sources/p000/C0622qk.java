package p000;

/* JADX INFO: renamed from: qk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0622qk {

    /* JADX INFO: renamed from: a */
    public final float f9011a;

    public C0622qk(float f) {
        this.f9011a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0622qk) && Float.compare(this.f9011a, ((C0622qk) obj).f9011a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9011a);
    }

    public final String toString() {
        return vi0.m5693l(new StringBuilder("Vertical(bias="), this.f9011a, ')');
    }
}
