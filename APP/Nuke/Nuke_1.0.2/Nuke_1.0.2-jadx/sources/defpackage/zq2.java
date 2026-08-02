package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zq2 extends sj {
    public Object i;
    public Object j;
    public sk1 k;
    public sk1 l;
    public ho2 m;
    public final xq2 n;
    public final rl1 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zq2() {
        super(4);
        this.n = new xq2(1, this);
        s9 s9Var = new s9(19, this);
        ds2.e(ds2.a);
        synchronized (ds2.c) {
            ds2.h = du.y0(ds2.h, s9Var);
        }
        this.o = new rl1(s9Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final void c(ho2 ho2Var) {
        this.j = null;
        this.l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final void d() {
        synchronized (this.h) {
            try {
                this.i = this.j;
                if (this.l == null) {
                    this.k = null;
                } else {
                    if (this.k == null) {
                        sk1 sk1Var = fd2.a;
                        this.k = new sk1();
                    }
                    sk1 sk1Var2 = this.k;
                    this.k = this.l;
                    this.l = sk1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final void e() {
        this.o.a();
        this.j = null;
        this.l = null;
        synchronized (this.h) {
            this.m = null;
            this.i = null;
            this.k = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final in0 i(ho2 ho2Var) {
        ho2 ho2Var2 = this.m;
        if (ho2Var2 != null && !ho2Var2.equals(ho2Var)) {
            j22.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.m = ho2Var;
        return this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sj
    public final void j(fq fqVar) {
        this.m = null;
        this.j = null;
        this.l = null;
        d();
    }
}
