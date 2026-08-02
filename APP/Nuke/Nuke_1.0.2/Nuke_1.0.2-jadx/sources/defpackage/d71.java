package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d71 implements fw2 {
    public final ak1 a;
    public final /* synthetic */ f71 b;
    public final /* synthetic */ Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d71(f71 f71Var, Object obj) {
        this.b = f71Var;
        this.c = obj;
        int[] iArr = g11.a;
        this.a = new ak1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fw2
    public final void a() {
        f71.b(this.b, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fw2
    public final int b() {
        r61 r61Var = (r61) this.b.q.g(this.c);
        if (r61Var != null) {
            return ((zk1) ((jk1) r61Var.n()).i).j;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fw2
    public final void c(long j, int i) {
        f71 f71Var = this.b;
        r61 r61Var = (r61) f71Var.q.g(this.c);
        if (r61Var == null || !r61Var.H()) {
            return;
        }
        int i2 = ((zk1) ((jk1) r61Var.n()).i).j;
        if (i < 0 || i >= i2) {
            kz0.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (r61Var.I()) {
            kz0.a("Pre-measure called on node that is not placed");
        }
        r61 r61Var2 = f71Var.h;
        r61Var2.x = true;
        ((b7) u61.a(r61Var)).w((r61) ((jk1) r61Var.n()).get(i), j);
        r61Var2.x = false;
        this.a.a(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fw2
    public final void d(v vVar) {
        vn1 vn1Var;
        r61 r61Var = (r61) this.b.q.g(this.c);
        th1 th1Var = (r61Var == null || (vn1Var = r61Var.M) == null) ? null : (th1) vn1Var.g;
        if (th1Var == null || !th1Var.u) {
            return;
        }
        tb3.e(th1Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", vVar);
    }
}
