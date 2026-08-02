package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cv0 implements ht2 {
    public final yw0 h;
    public final tm0 i;
    public boolean j;
    public final /* synthetic */ iv0 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cv0(iv0 iv0Var, yw0 yw0Var) {
        yw0Var.getClass();
        this.k = iv0Var;
        this.h = yw0Var;
        this.i = new tm0(((o52) iv0Var.c.j).h.a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final o23 a() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(js0 js0Var) {
        et1 et1Var;
        sn snVar;
        js0Var.getClass();
        iv0 iv0Var = this.k;
        int i = iv0Var.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + iv0Var.d);
        }
        tm0 tm0Var = this.i;
        o23 o23Var = tm0Var.e;
        tm0Var.e = o23.d;
        o23Var.a();
        o23Var.b();
        iv0Var.d = 6;
        if (js0Var.size() <= 0 || (et1Var = iv0Var.a) == null || (snVar = et1Var.j) == null) {
            return;
        }
        sw0.b(snVar, this.h, js0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public long n(fn fnVar, long j) throws IOException {
        iv0 iv0Var = this.k;
        fnVar.getClass();
        try {
            return ((o52) iv0Var.c.j).n(fnVar, j);
        } catch (IOException e) {
            iv0Var.b.h();
            this.b(iv0.f);
            throw e;
        }
    }
}
