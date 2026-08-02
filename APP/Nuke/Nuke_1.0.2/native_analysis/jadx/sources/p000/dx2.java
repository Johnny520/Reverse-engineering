package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dx2 {

    /* JADX INFO: renamed from: a */
    public final Class f2255a;

    /* JADX INFO: renamed from: b */
    public final Class f2256b;

    public dx2(Class cls, Class cls2) {
        this.f2255a = cls;
        this.f2256b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx2)) {
            return false;
        }
        dx2 dx2Var = (dx2) obj;
        return this.f2255a.equals(dx2Var.f2255a) && this.f2256b.equals(dx2Var.f2256b);
    }

    public final int hashCode() {
        return this.f2256b.hashCode() + (this.f2255a.hashCode() * 31);
    }

    public final String toString() {
        return "QuoteMethodKey(footerClass=" + this.f2255a + ", messageClass=" + this.f2256b + ")";
    }
}
