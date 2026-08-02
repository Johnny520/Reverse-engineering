package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o30 extends AbstractC0147dz {

    /* JADX INFO: renamed from: h */
    public final q30 f7459h;

    /* JADX INFO: renamed from: i */
    public final q30 f7460i;

    static {
        new o30(new q30("TYPE"), new q30("Ljava/lang/Class;"));
    }

    public o30(q30 q30Var, q30 q30Var2) {
        this.f7459h = q30Var;
        this.f7460i = q30Var2;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return this.f7459h.mo23b() + ':' + this.f7460i.mo23b();
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: e */
    public final int mo626e(AbstractC0147dz abstractC0147dz) {
        o30 o30Var = (o30) abstractC0147dz;
        int iCompareTo = this.f7459h.compareTo(o30Var.f7459h);
        return iCompareTo != 0 ? iCompareTo : this.f7460i.compareTo(o30Var.f7460i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o30)) {
            return false;
        }
        o30 o30Var = (o30) obj;
        return this.f7459h.equals(o30Var.f7459h) && this.f7460i.equals(o30Var.f7460i);
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: f */
    public final String mo24f() {
        return "nat";
    }

    public final int hashCode() {
        return this.f7460i.f8714h.hashCode() ^ (this.f7459h.f8714h.hashCode() * 31);
    }

    public final String toString() {
        return "nat{" + mo23b() + '}';
    }
}
