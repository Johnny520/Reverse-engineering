package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dv0 implements fr2 {

    /* JADX INFO: renamed from: h */
    public final tm0 f2233h;

    /* JADX INFO: renamed from: i */
    public boolean f2234i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ iv0 f2235j;

    public dv0(iv0 iv0Var) {
        this.f2235j = iv0Var;
        this.f2233h = new tm0(((n52) iv0Var.f4801c.f564k).f7010h.mo1174a());
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: a */
    public final o23 mo1174a() {
        return this.f2233h;
    }

    @Override // p000.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f2234i) {
            return;
        }
        this.f2234i = true;
        ((n52) this.f2235j.f4801c.f564k).mo1696y("0\r\n\r\n");
        tm0 tm0Var = this.f2233h;
        o23 o23Var = tm0Var.f10844e;
        tm0Var.f10844e = o23.f7455d;
        o23Var.mo3473a();
        o23Var.mo3474b();
        this.f2235j.f4802d = 3;
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0209fn c0209fn, long j) {
        if (this.f2234i) {
            C0676s.m4653l("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        n52 n52Var = (n52) this.f2235j.f4801c.f564k;
        if (n52Var.f7012j) {
            C0676s.m4653l("closed");
            return;
        }
        n52Var.f7011i.m1672G(j);
        n52Var.m3250b();
        n52Var.mo1696y("\r\n");
        n52Var.mo1175d(c0209fn, j);
        n52Var.mo1696y("\r\n");
    }

    @Override // p000.fr2, java.io.Flushable
    public final synchronized void flush() {
        if (this.f2234i) {
            return;
        }
        ((n52) this.f2235j.f4801c.f564k).flush();
    }
}
