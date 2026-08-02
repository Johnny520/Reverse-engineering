package p000;

/* JADX INFO: renamed from: df */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0128df implements InterfaceC0201ff {

    /* JADX INFO: renamed from: a */
    public final C0473mt f2014a;

    public C0128df(C0473mt c0473mt) {
        c0473mt.getClass();
        this.f2014a = c0473mt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0128df) && t11.m5086l(this.f2014a, ((C0128df) obj).f2014a);
    }

    public final int hashCode() {
        return this.f2014a.hashCode();
    }

    public final String toString() {
        return "Complete(update=" + this.f2014a + ")";
    }
}
