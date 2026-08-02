package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gv0 implements fr2 {
    public final tm0 h;
    public boolean i;
    public final /* synthetic */ iv0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gv0(iv0 iv0Var) {
        this.j = iv0Var;
        this.h = new tm0(((n52) iv0Var.c.k).h.a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final o23 a() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        tm0 tm0Var = this.h;
        o23 o23Var = tm0Var.e;
        tm0Var.e = o23.d;
        o23Var.a();
        o23Var.b();
        this.j.d = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final void d(fn fnVar, long j) {
        if (this.i) {
            s.l("closed");
        } else {
            ug3.a(fnVar.i, 0L, j);
            ((n52) this.j.c.k).d(fnVar, j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2, java.io.Flushable
    public final void flush() {
        if (this.i) {
            return;
        }
        ((n52) this.j.c.k).flush();
    }
}
