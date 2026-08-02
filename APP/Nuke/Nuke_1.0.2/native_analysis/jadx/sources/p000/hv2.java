package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hv2 implements InterfaceC0539od {

    /* JADX INFO: renamed from: a */
    public final String f4144a;

    public final boolean equals(Object obj) {
        if (obj instanceof hv2) {
            return this.f4144a.equals(((hv2) obj).f4144a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4144a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f4144a + ')';
    }
}
