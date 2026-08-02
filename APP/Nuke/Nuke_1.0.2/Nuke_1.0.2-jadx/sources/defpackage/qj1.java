package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 extends sj {
    public final rk1 i;
    public final ArrayList j;
    public final sk1 k;
    public final rk1 l;
    public final rl1 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qj1() {
        super(4);
        this.i = qp0.o();
        this.j = new ArrayList();
        sk1 sk1Var = fd2.a;
        this.k = new sk1();
        this.l = new rk1();
        s9 s9Var = new s9(13, this);
        ds2.e(ds2.a);
        synchronized (ds2.c) {
            ds2.h = du.y0(ds2.h, s9Var);
        }
        this.m = new rl1(s9Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final void c(ho2 ho2Var) {
        this.j.add(new oj1(ho2Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final void d() {
        synchronized (this.h) {
            try {
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    pj1 pj1Var = (pj1) arrayList.get(i);
                    if (pj1Var instanceof nj1) {
                        qp0.k(this.i, ((nj1) pj1Var).a, ((nj1) pj1Var).b);
                    } else {
                        if (!(pj1Var instanceof oj1)) {
                            throw new pv();
                        }
                        qp0.T(this.i, ((oj1) pj1Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.j.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final void e() {
        this.m.a();
        this.j.clear();
        this.l.a();
        synchronized (this.h) {
            this.i.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final in0 i(ho2 ho2Var) {
        rk1 rk1Var = this.l;
        in0 d2Var = (in0) rk1Var.g(ho2Var);
        if (d2Var == null) {
            d2Var = new d2(21, this, ho2Var);
            int iF = rk1Var.f(ho2Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = rk1Var.c;
            Object obj = objArr[iF];
            rk1Var.b[iF] = ho2Var;
            objArr[iF] = d2Var;
        }
        return d2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final void j(fq fqVar) {
        this.l.k(fqVar);
        c(fqVar);
        d();
    }
}
