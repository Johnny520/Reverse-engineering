package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mn1 {

    /* JADX INFO: renamed from: a */
    public final boolean f6732a;

    public mn1(boolean z) {
        this.f6732a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn1) && this.f6732a == ((mn1) obj).f6732a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6732a);
    }

    public final String toString() {
        return "NetworkAuthorization(allowsPrivateNetwork=" + this.f6732a + ")";
    }
}
