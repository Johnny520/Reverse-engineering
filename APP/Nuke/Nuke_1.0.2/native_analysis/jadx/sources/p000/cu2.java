package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cu2 implements InterfaceC0273hd {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0273hd f1738a;

    /* JADX INFO: renamed from: b */
    public final long f1739b;

    public cu2(fj0 fj0Var, long j) {
        this.f1738a = fj0Var;
        this.f1739b = j;
    }

    @Override // p000.InterfaceC0273hd
    /* JADX INFO: renamed from: a */
    public final x93 mo512a(n43 n43Var) {
        return new du2(this.f1738a.mo512a(n43Var), this.f1739b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cu2)) {
            return false;
        }
        cu2 cu2Var = (cu2) obj;
        return cu2Var.f1739b == this.f1739b && t11.m5086l(cu2Var.f1738a, this.f1738a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1739b) + (this.f1738a.hashCode() * 31);
    }
}
