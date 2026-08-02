package p000;

/* JADX INFO: renamed from: rp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0664rp {

    /* JADX INFO: renamed from: a */
    public e70 f9665a;

    /* JADX INFO: renamed from: b */
    public d61 f9666b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0627qp f9667c;

    /* JADX INFO: renamed from: d */
    public long f9668d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0664rp)) {
            return false;
        }
        C0664rp c0664rp = (C0664rp) obj;
        return t11.m5086l(this.f9665a, c0664rp.f9665a) && this.f9666b == c0664rp.f9666b && t11.m5086l(this.f9667c, c0664rp.f9667c) && gr2.m2019a(this.f9668d, c0664rp.f9668d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f9668d) + ((this.f9667c.hashCode() + ((this.f9666b.hashCode() + (this.f9665a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f9665a + ", layoutDirection=" + this.f9666b + ", canvas=" + this.f9667c + ", size=" + ((Object) gr2.m2022d(this.f9668d)) + ')';
    }
}
