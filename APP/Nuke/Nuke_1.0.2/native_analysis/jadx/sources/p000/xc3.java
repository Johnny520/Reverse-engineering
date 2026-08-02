package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xc3 {

    /* JADX INFO: renamed from: a */
    public final yc3 f12964a;

    /* JADX INFO: renamed from: b */
    public final wc3 f12965b;

    /* JADX INFO: renamed from: c */
    public final String f12966c;

    /* JADX INFO: renamed from: d */
    public final Throwable f12967d;

    public xc3(yc3 yc3Var, wc3 wc3Var, String str, Throwable th) {
        this.f12964a = yc3Var;
        this.f12965b = wc3Var;
        this.f12966c = str;
        this.f12967d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc3)) {
            return false;
        }
        xc3 xc3Var = (xc3) obj;
        return this.f12964a == xc3Var.f12964a && this.f12965b == xc3Var.f12965b && this.f12966c.equals(xc3Var.f12966c) && this.f12967d.equals(xc3Var.f12967d);
    }

    public final int hashCode() {
        return this.f12967d.hashCode() + hk1.m2207f(this.f12966c, (this.f12965b.hashCode() + (this.f12964a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Error(operation=" + this.f12964a + ", code=" + this.f12965b + ", message=" + this.f12966c + ", cause=" + this.f12967d + ")";
    }
}
