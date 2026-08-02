package p000;

/* JADX INFO: renamed from: xj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0888xj {

    /* JADX INFO: renamed from: a */
    public final float f13048a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0888xj) {
            return Float.compare(this.f13048a, ((C0888xj) obj).f13048a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13048a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f13048a + ')';
    }
}
