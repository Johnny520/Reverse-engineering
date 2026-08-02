package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hi1 {

    /* JADX INFO: renamed from: a */
    public final long f4032a;

    public final boolean equals(Object obj) {
        if (obj instanceof hi1) {
            return this.f4032a == ((hi1) obj).f4032a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4032a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f4032a + ')';
    }
}
