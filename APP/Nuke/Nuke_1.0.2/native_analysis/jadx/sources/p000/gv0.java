package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gv0 implements fr2 {

    /* JADX INFO: renamed from: h */
    public final tm0 f3707h;

    /* JADX INFO: renamed from: i */
    public boolean f3708i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ iv0 f3709j;

    public gv0(iv0 iv0Var) {
        this.f3709j = iv0Var;
        this.f3707h = new tm0(((n52) iv0Var.f4801c.f564k).f7010h.mo1174a());
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: a */
    public final o23 mo1174a() {
        return this.f3707h;
    }

    @Override // p000.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3708i) {
            return;
        }
        this.f3708i = true;
        tm0 tm0Var = this.f3707h;
        o23 o23Var = tm0Var.f10844e;
        tm0Var.f10844e = o23.f7455d;
        o23Var.mo3473a();
        o23Var.mo3474b();
        this.f3709j.f4802d = 3;
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0209fn c0209fn, long j) {
        if (this.f3708i) {
            C0676s.m4653l("closed");
        } else {
            ug3.m5493a(c0209fn.f3068i, 0L, j);
            ((n52) this.f3709j.f4801c.f564k).mo1175d(c0209fn, j);
        }
    }

    @Override // p000.fr2, java.io.Flushable
    public final void flush() {
        if (this.f3708i) {
            return;
        }
        ((n52) this.f3709j.f4801c.f564k).flush();
    }
}
