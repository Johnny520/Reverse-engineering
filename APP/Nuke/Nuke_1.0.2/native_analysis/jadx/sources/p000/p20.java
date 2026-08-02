package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p20 {

    /* JADX INFO: renamed from: a */
    public final Class f7931a;

    public p20(Class cls) {
        this.f7931a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p20) && this.f7931a.equals(((p20) obj).f7931a);
    }

    public final int hashCode() {
        return this.f7931a.hashCode();
    }

    public final String toString() {
        return "Runtime(type=" + this.f7931a + ")";
    }
}
