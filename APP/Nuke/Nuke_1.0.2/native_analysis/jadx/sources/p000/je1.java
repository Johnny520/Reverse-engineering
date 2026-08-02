package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class je1 implements g22 {

    /* JADX INFO: renamed from: h */
    public final C0485n4 f4996h;

    /* JADX INFO: renamed from: i */
    public h11 f4997i;

    /* JADX INFO: renamed from: j */
    public d61 f4998j;

    /* JADX INFO: renamed from: k */
    public h11 f4999k;

    /* JADX INFO: renamed from: l */
    public z01 f5000l;

    public je1(C0485n4 c0485n4) {
        this.f4996h = c0485n4;
    }

    @Override // p000.g22
    /* JADX INFO: renamed from: a */
    public final long mo1788a(d11 d11Var, long j, d61 d61Var, long j2) {
        z01 z01Var = this.f5000l;
        if (z01Var != null) {
            h11 h11Var = this.f4997i;
            if ((h11Var == null ? false : h11.m2041a(h11Var.f3775a, j)) && this.f4998j == d61Var) {
                h11 h11Var2 = this.f4999k;
                if (h11Var2 != null ? h11.m2041a(h11Var2.f3775a, j2) : false) {
                    return z01Var.f13695a;
                }
            }
        }
        long jMo1788a = this.f4996h.mo1788a(d11Var, j, d61Var, j2);
        this.f4997i = new h11(j);
        this.f4998j = d61Var;
        this.f4999k = new h11(j2);
        this.f5000l = new z01(jMo1788a);
        return jMo1788a;
    }
}
