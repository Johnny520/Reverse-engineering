package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bb0 {

    /* JADX INFO: renamed from: a */
    public final long f756a;

    public final boolean equals(Object obj) {
        if (obj instanceof bb0) {
            return this.f756a == ((bb0) obj).f756a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f756a);
    }

    public final String toString() {
        long j = this.f756a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) za0.m6405c(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) za0.m6405c(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
