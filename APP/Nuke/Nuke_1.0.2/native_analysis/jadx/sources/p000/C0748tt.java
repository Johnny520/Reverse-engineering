package p000;

/* JADX INFO: renamed from: tt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0748tt {

    /* JADX INFO: renamed from: a */
    public final float f10957a;

    public C0748tt(float f) {
        this.f10957a = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0748tt)) {
            return false;
        }
        float f = this.f10957a;
        return (0.0f > f && 0.0f > ((C0748tt) obj).f10957a) || f == ((C0748tt) obj).f10957a;
    }

    public final int hashCode() {
        float f = this.f10957a;
        if (0.0f > f) {
            return -1;
        }
        return Float.hashCode(f) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.f10957a;
    }
}
